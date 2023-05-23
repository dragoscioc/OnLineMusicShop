package onlinemusicshop.controller;

import onlinemusicshop.controller.dto.UserRegistrationDTO;
import onlinemusicshop.model.User;
import onlinemusicshop.model.enums.UserRole;
import onlinemusicshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class AdminRegistrationController {
    private final UserService userService;

    public AdminRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin-register")
    public String showAdminRegisterPage() {
        return "admin-register";
    }
    @ModelAttribute("user")
    public UserRegistrationDTO userRegistrationDto() {
        return new UserRegistrationDTO();
    }
    @PostMapping("/admin-register")
    public String registerClientAccount(
            @ModelAttribute("user")
            @Valid UserRegistrationDTO userRegistrationDTO,
            BindingResult bindingResult
    ) {
        Optional<User> userOptional = userService.findByEmail(userRegistrationDTO.getEmail());
        if (userOptional.isPresent()) {
            bindingResult.rejectValue("email", null, "Email already exists");
        }
        if (bindingResult.hasErrors()) {
            return "admin-register";
        }
        userService.createUser(
                userRegistrationDTO.getEmail(),
                userRegistrationDTO.getPassword(),
                UserRole.ADMIN
        );
        return "redirect:/admin-register?success";
    }
}

package onlinemusicshop.controller;

import onlinemusicshop.Service.UserService;
import onlinemusicshop.controller.dto.UserRegistrationDTO;
import onlinemusicshop.model.User;
import onlinemusicshop.model.enums.UserRole;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ClientRegistrationController {
    private final UserService userService;

    public ClientRegistrationController(UserService userService) {
        this.userService = userService;
    }
    @ModelAttribute("user")
    public UserRegistrationDTO userRegistrationDto(){
     return new UserRegistrationDTO();
    }
    @GetMapping("/client-register")
    public String showClientRegisterPage(){
        return "client-register";
    }
    @PostMapping("/client-register")
    public String registerClientAccount(
            @ModelAttribute("user")
            @Valid UserRegistrationDTO userRegistrationDTO,
            BindingResult bindingResult
    ) {
        Optional<User> userOptional = userService.findByEmail(userRegistrationDTO.getEmail());
        if(userOptional.isPresent()){
            bindingResult.rejectValue("email",null,"Email already exists");
        }
        if(bindingResult.hasErrors()){
            return "client-register";
        }
        userService.createUser(
                userRegistrationDTO.getEmail(),
                userRegistrationDTO.getPassword(),
                UserRole.CLIENT
        );
        return "redirect:/client-register?success";
    }
}


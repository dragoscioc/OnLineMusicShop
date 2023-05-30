package onlinemusicshop.controller;

import onlinemusicshop.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/my-orders")
    public String showMyOrdersPage(Model model, Principal principal){
        model.addAttribute("orders",orderService.findAllByUserEmail(principal.getName()));
        return "orders";
    }
    @GetMapping("/all-orders")
    public String showAllOrders(Model model, Principal principal){
        model.addAttribute("orders",orderService.findAll());
        return "orders";
    }
}

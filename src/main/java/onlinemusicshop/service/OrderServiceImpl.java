package onlinemusicshop.service;

import onlinemusicshop.model.Order;
import onlinemusicshop.model.User;
import onlinemusicshop.model.UserProfile;
import onlinemusicshop.repository.OrderRepository;
import onlinemusicshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    public OrderServiceImpl(OrderRepository orderRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Order> findAllByUserEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        UserProfile userProfile = user.getUserProfile();
        if (userProfile == null) {
            throw new IllegalArgumentException("User profile does not exits");
        }
        return orderRepository.findAllByUserProfile(userProfile);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

}

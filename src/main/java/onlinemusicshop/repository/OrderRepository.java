package onlinemusicshop.repository;

import onlinemusicshop.model.Order;
import onlinemusicshop.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAllByUserProfile(UserProfile userProfile);
}

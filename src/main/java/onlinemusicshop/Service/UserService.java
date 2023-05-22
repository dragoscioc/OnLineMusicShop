package onlinemusicshop.Service;

import onlinemusicshop.model.User;
import onlinemusicshop.model.enums.UserRole;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    Optional<User> findByEmail(String email);
    void createUser(String email, String Password, UserRole role);

    void createUser(String email, String password, UserRole role, String name);
}

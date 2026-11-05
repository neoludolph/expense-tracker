package de.neoludolph.expense_tracker_api.Service;

import de.neoludolph.expense_tracker_api.Repository.UserRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("standardAuthService")
@Primary
public class AuthServiceImpl {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean emailExists() {

    }
}

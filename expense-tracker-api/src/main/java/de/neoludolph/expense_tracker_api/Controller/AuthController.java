package de.neoludolph.expense_tracker_api.Controller;

import de.neoludolph.expense_tracker_api.Dto.LoginRequest;
import de.neoludolph.expense_tracker_api.Dto.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/auth")
public class AuthController {

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest registerRequest) {
        return "Registrierung empfangen";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        return "Login empfangen";
    }
}

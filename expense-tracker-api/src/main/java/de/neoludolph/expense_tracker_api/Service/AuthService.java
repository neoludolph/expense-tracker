package de.neoludolph.expense_tracker_api.Service;

import de.neoludolph.expense_tracker_api.Repository.UserRepository;

public interface AuthService {
    public boolean emailExists(String email);
}

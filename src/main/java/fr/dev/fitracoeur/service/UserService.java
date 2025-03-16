package fr.dev.fitracoeur.service;

import fr.dev.fitracoeur.dto.usermanagement.UserUpdateDTO;
import fr.dev.fitracoeur.exception.DuplicateEmailException;
import fr.dev.fitracoeur.model.User;
import fr.dev.fitracoeur.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public User createUser(UserUpdateDTO userDTO){
        validateUniqueConstraints
    }

    private void validateUniqueConstratints(String username, String email){
        validateUniqueMail(email);
        validateUniqueUsername(username);
    }

    private void validateUniqueMail(String email){
        if(userRepository.existsByEmail(email)){
            throw new DuplicateEmailException("Email already in use :" + email);
        }
    }

    private void validateUniqueUsername(String username){
        if(userRepository.existsByUsername(username)){
            throw new IllegalArgumentException("Username already in use :" + username);
        }
    }

}

package fr.dev.fitracoeur.service;

import fr.dev.fitracoeur.dto.usermanagement.UserDTO;
import fr.dev.fitracoeur.dto.usermanagement.UserUpdateDTO;
import fr.dev.fitracoeur.exception.DuplicateEmailException;
import fr.dev.fitracoeur.model.User;
import fr.dev.fitracoeur.model.enums.Gender;
import fr.dev.fitracoeur.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    @Transactional
    public User createUser(UserDTO userDTO){
        validateUniqueConstraints(userDTO.getUsername(), userDTO.getEmail());
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        //user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setBirthDate(userDTO.getBirthDate());
        user.setGender(Gender.valueOf(userDTO.getGender().toUpperCase()));
        return userRepository.save(user);
    }

    private void validateUniqueConstraints(String username, String email){
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

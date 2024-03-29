package com.room.reservation.user;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, Integer student_code, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setStudent_code(student_code);
        user.setPassword(passwordEncoder.encode(password));
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;
    }
}

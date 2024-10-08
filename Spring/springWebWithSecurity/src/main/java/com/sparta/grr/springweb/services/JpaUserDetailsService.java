package com.sparta.grr.springweb.services;

import com.sparta.grr.springweb.entities.SecurityUser;
import com.sparta.grr.springweb.entities.User;
import com.sparta.grr.springweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUserName(username)
                .map(SecurityUser::new)
                        .orElseThrow(() -> new UsernameNotFoundException("User: " + username + " - not found"));
    }
}

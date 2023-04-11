package com.santechture.api.service;

import com.santechture.api.entity.Admin;
import com.santechture.api.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin user = adminRepository.findByUsernameIgnoreCase(username);
        if (user == null)
            throw new UsernameNotFoundException("User not found with username: " + username);
        return new User(username, user.getPassword(),
                new ArrayList<>());
    }

}
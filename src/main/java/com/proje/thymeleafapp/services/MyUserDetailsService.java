package com.proje.thymeleafapp.services;

import com.proje.thymeleafapp.models.User;
import com.proje.thymeleafapp.models.UserPrincipal;
import com.proje.thymeleafapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User user = userRepository.findByUserName(userName);

        if(user == null){
            throw new UsernameNotFoundException("User not found!");
        }
        return new UserPrincipal(user);
    }
}

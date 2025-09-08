package com.example.demo.service;

import com.example.demo.model.UserPrincipal;
import com.example.demo.model.Users;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

    // custom user details service to load user-specific data
@Service
public class MyUserDetailsService implements UserDetailsService {

        @Autowired
        private UserRepo userRepo;


        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

            Users users = userRepo.findByUsername(username);
            if (users == null) {
                System.out.println("user not found");
            }
            return new UserPrincipal(users);
        }
    }

//        if (username.equals("admin")) {
//            return User.withUsername("admin")
//                    .password(new BCryptPasswordEncoder().encode("admin"))
//                    .roles("ADMIN")
//                    .build();
//        } else if(username!="admin"){
//            return User.withUsername("sohan")
//                    .password(new BCryptPasswordEncoder().encode("sohan"))
//                    .roles("USER")
//                    .build();
//        }else{
//            throw new UsernameNotFoundException("user not found");
//        }



//// password encoder bean hashes the password
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }


// 9440032034 mahmood
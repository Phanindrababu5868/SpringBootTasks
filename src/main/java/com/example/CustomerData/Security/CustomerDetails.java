package com.example.CustomerData.Security;

import com.example.CustomerData.Repositry.Customer_Repo;
import com.example.CustomerData.model.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetails implements UserDetailsService {
    @Autowired
    private Customer_Repo CustomerRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    CustomerData Customer= this.CustomerRepository.findByEmail(username).orElseThrow();
        return Customer;
    }

}
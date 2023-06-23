package org.example.UserManagement.Configuration;

import org.example.UserManagement.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<User> userInitializer()
    {
        return new ArrayList<>();
    }
}

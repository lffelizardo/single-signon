package br.com.mv.sistemas.app;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.mv.sistemas.app.repository.UserRepository;
import br.com.mv.sistemas.app.service.impl.UserDetailsServiceImpl;

@Configuration
public class TestConfiguration {

	@Bean
    public UserDetailsService userService() {
        return Mockito.mock(UserDetailsServiceImpl.class);
    }

	@Bean
    public UserRepository userRepository() {
        return Mockito.mock(UserRepository.class);
    }

}

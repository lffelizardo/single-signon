package br.com.mv.sistemas.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.mv.sistemas.app.domain.User;
import br.com.mv.sistemas.app.repository.UserRepository;
import br.com.mv.sistemas.app.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepo.findByLogin(email);
		if (user == null) {
			throw new UsernameNotFoundException(email);
		}

		return new UserSS(user.getId(), user.getName(), user.getLogin() ,user.getEmail(), user.getPassword());
	}

}

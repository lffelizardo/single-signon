package br.com.mv.sistemas.app.service;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.mv.sistemas.app.security.UserSS;

public class UserAuthService {

	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}

}

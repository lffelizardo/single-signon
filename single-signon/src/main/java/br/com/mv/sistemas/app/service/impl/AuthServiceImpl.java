package br.com.mv.sistemas.app.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import br.com.mv.sistemas.app.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {



	private Random rand = new Random();

	public void sendNewPassword(String email) {

	}

	private String newPassword() {
		char[] vet = new char[10];
		for (int i=0; i<10; i++) {
			vet[i] = randomChar();
		}
		return new String(vet);
	}

	private char randomChar() {
		int opt = rand.nextInt(3);
		if (opt == 0) { // gera um digito
			return (char) (rand.nextInt(10) + 48);
		}
		else if (opt == 1) { // gera letra maiuscula
			return (char) (rand.nextInt(26) + 65);
		}
		else { // gera letra minuscula
			return (char) (rand.nextInt(26) + 97);
		}
	}

}

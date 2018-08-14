package br.com.mv.sistemas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.sistemas.app.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByLogin(String login);

}

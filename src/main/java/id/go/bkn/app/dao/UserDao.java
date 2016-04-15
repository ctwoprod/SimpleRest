package id.go.bkn.app.dao;

import id.go.bkn.app.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);

}

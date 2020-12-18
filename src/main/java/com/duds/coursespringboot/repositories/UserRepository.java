package com.duds.coursespringboot.repositories;

import com.duds.coursespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

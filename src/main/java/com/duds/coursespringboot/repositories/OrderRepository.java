package com.duds.coursespringboot.repositories;

import com.duds.coursespringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

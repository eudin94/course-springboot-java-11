package com.duds.coursespringboot.repositories;

import com.duds.coursespringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

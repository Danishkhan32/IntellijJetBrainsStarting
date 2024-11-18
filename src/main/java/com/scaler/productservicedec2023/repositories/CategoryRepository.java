package com.scaler.productservicedec2023.repositories;

import com.scaler.productservicedec2023.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

     Optional<Category> findByName(String name);

}

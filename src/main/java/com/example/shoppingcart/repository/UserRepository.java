package com.example.shoppingcart.repository;
import com.example.shoppingcart.entity.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
        User findByUsername(String username);
}

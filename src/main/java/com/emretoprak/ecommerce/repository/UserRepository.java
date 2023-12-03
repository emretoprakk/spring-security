package com.emretoprak.ecommerce.repository;

import com.emretoprak.ecommerce.entities.User;
import com.emretoprak.ecommerce.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findFirstByEmail(String email);

    User findByUserRole(UserRole userRole);

}

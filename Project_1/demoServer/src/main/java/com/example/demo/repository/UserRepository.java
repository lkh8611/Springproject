package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    @Query(nativeQuery = true, value = "Select * From tblUser where szName")
//    Optional<User> findbyUsername(String szName);

}

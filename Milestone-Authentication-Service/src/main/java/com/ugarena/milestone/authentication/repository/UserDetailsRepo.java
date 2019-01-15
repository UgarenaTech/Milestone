package com.ugarena.milestone.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ugarena.milestone.authentication.entities.UserDetails;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails,Long>{

}

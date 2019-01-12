package com.ugareana.milestone.authentication.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ugarena.milestone.authentication.entities.UserRole;

@Repository
public interface UserRoleRepository extends MongoRepository<UserRole, Long> {

}

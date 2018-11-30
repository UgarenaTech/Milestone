package com.ugareana.milestone.authentication.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ugarena.milestone.authentication.entities.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, Long> {

}

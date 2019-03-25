package com.magpiers.demo_dashboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.magpiers.demo_dashboard.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
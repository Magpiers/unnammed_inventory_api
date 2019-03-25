package com.magpiers.demo_dashboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.magpiers.demo_dashboard.entity.UserScreenSectionComponentAssociation;



@Repository
public interface UserScreenSectionComponentAssociationRespository extends MongoRepository<UserScreenSectionComponentAssociation
, String>{

}

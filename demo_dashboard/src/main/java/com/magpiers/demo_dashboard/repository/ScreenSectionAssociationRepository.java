package com.magpiers.demo_dashboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.magpiers.demo_dashboard.entity.ScreenSectionAssociation;

@Repository
public interface ScreenSectionAssociationRepository extends MongoRepository<ScreenSectionAssociation, String>{

}

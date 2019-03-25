package com.magpiers.demo_dashboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.magpiers.demo_dashboard.entity.SectionComponentAssociation;

@Repository
public interface SectionComponentAssociationRespository extends MongoRepository<SectionComponentAssociation, String> {

}

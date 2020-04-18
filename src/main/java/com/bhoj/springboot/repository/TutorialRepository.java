package com.bhoj.springboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bhoj.springboot.domain.Tutorial;

/**
 * TutorialRepository
 * 
 * @author Bhoj
 *
 */
@Repository
public interface TutorialRepository extends MongoRepository<Tutorial, String> {

	  List<Tutorial> findByPublished(boolean published);
	  List<Tutorial> findByTitleContaining(String title);
}

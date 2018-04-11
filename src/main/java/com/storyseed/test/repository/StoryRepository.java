package com.storyseed.test.repository;

import com.storyseed.test.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Nick on 10/04/2018.
 */
@Repository("storyRepositoy")
public interface StoryRepository extends JpaRepository<Story, Long> {
}

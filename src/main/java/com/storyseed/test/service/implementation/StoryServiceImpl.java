package com.storyseed.test.service.implementation;

import com.storyseed.test.model.Story;
import com.storyseed.test.repository.StoryRepository;
import com.storyseed.test.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Nick on 10/04/2018.
 */
public class StoryServiceImpl implements StoryService{

    private StoryRepository storyRepository;

    @Autowired
    public StoryServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Override
    public Story findOne(Long id) {
        return storyRepository.findOne(id);
    }

    @Override
    public List<Story> findAll() {
        return null;
    }

    @Override
    public Story add(Story story) {
        return null;
    }

    @Override
    public void delete(Story story) {

    }
}

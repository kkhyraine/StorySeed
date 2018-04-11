package com.storyseed.test.service.implementation;

import com.storyseed.test.model.Story;
import com.storyseed.test.repository.StoryRepository;
import com.storyseed.test.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nick on 10/04/2018.
 */
@Service("storyService")
public class StoryServiceImpl implements StoryService{

    private StoryRepository storyRepository;

    @Autowired
    public StoryServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Override
    public Story findOne(Long storyId) {
        return storyRepository.findOne(storyId);
    }

    @Override
    public List<Story> findAll() {
        return storyRepository.findAll();
    }

    @Override
    public Story add(Story story) {
        return storyRepository.save(story);
    }

    @Override
    public void delete(Story story) {
        storyRepository.delete(story);
    }
}

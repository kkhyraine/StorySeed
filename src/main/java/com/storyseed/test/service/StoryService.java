package com.storyseed.test.service;

import com.storyseed.test.model.Story;

import java.util.List;

/**
 * Created by Nick on 10/04/2018.
 */
public interface StoryService {

    Story findOne(Long id);

    List<Story> findAll();

    Story add(Story story);

    void delete(Story story);



}

package com.storyseed.test.model;

import javax.persistence.*;

/**
 * Created by Nick on 10/04/2018.
 */
@Entity
@Table(name = "story")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "story_id")
    private Long id;

    @Column(name = "story_title")
    private String title;

    @Column(name = "story_author")
    private String author;

    @Column(name = "story_content")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

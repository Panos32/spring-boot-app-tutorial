package dev.panos.contentcalendar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.panos.contentcalendar.model.Content;
import dev.repository.ContentCollectionRepository;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private ContentCollectionRepository repository;

    @Autowired
    public ContentController(ContentCollectionRepository contentCollectionRepository){
        this.repository = repository;
    }

    //make a request and find all the pieces of content in the system
    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();
    }
    
}

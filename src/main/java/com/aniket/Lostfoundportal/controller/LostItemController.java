package com.aniket.Lostfoundportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aniket.Lostfoundportal.entity.LostItem;
import com.aniket.Lostfoundportal.repository.LostItemRepository;

@RestController
public class LostItemController {

    @Autowired
    private LostItemRepository repository;

    @PostMapping("/saveItem")
    public String saveItem(@RequestBody LostItem item) {

        repository.save(item);

        return "Item Saved Successfully!";
    }
}

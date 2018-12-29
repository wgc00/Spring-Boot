package com.wgc.SpringBoot20181229.controller;

import com.wgc.SpringBoot20181229.entity.News;
import com.wgc.SpringBoot20181229.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsService service;

    @GetMapping("/all")
    public List<News> selectAll() {
        return service.listAll();
    }

    @GetMapping("/add")
    public String add (News news) {
        service.add(news);
        return "You success";
    }
}

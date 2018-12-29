package com.wgc.SpringBoot20181229.service;

import com.wgc.SpringBoot20181229.entity.News;

import java.util.List;

public interface NewsService {

    List<News> listAll();

    void add(News news);
}

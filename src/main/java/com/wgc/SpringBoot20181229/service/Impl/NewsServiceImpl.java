package com.wgc.SpringBoot20181229.service.Impl;

import com.wgc.SpringBoot20181229.dao.NewsDAO;
import com.wgc.SpringBoot20181229.entity.News;
import com.wgc.SpringBoot20181229.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDAO  newsDAO;

    @Override
    public List<News> listAll() {
        return newsDAO.findAll();
    }

    @Override
    public void add(News news) {
        newsDAO.save(news);
    }
}

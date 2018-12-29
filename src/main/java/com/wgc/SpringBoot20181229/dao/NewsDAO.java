package com.wgc.SpringBoot20181229.dao;


import com.wgc.SpringBoot20181229.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NewsDAO extends JpaRepository<News, Integer> {

}

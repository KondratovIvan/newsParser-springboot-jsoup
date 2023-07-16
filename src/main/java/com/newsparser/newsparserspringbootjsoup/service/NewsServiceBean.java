package com.newsparser.newsparserspringbootjsoup.service;

import com.newsparser.newsparserspringbootjsoup.model.News;
import com.newsparser.newsparserspringbootjsoup.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceBean implements NewsService{
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public News create(News news) {
        return newsRepository.save(news);
    }

    @Override
    public Boolean isExists(String newsTitle) {
        List<News> newsList=newsRepository.findAll();
        for (News news: newsList){
            if (news.getTitle()==newsTitle){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public List<News> getAll() {
        return newsRepository.findAll();
    }
}

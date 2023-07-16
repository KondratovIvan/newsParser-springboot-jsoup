package com.newsparser.newsparserspringbootjsoup.web;

import com.newsparser.newsparserspringbootjsoup.model.News;
import com.newsparser.newsparserspringbootjsoup.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @PostMapping("/news")
    public News createNews(@RequestBody News news){
        return newsService.create(news);
    }
    @GetMapping("/news/{newsTitle}")
    public Boolean isExists(@PathVariable String newsTitle){
        return newsService.isExists(newsTitle);
    }
    @GetMapping("/news")
    public List<News> getAllNews(){
        return newsService.getAll();
    }
}

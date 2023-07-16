package com.newsparser.newsparserspringbootjsoup.service;

import com.newsparser.newsparserspringbootjsoup.model.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {

    News create(News news);

    Boolean isExists(String newsTitle);

    List<News> getAll();

}

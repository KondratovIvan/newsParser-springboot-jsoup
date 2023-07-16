package com.newsparser.newsparserspringbootjsoup.repository;

import com.newsparser.newsparserspringbootjsoup.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News,Integer> {

}

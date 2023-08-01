package com.newsparser.newsparserspringbootjsoup.parsing;

import com.newsparser.newsparserspringbootjsoup.model.News;
import com.newsparser.newsparserspringbootjsoup.service.NewsService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class NewsParsing {
    @Autowired
    private NewsService newsService;

    @Scheduled(fixedDelay = 10000)
    public void parseNews() throws IOException {
        String url="https://www.bbc.com/news/world";

        Document doc= Jsoup.connect(url)
                .userAgent("Chrome")
                .timeout(5000)
                .referrer("https://google.com")
                .get();
        Elements news=doc.getElementsByClass("gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text");
        for(Element elem: news){
            String title=elem.ownText();
            if(!newsService.isExists(title)){
                News obj = new News();
                obj.setTitle(title);
                newsService.create(obj);
            }
        }

    }

}

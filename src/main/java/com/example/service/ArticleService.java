package com.example.service;

import com.example.dao.ArticleDao;
import com.example.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangchong
 * @since 2017/8/29 10:25
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public void addArticle(Article article) {
        articleDao.addArticle(article);
    }
}

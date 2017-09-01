package com.example.service;

import com.example.dao.ArticleDao;
import com.example.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiangchong
 * @since 2017/8/29 10:25
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public List<Article> getArticles() {
        return articleDao.getArticles();
    }

    public Article getArticle(String id) {
        return articleDao.getArticle(id);
    }

    public void addArticle(Article article) {
        articleDao.addArticle(article);
    }

    public void modifyArticle(Article article) {
        articleDao.modifyArticle(article);
    }
}

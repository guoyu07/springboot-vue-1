package com.example.dao;

import com.example.model.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jiangchong
 * @since 2017/8/29 10:17
 */
@Repository
public interface ArticleDao {
    List<Article> getArticles();

    Article getArticle(String id);

    void addArticle(Article article);

    void modifyArticle(Article article);

}

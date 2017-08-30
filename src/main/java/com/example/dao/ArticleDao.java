package com.example.dao;

import com.example.model.Article;
import org.springframework.stereotype.Repository;

/**
 * @author jiangchong
 * @since 2017/8/29 10:17
 */
@Repository
public interface ArticleDao {
    void addArticle(Article article);
}

package com.example.controller;

import com.example.model.Article;
import com.example.service.ArticleService;
import com.example.utils.Response;
import com.example.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangchong
 * @since 2017/8/29 10:27
 */

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping(path = "addArticle")
    public Response addArticle(Article article) {
        articleService.addArticle(article);
        return ResponseUtil.success();
    }
}

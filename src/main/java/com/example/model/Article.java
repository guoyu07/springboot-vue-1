package com.example.model;

import java.util.Date;

/**
 * 文章
 *
 * @author jiangchong
 * @since 2017/8/28 10:03
 */
public class Article {
    private String id;
    private String title;
    private String author;
    private ArticleType articleType;
    private String tag;
    private Category category;
    private String content;
    private Date createTime;
    private Date modifyTime;
    private Boolean drafts;
    private Boolean recycle;

}

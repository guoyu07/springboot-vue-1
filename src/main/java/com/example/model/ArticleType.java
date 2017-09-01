package com.example.model;

/**
 * @author jiangchong
 * @since 2017/8/28 10:05
 */
public class ArticleType {
    private Integer id;
    private String name;

    public ArticleType() {
    }

    public ArticleType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ArticleType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

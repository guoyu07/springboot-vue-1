package com.example.dao;

import com.example.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jiangchong
 * @since 2017/8/31 9:24
 */
@Repository
public interface CategoryDao {
    List<Category> getCategorys();
}

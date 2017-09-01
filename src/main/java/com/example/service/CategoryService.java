package com.example.service;

import com.example.dao.CategoryDao;
import com.example.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiangchong
 * @since 2017/8/31 9:28
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    public List<Category> getCategorys() {
        return categoryDao.getCategorys();
    }
}

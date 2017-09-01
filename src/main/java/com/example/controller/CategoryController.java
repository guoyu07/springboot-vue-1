package com.example.controller;

import com.example.model.Category;
import com.example.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiangchong
 * @since 2017/8/31 9:30
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("getCategorys")
    public List<Category> getCategorys() {
        return categoryService.getCategorys();
    }
}

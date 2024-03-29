package com.nivedita.giflib.web.controller;

import com.nivedita.giflib.model.Category;
import com.nivedita.giflib.service.CategoryService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {

    // Dependency Injection
    @Autowired
    private CategoryService categoryService;

    // Index of all categories
    @SuppressWarnings("unchecked")
    @RequestMapping ("/categories")
    public String listCategories (Model model) {

        // TODO: Get all categories
        List <Category> categories = categoryService.findAll();

        model.addAttribute("categories",categories);
        return "category/index";

    }

    // Add a catgeory
    @RequestMapping (value = "/categories", method = RequestMethod.POST)
    public String addCategory () {

        // TODO: Add category if valid data was received


        // TODO: Redirect browser to /categories


        return null;
    }


    // Delete an existing category
    @RequestMapping (value = "/categories/{categoryId}/delete", method = RequestMethod.POST)
    public String deleteCategory (@PathVariable Long categoryId) {

        // TODO: Delete category if it contains no GIFs


        // TODO: Redirect browser to /categories

        return null;
    }

    // Single category page
    @RequestMapping("/categories/{categoryId}")
    public String category (@PathVariable Long categoryId, Model model) {

        // TODO: Get the category given by categoryId
        Category category = null;

        model.addAttribute("category", category);

        return "category/details";
    }



}

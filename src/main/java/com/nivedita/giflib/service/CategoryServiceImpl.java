package com.nivedita.giflib.service;

import com.nivedita.giflib.dao.CategoryDao;
import com.nivedita.giflib.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Annotations go on implementations not on interface
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public void delete(Category category) {

    }
}

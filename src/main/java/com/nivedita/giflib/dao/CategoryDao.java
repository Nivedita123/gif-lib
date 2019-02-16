package com.nivedita.giflib.dao;

import com.nivedita.giflib.model.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> findAll ();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);

}

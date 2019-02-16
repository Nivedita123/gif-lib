package com.nivedita.giflib.dao;

import com.nivedita.giflib.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<Category> findAll() {

        // Open session
        Session session = sessionFactory.openSession();

        // Get all categories with a Hibernate criteria
        List <Category> categories = session.createCriteria(Category.class).list();

        session.close();
        return categories;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {

        // Open a session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        session.beginTransaction()

        // Save the category
        session.save(category);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();

    }

    @Override
    public void delete(Category category) {

    }
}

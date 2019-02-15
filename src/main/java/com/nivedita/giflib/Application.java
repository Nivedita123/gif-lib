package com.nivedita.giflib;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Application {

    // Hold a reusable reference to session factory, since we need only one
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        // Create a StandardServiceRegistry
        final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

        return new MetadataSources(registry).buildMetadata().buildSessionFactory();

    }

    public static void main(String args[]) {


    }
}


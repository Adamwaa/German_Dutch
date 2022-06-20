package io.github.Adam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.query.Query;


public class Repository {
    List<Dictionary> germanies = new ArrayList<>();

    List<Dictionary> findAll() {

        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        Query result = session.createQuery("from Dictionary", Dictionary.class);
        germanies = result.list();
        transaction.commit();

        return germanies;
    }
}

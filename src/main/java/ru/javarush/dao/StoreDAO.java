package ru.javarush.dao;

import org.hibernate.SessionFactory;
import ru.javarush.domain.Store;

public class StoreDAO extends GenericDAO {

    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}

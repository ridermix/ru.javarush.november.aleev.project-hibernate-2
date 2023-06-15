package ru.javarush.dao;

import org.hibernate.SessionFactory;
import ru.javarush.domain.City;

public class CityDAO extends GenericDAO  {

    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }
}

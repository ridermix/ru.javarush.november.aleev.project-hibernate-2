package ru.javarush.dao;

import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import ru.javarush.domain.City;


public class CityDAO extends GenericDAO<City>  {

    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(String name) {
        Query<City> query = getCurrentSession().createQuery("SELECT c FROM City c WHERE c.city = :NAME", City.class);
        query.setParameter("NAME", name);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}

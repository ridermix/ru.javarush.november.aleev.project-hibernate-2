package ru.javarush.dao;

import org.hibernate.SessionFactory;
import ru.javarush.domain.Rental;

public class RentalDAO extends GenericDAO<Rental> {

    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }
}

package ru.javarush.dao;

import org.hibernate.SessionFactory;
import ru.javarush.domain.Film;

public class FilmDAO extends GenericDAO<Film> {

    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }
}

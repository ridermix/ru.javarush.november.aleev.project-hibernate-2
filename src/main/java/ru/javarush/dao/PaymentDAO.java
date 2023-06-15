package ru.javarush.dao;

import org.hibernate.SessionFactory;
import ru.javarush.domain.Payment;

public class PaymentDAO extends GenericDAO {

    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}

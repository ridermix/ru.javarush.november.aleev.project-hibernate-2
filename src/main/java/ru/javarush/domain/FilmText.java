package ru.javarush.domain;

import javax.persistence.*;

@Entity
@Table(schema = "movie", name = "film_text")
public class FilmText {

    @Id
    @Column(name = "film_id")
    private Short id;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    private String title;
}

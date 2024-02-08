package ru.netology.javaqa.JavaHW11.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void addFilms() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void addOneFilm() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lessLimit() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void overLimit() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}

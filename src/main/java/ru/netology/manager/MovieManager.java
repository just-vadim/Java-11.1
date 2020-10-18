package ru.netology.manager;

import ru.netology.domain.Movie;
import ru.netology.repository.Repository;

public class MovieManager {
    private Repository repository;

    public void add(Movie item) {
        repository.save(item);
    }

    public Movie[] getAll() {
        Movie[] items = repository.findAll();
        Movie[] result = new Movie[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public Movie[] findById(int id) {
        return repository.findById(id);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public MovieManager(Repository repository) {
        this.repository = repository;
    }
}
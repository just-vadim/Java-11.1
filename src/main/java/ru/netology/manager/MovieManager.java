package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private int returnCount = 10;
    private Movie[] movies = new Movie[0];

    public void add(Movie item) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }

    public Movie[] getLast() {
        Movie[] result = new Movie[movies.length];
        if (movies.length > returnCount) {
            Movie[] result1 = new Movie[returnCount];
            for (int i = 0; i < returnCount; i++) {
                int index = movies.length - i - 1;
                result1[i] = movies[index];
            }
            return result1;
        }
        else {
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
        }
        return result;
    }

    public MovieManager() {
    }

    public MovieManager(int returnCount) {
        this.returnCount = returnCount;
    }
}
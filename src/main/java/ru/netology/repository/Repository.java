package ru.netology.repository;
import ru.netology.domain.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {

    private Movie[] movies = new Movie[0];

    public Movie[] findAll(){
        return movies;
    }

    public void save(Movie item){
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }

    public Movie[] findById(int id) {
        Movie[] result = new Movie[0];
        int index = 0;
        for (Movie item : movies) {
            if (item.getId() == id) {
                int length = result.length + 1;
                Movie[] tmp = new Movie[length];
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = movies[index];
                result = tmp;
            }
            index++;
        }
        if (result.length == 0){
            return null;
        }
        else {
            return result;
        }
    }

    public void removeById(int id) {
        List<Movie> list = new ArrayList<>(Arrays.asList(movies));
        Movie[] removingItem = findById(id);
        if (removingItem == null){
            return;
        }
        list.remove(removingItem[0]);
        Movie[] result = new Movie[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        movies = result;
    }

    public void removeAll(){
        movies = new Movie[0];
    }
}
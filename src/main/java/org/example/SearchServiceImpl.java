package org.example;

import java.util.ArrayList;
import java.util.List;


public class SearchServiceImpl implements SearchsService {
    private List<Movies>movies=new ArrayList<>();

    public SearchServiceImpl(List<Movies> moviesList) {
        this.movies = moviesList;
    }

    @Override
    public Movies searchByName(Movies movie) {
        for(Movies movies1:movies)
            if (movies1.getName().equalsIgnoreCase(movie.getName())) {
                return movies1;
            }
        return null;
    }
}

package io.github.Adam;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Service {

    private Repository repository;

    public Service() {
        this(new Repository());
    }

    public Service(Repository repository) {
        this.repository = repository;
    }



    public List<Dictionary> findAll() {
        return repository
                .findAll()
                .stream().toList();
    }






}

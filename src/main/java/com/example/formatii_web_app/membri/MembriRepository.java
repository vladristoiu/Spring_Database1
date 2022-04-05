package com.example.formatii_web_app.membri;

import org.springframework.data.repository.CrudRepository;

public interface MembriRepository extends CrudRepository<Membri, Integer> {
    public Long countById(Integer id);
}

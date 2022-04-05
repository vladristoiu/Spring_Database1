package com.example.formatii_web_app.formatii;

import org.springframework.data.repository.CrudRepository;

public interface FormatiiRepository extends CrudRepository<Formatii, Integer> {
    public Long countById(Integer id);
}

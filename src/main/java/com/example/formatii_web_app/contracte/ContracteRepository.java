package com.example.formatii_web_app.contracte;

import org.springframework.data.repository.CrudRepository;

public interface ContracteRepository extends CrudRepository<Contracte, Integer> {
    public Long countById(Integer id);
}

package com.example.formatii_web_app.formatii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FormatiiService {
    @Autowired
    private FormatiiRepository repo;

    public List<Formatii> listAll() {
        return (List<Formatii>) repo.findAll();
    }

    public void save(Formatii formatii) {
        repo.save(formatii);
    }

    public Formatii get(Integer id){
        Optional<Formatii> result= repo.findById(id);
        return result.get();
    }

    public void delete(Integer id){
        Long count = repo.countById(id);
        repo.deleteById(id);
    }
}

package com.example.formatii_web_app.membri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MembriService {
    @Autowired
    private MembriRepository repo;

    public List<Membri> listAll() {
        return (List<Membri>) repo.findAll();
    }

    public void save(Membri membri) {
        repo.save(membri);
    }

    public Membri get(Integer id){
        Optional<Membri> result= repo.findById(id);
        return result.get();
    }

    public void delete(Integer id){
        Long count = repo.countById(id);
        repo.deleteById(id);
    }
}

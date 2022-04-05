package com.example.formatii_web_app.contracte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ContracteService {
    @Autowired
    private ContracteRepository repo;

    public List<Contracte> listAll() {
        return (List<Contracte>) repo.findAll();
    }

    public void save(Contracte contracte) {
        repo.save(contracte);
    }

    public Contracte get(Integer id){
        Optional<Contracte> result= repo.findById(id);
        return result.get();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }
}

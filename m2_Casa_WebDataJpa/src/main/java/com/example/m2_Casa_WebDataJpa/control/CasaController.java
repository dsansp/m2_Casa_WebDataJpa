package com.example.m2_Casa_WebDataJpa.control;

import com.example.m2_Casa_WebDataJpa.entities.Casa;
import com.example.m2_Casa_WebDataJpa.repositories.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CasaController {
    //atributos
    CasaRepository respository;

    //contructor
    public CasaController(CasaRepository respository) {
        this.respository = respository;
    }

    //recuperar todos
    @GetMapping("/casas")

    public List<Casa> findAll() {
        return respository.findAll();
    }

    @GetMapping("/data")
    public void demoData() {
        Casa home = new Casa(null, 150000D, 120, "Miami Beach", true);
        Casa home2 = new Casa(null, 350000D, 250, "Los Angeles", true);
        respository.save(home);
        respository.save(home2);

        // JSON:
        //{
        //        "id": 1,
        //        "precio": 150000.0,
        //        "metros": 120,
        //        "adress": "Miami Beach",
        //        "garden": true
        //    }

    }

    @PostMapping("/casas")
    public void create(@RequestBody Casa casa) {
        if (casa.getId() == null)
            respository.save(casa);
    }

    @PutMapping("/casas")
    public void update(@RequestBody Casa casa) {
        if (casa.getId() != null && respository.existsById(casa.getId())) {
            respository.save(casa);
        }
    }
    @DeleteMapping("/casas/{id}")
    public void deleteById(@PathVariable Long id) {
    if (respository.existsById(id))
        respository.deleteById(id);
    }
}


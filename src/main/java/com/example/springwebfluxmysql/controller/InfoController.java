package com.example.springwebfluxmysql.controller;

import com.example.springwebfluxmysql.Repository.InfoRep;
import com.example.springwebfluxmysql.model.Info;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/info")
public class InfoController {

    private final InfoRep infoRep;

    @DeleteMapping("/{id}")
    public Mono delete(@PathVariable int id){
        return infoRep.deleteById(id);
    }

    @GetMapping("/{id}")
    public Mono findById(@PathVariable int id){
        return infoRep.findById(id);
    }
    @PutMapping
    public Mono update(@RequestBody Info info){
        return infoRep.save(info);
    }

    @PostMapping
    public Mono save(@RequestBody Info info){
        return infoRep.save(info);
    }
    @GetMapping
    public Flux<Info> findAll(){
        return infoRep.findAll();
    }
}

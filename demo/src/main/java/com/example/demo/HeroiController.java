package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping("heroi/")
public class HeroiController {



    @GetMapping
    public ArrayList<Heroi> listarHerois(){
        return heroiList;
    }

    @GetMapping("{indice}")
    public String buscarHeroi(@PathVariable int indice){
        if(indiceValido(indice)){
            return String.valueOf(heroiList.get(indice));
        }
        return "Valor não encontrado";
    }

    private ArrayList<Heroi> heroiList = new ArrayList<>();
    @PostMapping
    public void cadastrar(@RequestBody Heroi novoHeroi){
        heroiList.add(novoHeroi);
        System.out.println("Heroi Cadastrado com sucesso.");
    }

    @PutMapping("{indice}")
    public void atualizar(@PathVariable int indice, @RequestBody Heroi heroiAtualizar ){
        if(indiceValido(indice)) {
            heroiList.set(indice, heroiAtualizar);
            System.out.println("Heroi atualizado com sucesso.");
            return;
        }
        System.out.println("Herói não encontrado");
    }
    @DeleteMapping("{indice}")
    public String remover(@PathVariable int indice){
        if(indiceValido(indice)){
            heroiList.remove(indice);
            return "Heroi removido";
        }
        return "Heroi não encontrado";
    }

    private Boolean indiceValido (int indice){
        return indice >= 0 && indice < heroiList.size() ? true : false;
    }



}

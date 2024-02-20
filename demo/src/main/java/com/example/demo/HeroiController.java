package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("cadastrar/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public void cadastrar(@PathVariable String nome, @PathVariable String habilidade, @PathVariable Integer idade, @PathVariable Double forca, @PathVariable Boolean vivo){
        heroiList.add(new Heroi(nome, habilidade, idade, forca, vivo));
        System.out.println("Heroi Cadastrado Com sucesso.");
    }
    @GetMapping("atualizar/{indice}/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public void atualizar(@PathVariable int indice, @PathVariable String nome, @PathVariable String habilidade, @PathVariable Integer idade, @PathVariable Double forca, @PathVariable Boolean vivo){
        if(indiceValido(indice)) {
            heroiList.set(indice, new Heroi(nome, habilidade, idade, forca, vivo));
            System.out.println("Heroi Cadastrado Com sucesso.");
            return;
        }
        System.out.println("Herói não encontrado");
    }
    @GetMapping("remover/{indice}")
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

package com.example.demo;

public class Heroi {
    private String nome;
    private String habilidade;
    private Integer idade;
    private Double forca;
    private Boolean vivo;

    public Heroi(String nome, String habilidade, Integer idade, Double forca, Boolean vivo) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
        this.forca = forca;
        this.vivo = vivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "nome='" + nome + '\'' +
                ", habilidade='" + habilidade + '\'' +
                ", idade=" + idade +
                ", forca=" + forca +
                ", vivo=" + vivo +
                '}';
    }
}

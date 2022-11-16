package com.example;

import java.time.LocalDate;

public class Studente {
    
    private int id;
    private String nome;
    private String cognome;
    private String dtnascita;
    private int votoesame;

    public Studente(int id, String nome, String cognome, String dtnascita, int votoesame) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dtnascita = dtnascita;
        this.votoesame = votoesame;
    }

    public Studente(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDtnascita() {
        return dtnascita;
    }

    public void setDtnascita(String dtnascita) {
        this.dtnascita = dtnascita;
    }

    public int getVotoesame() {
        return votoesame;
    }

    public void setVotoesame(int votoesame) {
        this.votoesame = votoesame;
    }

    
    
}

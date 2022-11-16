package com.example;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Studenti {
    
    @JacksonXmlElementWrapper(useWrapping = false)
    ArrayList<Studente> listaStudenti;
    private String nome;
    
    public Studenti(String nome) {
        this.nome = nome;
        listaStudenti=new ArrayList<>();
    }

    public Studenti(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(ArrayList<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public void aggiungi(Studente s){

        listaStudenti.add(s);
    }
    

}

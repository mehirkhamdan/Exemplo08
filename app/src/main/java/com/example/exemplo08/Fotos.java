package com.example.exemplo08;

import java.util.ArrayList;
import java.util.List;

public class Fotos {
    public String nome;
    public int img;  //R.drawable.xxx

    public Fotos(String nome, int img) {
        this.nome = nome;
        this.img = img;
    }

    public static List<Fotos> getIcons(){
        List<Fotos> fot = new ArrayList<>();
        fot.add(new Fotos("Crazy",R.drawable.c1));
        fot.add(new Fotos("Doidao",R.drawable.c2));
        fot.add(new Fotos("Fantasma",R.drawable.c3));
        fot.add(new Fotos("Maluco",R.drawable.c4));
        fot.add(new Fotos("Gringo",R.drawable.j1));
        fot.add(new Fotos("Pita",R.drawable.j2));
        fot.add(new Fotos("Brasa",R.drawable.j3));
        fot.add(new Fotos("Mascara",R.drawable.j4));
        return fot;
    }
}

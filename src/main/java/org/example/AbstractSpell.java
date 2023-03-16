package org.example;

public abstract class AbstractSpell {
    public AbstractSpell(String nom){
        this.mNom = nom;
        this.nombre = 0;
    }
    public void move(int chiffre){
        this.nombre = chiffre;
        System.out.println("afficher "+ this.nombre);
    }
    protected String mNom;
    protected int nombre;
}

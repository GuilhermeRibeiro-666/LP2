package com.mycompany.projetogui;


public class Projetogui {

   
}

class Carro{
     public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");
        carro.andar();
    }
    private String marca;
    private String nome;
    public Carro(String marca, String nome){
        this.marca = marca;
        this.nome = nome;
    }
    public void andar(){
        System.out.println("O carro " + marca + " " + nome + " está andando");   
    }
}

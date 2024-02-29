package com.mycompany.main;

public class Carro {
    String Modelo;
    String Marca;
    int Ano;
    int Velocidade;
    int Escolha;
    
    
    public void Acelerar(int Aceleracao){
        Velocidade += Aceleracao;
    }
    
    public void Freiar(int Aceleracao){
        Velocidade -= Aceleracao;
    }
    
    public void Buzinar(){
        System.out.println("BIBIBI!!!");
    }
    
}

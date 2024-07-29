package org.example;

public class Caneta {

   String modelo;
   String cor;
   float ponta;
   int carga;

   String marca;

   boolean tampada;

   void status(){
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Marca: " + this.marca);
      System.out.println("Caneta de cor: " + this.cor);
      System.out.println("Ponta: " + this.ponta);
      System.out.println("Carga: " + this.carga + "%");
      System.out.println("Está tampada? " + this.tampada);
   }

   void rabiscar(){

      if (this.tampada == true){
         System.out.println("Erro! Não posso rabiscar, a caneta esta tampada.");
      }else {
         System.out.println("Estou Rabiscando");
      }

   }
   void tampar(){
      this.tampada = true;
   }

   void destampar(){
    this.tampada = false;
   }

    }

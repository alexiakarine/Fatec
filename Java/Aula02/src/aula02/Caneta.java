/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Home-Alexia
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Seu modelo é " + this.modelo);
        System.out.println("Com a ponta " + this.ponta);
        System.out.println("Ela está com " + this.carga + " da carga total! ");
        
    }
    void rabiscar(){
       if(this.tampada == true)
       {
           System.out.println("Pode rabiscar!");
           
       }
       else
       {
           System.out.println("Não pode rabiscar ");
       }
        
    }
    void tampar(){
        this.tampada = true;
        
    }
 
    void destampar(){
        this.tampada = false;
        
    }
    
}

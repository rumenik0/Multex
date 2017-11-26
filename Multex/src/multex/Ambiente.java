/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multex;

/**
 *
 * @author rudnik
 */
public class Ambiente {
    private int regioes;
    public Ambiente(){  
        this.regioes = 5;
    }
    public Ambiente(int capacidade){    
        this.regioes = capacidade;
    }
    public int getVagas(){
        return regioes;
    }
    public void consumir(String processo){
        if (regioes == 0)
            System.out.println("Nenhuma regiáo crítica disponível! O Processo "+ processo +" deverá aguardar para acessar alguma área!");
        else{
            try{
                Thread.sleep((long)(Math.random()*1000)); 
            }catch(InterruptedException e){
                System.out.println(processo + "Sleep!");
            }
            System.out.println(processo + " está atualmente na região "+ regioes);
            regioes -= 1;
           
        }
        
    }
    
}

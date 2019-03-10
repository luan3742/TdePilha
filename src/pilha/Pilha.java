/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author Luan Magalhães, João Pedro, Andrey Silveira
 */
public class Pilha {

    private int topo;
    private int[] dado;
    private int max;

    public Pilha(int tamanhoVetor) {
        this.dado = new int[tamanhoVetor];
        this.max = 0;
        this.topo = 0;
    }

    Pilha(){
        super();
    }

    public void empilha(int elemento) {
        if (this.max < this.dado.length) {
            this.dado[max] = elemento;
            this.max++;
            this.topo++;
        }
    }

    public void topo() {
        System.out.println("O topo da pilha é: " + this.dado[this.max - this.topo]);
    }

    public boolean vazia() {
        if (this.max == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int cheia() {
          if(this.max == this.dado.length){
              return 1;
          }else{
              return 0;
          }
    }
    
    public Object desempilha(){
        if (this.vazia() == true){
            return "A pilha esta vazia, Impossível desempilhar";
        }
        return this.dado[--max];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < this.max; i++) {
            s.append(this.dado[i]);
            s.append("\n");

        }
        return s.toString();

    }

}

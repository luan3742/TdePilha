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

    private Object[] dado;
    private int max;

    public Pilha(int tamanhoVetor) {
        this.dado = new Object[tamanhoVetor];
        this.max = 0;
    }

    Pilha() {
        this(10);
    }

    public void empilha(Object elemento) {
        if (this.max < this.dado.length) {
            this.dado[this.max] = elemento;
            this.max++;
        }
    }

    public void topo() {
        System.out.println("O topo da pilha é: " + this.dado[this.max - 1]);
    }

    public boolean vazia() {
        if (this.max == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int cheia() {
        if (this.max == this.dado.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public Object desempilha() {
        if (this.vazia() == true) {
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

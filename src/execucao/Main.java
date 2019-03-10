/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import pilha.Pilha;

/**
 *
 * @author Luan
 */
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);
        
        for (int i = 0; i <10; i++) {
            pilha.empilha(i);
        }
        
        System.out.println("Elemento empilhados");
        
        System.out.println(pilha);
        
        System.out.println("");
        System.out.println("Elemento desempilhado: "+ pilha.desempilha());
        
        System.out.println("");
        System.out.println("Elementos empilhados sem o elemento desempilhado");
        
        System.out.println(pilha);
       
        
        
        
        
    }
}

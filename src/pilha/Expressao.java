/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author Luan
 */
public class Expressao{
    
    
    public static Object verificaExpressao(String entrada){
      Pilha pilha = new Pilha();  
        
        String invalido = entrada + " Expressão Inválida";  
        
        for (int i = 0; i < entrada.length(); i++) {
            char busca = entrada.charAt(i);

            if (busca == '(' || busca == '{' || busca == '[') {
                pilha.empilha(busca);
            } else if (busca == ')') {
                if (pilha.vazia()|| !(pilha.desempilha().equals('('))) {
                    return invalido;
                } else if (busca == '}') {
                    if (pilha.vazia() || !(pilha.desempilha().equals('}'))) {
                        return invalido;
                    } else if (busca == ']') {
                        if (pilha.vazia()|| !(pilha.desempilha().equals('['))) {
                            return invalido;
                        }
                    }

                }
            }
        }
        String valida = entrada + " é válida";

        return pilha.vazia() ? valida : invalido;
    }

    public static void main(String[] args) {

        String exp1 = "(1+5)*(56+12)"; // válida
        String exp2 = "(1+5)*)56+12)"; // inválida
        String exp3 = "(1+5)*[56+12)"; // inválida
        String exp4 = "(((1+2) - 3 )* 6)"; // válida		

        System.out.println(verificaExpressao(exp1));
        System.out.println(verificaExpressao(exp2));
        System.out.println(verificaExpressao(exp3));
        System.out.println(verificaExpressao(exp4));

    }

   
    
}

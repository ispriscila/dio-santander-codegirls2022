package one.digitalinnovation.basecamp;
/* Classe de exemplo para o exercício da aula 01 de Varíáveis, Tipos de Dados e Operadores Aritméticos */

import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args){
        int i;
        //int i; não pode ter o mesmo nome
        int I;
        //int 1i; não pode começar com nº
        int _i; // mas, deve ser evitado
        int $i; // mas, deve ser evitado
        // dentro dos métodos, inicializar as variáveis

        i = 5;
        I = 18;
        _i = 28;
        $i = 36;

        final int j = 10; //final é constante
        //j = 15;
        int asmrer566amsf; //nao usual
        //int asmrer56 6amsf; nao pode espaços
        int asmrer$566amsf; //nao usual $
        //int asmrer%566amsf; //nao %%

        //valores iniciais
        asmrer566amsf = 105;
        asmrer$566amsf = 219;

        // expressividade nos nomes, letra minuscula inicial e notação camelo
        int quantidadeProduto = 50;
        //int QuantidadeProduto embora nao de erro, má pratica
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas; má prática;
        int NUMERO_TENTATIVA = 25; //má pratica apesar de nao gerar erro
        //int qdtProd; falha na expressividade, mesmo que nao de erro

        System.out.println(i);
        System.out.println(I);
        System.out.println(_i);
        System.out.println($i);

        System.out.println(j);
        System.out.println(asmrer566amsf);
        System.out.println(asmrer$566amsf);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(NUMERO_TENTATIVA);


    }

}

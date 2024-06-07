package condicao;

public class CondicaoIF {


    public static void main(String[] args) {
     /*
        if(condicao) {
            // Bloco de código
        } else {
            // Bloco de código
        }
     */

       int a = 30;
       int b = 20;

       boolean aMaiorQueB = a > b;

       boolean aIgualB = a == b;

         if(aMaiorQueB) { // neguei a variaval
              System.out.println("A é maior que B");
         } else if(aIgualB) {
             System.out.println("A é igual a B");
         }else{
             System.out.println("A é menor que B");
         }

    }
}

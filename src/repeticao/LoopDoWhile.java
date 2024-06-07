package repeticao;

public class LoopDoWhile {

    /*
     *   do{
     *      //bloco de codigo
     *   }while(<condicao>
     *
     */

    public static void main(String[] args) {

        int contador = 10;

        do{
            contador +=10;
            contador = contador + 10;
            System.out.println(" Contador = "+ contador);

        }while ( contador < 100);
    }

}

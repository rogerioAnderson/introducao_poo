package repeticao;

public class LoopFor {
    public static void main(String[] args) {
       /*
            for(<declaracao>; <condicao>; <instrucao> ){

                    bloco de codigo

            }
        */


       //imprimir um numero de 1 a 10
        int contador = 0;
       for( contador = 1; contador <= 10 ; ++contador){
                System.out.println(contador);
       }

       System.out.println("final do codigo contador = "+contador);

    }
}

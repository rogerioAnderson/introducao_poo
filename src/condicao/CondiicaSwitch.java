package condicao;

public class CondiicaSwitch {


    //swtuich case com opcoes de 1 a 7
    public static void main(String[] args) {

        int numero = 4;

        switch (numero) {
            case 1:
                System.out.println("Numero 1");
                break;
            case 2:
                System.out.println("Numero 2");
                break;
            case 3:
                System.out.println("Numero 3");
                break;
            default:
                System.out.println("O numero não foi encontrado");
        }


    }
}

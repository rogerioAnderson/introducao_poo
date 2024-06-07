package calculadora;

public class Calculadora {


    public static void main(String [] arg){
        Calculadora calculadora = new Calculadora();

        //quanto 50 representa o percentual 500
        // passo - multiplicar 50*500 ((500/50)*100)

        float resultadoDivisao = calculadora.divdir(50.50f,500);

        System.out.println("Resultado da divisao:" + resultadoDivisao);

        float percentual = calculadora.multiplicar(resultadoDivisao,100);

        System.out.println("O resultado é "+percentual+"%");


    }

    public float somar(float a,float b){
        float resultado = a+b;
        return resultado;
    }


    public float subtrair(float a, float b){
        float resultado = a - b;
        return resultado;
    }

    public float multiplicar(float a, float b){
        float resultado = a * b;
        return resultado;
    }

    public float divdir(float a, float b){
        float resultado = a/b;
        return resultado;
    }






}

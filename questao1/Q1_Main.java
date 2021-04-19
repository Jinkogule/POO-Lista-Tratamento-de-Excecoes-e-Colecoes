package lista6.questao1;

/*
O "IllegalArgumentException" é lançado quando o argumento de um método é passado de maneira imprópria ou ilegal.

O "NumberFormatException" é lançado para indicar que o aplicativo tentou converter uma string em um dos tipos
numéricos, mas que a string não tem o formato apropriado.
*/

public class Q1_Main {
    public static void main(String[] args) {
        //tratando o IllegalArgumentException
        try{
            div(7,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage()+"\n");
        }

        //tratando o NumberFormatException
        try{
            Integer.parseInt("78633873467373463834623873247342");
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro, não foi possível converter a string para o número desejado.");
        }
    }

    public static int div(int x, int y){
        if (y == 0){
            throw new IllegalArgumentException("Divisor não pode ter valor 0!");
        }
        return x/y;
    }
}
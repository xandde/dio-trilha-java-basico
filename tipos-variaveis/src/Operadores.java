public class Operadores {
    public static void main(String[] args) {
     /*   int numero = 5;

        System.out.println(numero); */


        // OPERADORES CONDICIONAIS

      /*  int a, b;

        a = 5;
        b = 6;

        if (a==b){
            System.out.println("verdadeiro");
        }
        else {
           System.out.println("falso"); 
        } */
        
        // OPERADORES RELACIONAIS

         int numero1 = 1;
         int numero2 = 2;

         boolean simNao = numero1 == numero2;

         System.out.println("numeroUm é igual a numeroDois?" + simNao);

         simNao = numero1 != numero2;

         System.out.println("numeroUm é diferente de numeroDois?" + simNao);

         simNao = numero1 > numero2;

         System.out.println("numeroUm é maior que numeroDois?" + simNao);


    }
}
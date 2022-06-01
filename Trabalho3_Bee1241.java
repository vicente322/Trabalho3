/**Encaixa ou não II
*
*@authors Vicente Hofmesiter, Gabriel Grossi
*@version 2022-06-01
*
*/

import java.util.Scanner;

public class Main{

      public static void ConfereEncaixe(int valorA, int valorB){
            int c = 1;
            String a, b;

            if (valorA >= valorB){

                  a = "" + valorA;
                  b = "" + valorB;

                  for (int i = b.length(); i > 0; i--){

                        if (a.charAt(a.length() - c) != b.charAt(b.length() - c)){
                              System.out.println("nao encaixa");
                              break;
                        }
                        else if (i == 1){
                              System.out.println("encaixa");
                        }

                        c++;
                  }


            }
            else{
                  System.out.println("nao encaixa");
            }
      }

      public static void main(String args[]){
            Scanner sc;
            int testes;
            int valorA, valorB;

            sc = new Scanner(System.in);
            testes = sc.nextInt();

            for (int t = 1; t <= testes; t++){

                  valorA = sc.nextInt();
                  valorB = sc.nextInt();

                  ConfereEncaixe(valorA, valorB);
            }
      }
}

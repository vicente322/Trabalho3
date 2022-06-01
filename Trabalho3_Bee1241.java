import java.util.Scanner;
import java.io.IOException;

/**Encaixa ou não II
*
* A classe Main recebe um valor referente ao numero de testes desejados. Ela então realiza a quantidades de testes indicado, recebendo, a cada teste, dois valores
* inteiros A e B. Os valores são então comparados, de forma que, se B é igual aos valores finais de A, eles são considerados como um encaixe.
*
* Este programa esta em https://github.com/vicente322/Trabalho3
*
*@authors Vicente Hofmesiter, Gabriel Grossi
*@version 2022-06-01
*
*/

public class Main{

      public static void ConfereEncaixe(String a, String b){
            int c = 1;

            if (a.length() >= b.length()){

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

      public static void main(String args[]) throws IOException{
            Scanner sc;
            int testes;
            String a, b;

            sc = new Scanner(System.in);
            testes = sc.nextInt();

            for (int t = 1; t <= testes; t++){

                  a = sc.next();
                  b = sc.next();

                  ConfereEncaixe(a, b);
            }
            sc.close();
      }
}

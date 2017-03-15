
package maiormenor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

  private void executar(){
      
      int [] numeroVetor = new int[5];
      Scanner s= new Scanner(System.in);
      for(int i=0;i<5;i++){
          Integer numero = Integer.parseInt(s.nextLine());
          numeroVetor[i]= numero;
      }
      int maior = numeroVetor[0];
      int menor=numeroVetor[0];
      for(int i=1;i<5;i++){
          if(maior<numeroVetor[i]){
              maior= numeroVetor[i];
          }
          if(menor> numeroVetor[i]){
              menor= numeroVetor[i];
          }
      }
      System.out.println(maior);
      System.out.println(menor);
  }
    public static void main(String[] args) {
        Main main= new Main();
        main.executar();
        
    }
    
}

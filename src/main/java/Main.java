import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vamos calcular o imc e classificar o  seu grau de imc");
   System.out.println("");
    System.out.println("digite qual é sua altura ");
    double altura = sc.nextDouble();
    System.out.println("");
    System.out.println("digite qualquer é seu peso");
    double peso = sc.nextDouble();
System.out.println("");
    double imc = peso / (altura*altura);
    System.out.printf(" o seu imc é de %.2f Kg/m ", imc);
    System.out.println("");
    if(imc<16.9){
    System.out.println(" você está muito abaixo do peso");
    }
    if(imc>16.9 & imc<18.5){
      System.out.println("você está abaixo do peso"); 
    }
    if(imc>18.5 & imc<24.9){
    System.out.println("voce esta no peso normal");
    }
   if(imc>25 & imc<29.9){
     System.out.println("você está acima do peso");
   }
 if(imc<30 & imc>34.9){
   System.out.println("você está em obesidade de grau 1 " );
 }
  if (imc<35 & imc>40){
    System.out.println("você está em obesidade de grau 2");
  }
  if(imc>40){
  System.out.println("voce esta em obesidade grau 3");
  }


    sc.close();
  }
}
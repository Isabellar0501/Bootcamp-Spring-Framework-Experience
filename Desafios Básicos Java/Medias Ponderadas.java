// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;

import java.text.DecimalFormat;



 

public class Program

{

  public static void main(String[] args)

  {

    Scanner input = new Scanner(System.in);

    

    int casos = input.nextInt();

    int cont = 0;

    while (cont < casos){

 

      double a = input.nextDouble();

      double b = input.nextDouble();

      double c = input.nextDouble();

       

      double mediaPonderada= ((a*2)+(b*3)+(c*5))/10;

      

     // DecimalFormat df= new DecimalFormat("###.0");

     // System.out.println(df.format(mediaPonderada));

      System.out.println(String.format("%.1f", mediaPonderada));

      cont++;

      

    }
  }

  }
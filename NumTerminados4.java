
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class NumTerminados4
{
    private static int arreglo[];

    public static void main(String[] args)
    {
	arreglo = new int[10];
        llenarManual();
	terminadoen4();
    }

    public static void llenarManual()
    {
        Scanner sC = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++)
        {
            arreglo[i] = sC.nextInt();
        }
    }
        
    public static void terminadoen4()
    {
        for (Integer i = 0; i < arreglo.length; i++)
        {
            String aCadena = String.valueOf(arreglo[i]);
            if(aCadena.charAt(aCadena.length()-1) == '4')
            {
                System.out.println("Posicion "+i+" numero "+arreglo[i]);
            }
            
        }
    }

   
}

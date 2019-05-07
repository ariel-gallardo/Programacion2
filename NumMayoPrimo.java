
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
public class NumMayoPrimo
{
    private static int arreglo[];

    public static void main(String[] args)
    {
	arreglo = new int[10];
        llenarManual();
        System.out.println("posicion de numero Mayor: "+posMayor());
    }
    public static void llenarManual()
    {
        Scanner sC = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++)
        {
            arreglo[i] = sC.nextInt();
        }
    }

    public static int posMayor()
    {
        int resultado = 0;
        int Mayor = arreglo[0];
        
        for (int i = 0; i < arreglo.length; i++)
        {
            if(arreglo[i] > Mayor)
            {
                    Mayor = arreglo[i];
                resultado = i;
            }
        }
        return resultado;
    }
}


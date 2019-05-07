
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
public class NumMayor
{
    	private static int arreglo[];

	public static void main(String[] args)
        {
	    arreglo = new int[10];
            int temp = 0;
            llenarManual();
            temp = posMayorPrimo();
            System.out.println("posicion de numero Mayor Primo: "+
                                temp != null ? temp : "no existe." );
	}
        
    public static void llenarManual()
    {
        Scanner sC = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++)
        {
            arreglo[i] = sC.nextInt();
        }
    }

    private static boolean esPrimo(int Numero)
    {
        boolean primo = true;
        if(Numero > 1)
        {
            for (int i = 2; i < Numero; i++)
            {
                if( (Numero % i) == 0 && Numero != i )
                {
                    primo = false;
                }
            }
        }
        else
        {
            primo = false;
        }
        return primo;
    }

    public static int posMayorPrimo()
    {
        int resultado = 0, Mayor = 0;
        for(int Numero : arreglo)
        {
            if(esPrimo(Numero))
            {
                Mayor = Numero;
                break;
            }
            resultado++;
        }
        
        for (int i = 0; i < arreglo.length; i++)
        {
            if(arreglo[i] > Mayor && esPrimo(arreglo[i]))
            {
                    Mayor = arreglo[i];
                resultado = i;
            }
        }
        return esPrimo(resultado) ? resultado : null;
    }
}

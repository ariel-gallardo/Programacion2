/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class NumPrimos2
{
   private static int arreglo[];
   
   public static void main(String[] args)
   {
        arreglo = new int[10];
	llenar100y300();
        
        for(int Primo : arreglo)
        {
            System.out.print(" "+Primo+" ");
        }
        System.out.println();
	
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

    public static void llenar100y300()
    {
        int reintentar = 0;
        for (int i = 0; i < arreglo.length; i++)
        {
            int numero = (int) ((Math.random()*300)+100);
            if(esPrimo(numero))
            {
                arreglo[i] = numero ;
                reintentar = i;
            }
            else
                i = reintentar;
        }
    }
}

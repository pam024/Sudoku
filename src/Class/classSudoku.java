/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alejandra Ospina y Pamela Mena
 */
public class classSudoku 
{
    
    public int grid[][];//Inicializacion matriz

    public classSudoku()
    {
        grid=new int [9][9];//Matriz de 9x9, 81 celdas       
        
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j]=0;    
    }
    
    //Obtiene una lista de celdas vacias del grid del sudoku
    public  int[][] getFreeCellList(int[][] grid) 
    {
       int numberOfFreeCells = 0;//Determina el numero de celdas vacias
       for (int i = 0; i < 9; i++)
       for (int j = 0; j < 9; j++)
           if (grid[i][j] == 0)
               numberOfFreeCells++;

       int[][] freeCellList = new int[numberOfFreeCells][2];//Almacena las posiciones de las celdas libres en vacias en una matriz
       int count = 0;
       for (int i = 0; i < 9; i++)
           for (int j = 0; j < 9; j++)
               if (grid[i][j] == 0) 
               {
                   freeCellList[count][0] = i;
                   freeCellList[count++][1] = j;
               }
       return freeCellList;//Retorna matriz de celdas vacias 
    }


    //Busca las posibles soluciones al sudoku que se genero
    public  ArrayList<String> search() 
    {
       ArrayList<String> result = new ArrayList<>();//Array para alamcenar solucion   
       int[][] freeCellList = getFreeCellList(grid);//Celdas libres

       if (freeCellList.length == 0) 
       {
           result.add(gridToString(grid));
           return result;
       }

       int k = 0;//Empieza desde la primera celda vacia
       while (true) 
       {
           int i = freeCellList[k][0];//Por filas
           int j = freeCellList[k][1];//Por columnas
           if (grid[i][j] == 0) 
           {
               grid[i][j] = 1;
           }

           boolean valid = false;

           if (isValid(i, j, grid)) //valida si es posible colocar el numero en la celda
           {
               valid = true;
               if (k + 1 == freeCellList.length) 
               {//Cuando llega al final de la lista añade solucion
                   result.add(gridToString(grid));
                   valid = false;
               } 
               else 
               {//si no se mueve a la siguiente celda vacia
                   k++;
               }
           }

           if (!valid) 
           {
               if (grid[i][j] < 9) 
               {
                   grid[i][j] = grid[i][j] + 1;//Llena la celda vacia con el siguiente valor posible 
               } 
               else 
               {
                   while (grid[i][j] == 9) 
                   {
                       if (k == 0) 
                       {
                           return result;//Si no hay mas resultados retorna array final de soluciones
                       }
                       grid[i][j] = 0;//Restablece las celdas vacias por backtraking
                       k--;//Retrocede a la celda vacia a continuacion
                       i = freeCellList[k][0];
                       j = freeCellList[k][1];
                   }
                   //LLena la celda vacia con el siguiente valor posible y
                   //continua la busqueda de celdas desde k
                   grid[i][j] = grid[i][j] + 1;
               }
           }
       }
    }

    //Revisa si las filas, columnas y bloques son validas en el grid
    public  boolean isValid(int i, int j, int[][] grid) 
    {
       //Valida si grid[i][j] es valido en las todas sus columnas j
       for (int column = 0; column < 9; column++)
           if (column != j && grid[i][column] == grid[i][j])
               return false;
       //Valida si grid[i][j] es valido en las todas sus filas i
       for (int row = 0; row < 9; row++)
           if (row != i && grid[row][j] == grid[i][j])
               return false;
       //Valida si grid[i][j] es valido en los bloques de 3x3
       for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
           for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
               if (row != i && col != j && grid[row][col] == grid[i][j])
                   return false;

       return true; //Devuelve verdadero cuando los valores actuales en grid[i][j] son validos
    }

    //Convierte a string la matriz
    public  String gridToString(int[][] grid) 
    {
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < 9; i++) 
       {
           for (int j = 0; j < 9; j++) 
           {
               result.append(grid[i][j] + " ");
           }
           result.append('\n');
       }
       return result.toString();
    } 


    //Valida la matriz con la reglas de sudoku
    public  boolean isValid(int[][] grid) 
    {
       for (int i = 0; i < 9; i++)
           for (int j = 0; j < 9; j++)
               if (grid[i][j] < 0 || grid[i][j] > 9 || (grid[i][j] != 0 && !isValid(i, j, grid)))
                   return false;
       return true; //Devuelve verdadero si las celdas son validas
    }


   //Genera numeros aleatorios del 1 al 9 en el grid al igual que llena algunas celdas de 0 aleatoreamente
   public void generate()
   {
        while(true)
        {
           int p = 0; //Cuantos espacios se 
           
           Random r = new Random();//Inicializa un numero random

           int firstval = r.nextInt(9); //Primer valor a colocar entre el 1 y 9 a colocar en el grid

           int x = firstval, v = 1;
           
           //Dos matrices 
           int a[][] = new int[9][9]; //Para generara un sudoku completo
           int b[][] = new int[9][9]; //Para almarcenar ciertos numeros de la matriz a
           
        
           //Algoritmo para generar una matriz de soduku completa
            for (int i = 0; i < 9; i++) 
            {
               for (int j = 0; j < 9; j++) 
                {
                    if ((x + j + v) <= 9)
                        a[i][j] = j + x + v;
                    else
                        a[i][j] = j + x + v - 9;
                }
                x += 3;
                if (x >= 9)
                    x = x - 9;

                if (i == 2) 
                {
                   v = 2;
                   x = firstval;
                }
                if (i == 5) 
                {
                   v = 3;
                   x = firstval;
                } 
            }
            
        
            p=(int) (Math.random()*(70-30+1)+30);//Posiciones que ya esten llenas  

            //Lazo que recorre filas y columnas elegir celdas en un rango de 0 a 8
            for(int i=0;i<p;i++)
            {
               int e=(int)(Math.random()*(8-0+1)+0);//Posiciones aleteatorias filas 
               int q=(int)(Math.random()*(8-0+1)+0);//Posiciones aleteatorias columnas
               b[e][q]=a[e][q];
            }

            //Valida que los numeros en el grid sean un juego de sudoku posible 
            if(isValid(b))
            { 
                //Lazo copia el problema del sudoku en el grid 
                for(int i=0; i<9; i++)
                {
                    System.arraycopy(b[i], 0, grid[i], 0, 9);
                }
               
                break;
                
            }
        }
    }
}


    


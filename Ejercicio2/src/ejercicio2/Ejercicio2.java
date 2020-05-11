
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       Cliente [] cl;
       Mascota [] m;
       int contadorEdad=0;
       int acumuladorEdad=0;
       
       System.out.println("Ingrese la cantidad de Clientes: ");
       int cantidadCliente=sc.nextInt();
        
        cl=new Cliente [cantidadCliente];
        m=new Mascota[cantidadCliente];
        for (int i = 0; i < cl.length; i++) {
            
            
          System.out.println("Ingrese el Número de Cliente: ");
          int nroCliente=sc.nextInt();
        
          System.out.println("Ingrese el Nombre de Cliente: ");
          sc.nextLine();
          String nombreCliente=sc.nextLine();
        
          System.out.println("Ingrese la Antiguedad del Cliente: ");
          int antiguedad=sc.nextInt();
        
          System.out.println("Ingrese el Nombre de la Mascota: ");
          sc.nextLine();
          String nombreMascota=sc.nextLine();
        
          System.out.println("Ingrese la edad de la Mascota: ");
          int edad=sc.nextInt();
          acumuladorEdad += edad;
          contadorEdad ++;
        } 
        
        System.out.println("La cantidad de Clientes es: "+cantidadCliente); 
        
       
        System.out.println("El promedio de Edad de las Mascotas es:" +acumuladorEdad/contadorEdad);
        
        
  
        int antiguedad=0;
        for (int i = 0; i < m.length; i++) {
            if (cl[i]!=null && cl[i].getAntiguedad()>=5 ) {
                
            }
            
        }
        System.out.println("La cantidad de Clientes con una antiguedad mayor o igual a 5 son:"+ antiguedad+cantidadCliente );
                              
        
    }
    
}

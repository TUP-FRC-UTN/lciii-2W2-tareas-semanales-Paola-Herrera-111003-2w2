
package ejercicio2;

public class Cliente {
     private int nroCliente;
     private String nombreCliente;
     private int antiguedad;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Cliente(int nroCliente, String nombreCliente, int antiguedad) {
        this.nroCliente = nroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
    }
    
     public Cliente(){
     }

    @Override
    public String toString() {
        return "Nro Cliente: " + nroCliente +""+ "Nombre de Cliente: "+nombreCliente 
               +"/"+"Antiguedad: "+antiguedad;
               
    }
     
    
}

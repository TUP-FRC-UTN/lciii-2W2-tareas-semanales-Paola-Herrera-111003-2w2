
package ejercicio2;

public class Mascota {
   private String nombreMascota;
   private int edad;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota(String nombreMascota, int edad) {
        this.nombreMascota = nombreMascota;
        this.edad = edad;
    }
   
   public Mascota(){
   }

    @Override
    public String toString() {
        return "Nombre de Mascota: "+ nombreMascota +"/"+"Edad de la Mascota: " + edad;
    }
   
}

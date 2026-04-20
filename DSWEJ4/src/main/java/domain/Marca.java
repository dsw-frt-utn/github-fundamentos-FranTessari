
package domain;

public class Marca {
    
    public String Nombre;
    public String Pais; 
 
    public Marca (String nombre, String pais){
        this.Nombre = nombre;
        this.Pais = pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

}
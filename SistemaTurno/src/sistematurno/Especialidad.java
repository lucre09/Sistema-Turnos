
package sistematurno;

/**
 *
 * @author Usuario
 */
public class Especialidad {
    private String nombre;
    private String descripcion;

    public Especialidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String mostrar(){
        return "Nombre: " +this.getNombre()+ " - Descripcion: " + this.getDescripcion();
    }
}

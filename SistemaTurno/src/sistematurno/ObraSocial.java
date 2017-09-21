
package sistematurno;

/**
 *
 * @author Usuario
 */
public class ObraSocial {
    private String nombre;
    private String numSocio;

    public ObraSocial(String nombre, String numSocio) {
        this.nombre = nombre;
        this.numSocio = numSocio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumSocio() {
        return this.numSocio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }
    public String mostrar(){
        return this.getNombre()+ " - Nº socio: " + this.getNumSocio();
    }
}


package sistematurno;

/**
 * Esta clase permite crear objetos direccion, segun leyes argentinas
 * @author Lucrecia
 */
public class Direccion {
    private String barrio;
    private String calle;
    private String numero;
    private String piso;
    private String departamento;
    private String casa;
    private String manzana;
    private String CP;

    public Direccion(String barrio, String calle, String numero, String piso, 
            String departamento, String casa, String manzana, String CP) {
        this.barrio = barrio;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.casa = casa;
        this.manzana = manzana;
        this.CP = CP;
    }

    public String getBarrio() {
        return this.barrio;
    }

    public String getCalle() {
        return this.calle;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getPiso() {
        return this.piso;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getCasa() {
        return this.casa;
    }

    public String getManzana() {
        return this.manzana;
    }

    public String getCP() {
        return this.CP;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }
    
    public String mostrar(){
        return "Calle: " + this.getCalle()+"\t"
                + "N°: " + this.getNumero()+"\n"
                + "Barrio: " + this.getBarrio()+"\t"
                + "Casa: " + this.getCasa()+"\n"
                + "Mzn: " + this.getManzana()+"\t"
                + "Piso: " + this.getPiso()+"\n"
                + "Departamento: " + this.getDepartamento()+"\t"
                + "Codigo Postal: " + this.getCP();
    }
    
    
}

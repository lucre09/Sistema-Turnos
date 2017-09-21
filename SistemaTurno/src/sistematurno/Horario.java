
package sistematurno;

/**
 *
 * @author Usuario
 */
public class Horario {
    private String dia;
    private String horaDesde;
    private String horaHasta;

    public Horario(String dia, String horaDesde, String horaHasta) {
        this.dia = dia;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
    }

    public String getDia() {
        return dia;
    }

    public String getHoraDesde() {
        return horaDesde;
    }

    public String getHoraHasta() {
        return horaHasta;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHoraDesde(String horaDesde) {
        this.horaDesde = horaDesde;
    }

    public void setHoraHasta(String horaHasta) {
        this.horaHasta = horaHasta;
    }
    
    public String mostrar(){
        return this.getDia()+ "Desde: " + this.getHoraDesde()+ " - Hasta:"+ this.getHoraHasta();
    }
}

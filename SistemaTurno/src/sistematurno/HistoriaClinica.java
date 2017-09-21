
package sistematurno;

import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
class HistoriaClinica {
    private int num;
    private String descripcion;
    private GregorianCalendar fecha;
    private Medico medico;
    private Paciente paciente;

    public HistoriaClinica(int num, String descripcion, GregorianCalendar fecha, 
            Medico medico, Paciente paciente) {
        this.num = num;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getNum() {
        return this.num;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public GregorianCalendar getFecha() {
        return this.fecha;
    }

    public Medico getMedico() {
        return this.medico;
    }
    
    public Paciente getPaciente(){
        return this.paciente;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    
    private String mostrar(){
        return "Fecha: "+ this.getFecha()+
                "Medico: "+ this.getMedico()+
                "Descripcion: "+ this.getDescripcion()+
                "Paciente: "+ this.getPaciente();
    }
}

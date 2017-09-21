
package sistematurno;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
class Medico {
    private int dni;
    private String nombre;
    private String apellido;
    private int MN;
    private int MPE;
    boolean estado;
    private ArrayList<Especialidad> especialidades;
    private ArrayList<Horario> horarios;

    public Medico(int dni, String nombre, String apellido, int MN, int MPE, 
            boolean estado, ArrayList<Especialidad> especialidades, 
            ArrayList<Horario> horarios) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.MN = MN;
        this.MPE = MPE;
        this.estado = estado;
        this.especialidades = especialidades;
        this.horarios = horarios;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMN() {
        return MN;
    }

    public int getMPE() {
        return MPE;
    }

    public boolean isEstado() {
        return estado;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMN(int MN) {
        this.MN = MN;
    }

    public void setMPE(int MPE) {
        this.MPE = MPE;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }
    
    private String mostrar(){
        return "Nombre y apellido: "+ this.getNombre()+ this.getApellido()
                +"\nDNI: "+this.getDni()
                +"\nMN: "+this.getMN() +"\tMPE: "+this.getMPE()
                +"\nEspecialidades: "+this.nombresEspecialidades()
                +"\nHorario: "+this.getHorarios()
                +"\n";            
    }
    private String nombresEspecialidades(){
        String dev = "";
        int i = 1;
        for(Especialidad e: this.getEspecialidades()){
            dev += "Especialidad "+ i + ": "+ e.getNombre();
            i++;
        }
        return dev;
       
    }
    private String horarios(){
        String dev = "";
        int i = 1;
        for(Horario h: this.getHorarios()){
            dev += h.mostrar()+"\n";
            i++;
        }
        return dev;
    }
     public static boolean atenderTurno(Turno turno){
        return turno.cambiarEstado("Atendiendo");
    }
     
    public boolean registrarHC(Turno t, String descripcion, int num){
        Paciente p = t.getPaciente();
        GregorianCalendar f = t.getFecha();
        HistoriaClinica c = new HistoriaClinica(num, descripcion, f, this, p);
        return p.addHistoriaClinica(c);
    }
    
     public ArrayList<Turnos> obtenerTurnos(GregorianCalendar fecha = null){
         
          if(fecha != null){
              return Turno.obtenerTurnos(this.fecha);//es un método de clase
           }
           else{
               GregorianCalendar hoy = GregorianCalendar.today();
               GregorianCalendar semanaSig = hoy +7;
               return Turno.obtenerTurnos(this.hoy, semanaSig);
           }
     }
     
    
}

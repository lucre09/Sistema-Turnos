
package sistematurno;

/**
 *
 * @author Usuario
 */
public class Telefono {
    private int numero;
    private int codigoPais;
    private int codigoArea;
    
    public Telefono(int codigoPais, int codigoArea, int numero) {
        this.codigoPais = codigoPais;
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public int getCodigoPais() {
        return this.codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public int getCodigoArea() {
        return this.codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String mostrar() {
        return "+" + this.getCodigoPais()
                + " " + this.getCodigoArea()
                + " " + this.getNumero();
    }

}


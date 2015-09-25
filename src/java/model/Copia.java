package model;

// @author Anpix

public class Copia {
    private Integer prxNumero = 1;
    private Integer numero;
    private Boolean fixo;

    public Copia(Boolean fixo) {
        this.fixo = fixo;
        this.numero = prxNumero;
        prxNumero++;
    }
    
    
    
    
    
    public Integer getNumero() {
        return numero;
    }

    public Integer getPrxNumero() {
        return prxNumero;
    }

    public void setPrxNumero(Integer prxNumero) {
        this.prxNumero = prxNumero;
    }

    public Boolean getFixo() {
        return fixo;
    }

    public void setFixo(Boolean fixo) {
        this.fixo = fixo;
    }


    
    
    
}

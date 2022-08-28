package domain;

import service.TipoTelefono;

import java.util.Objects;

public class Telefono {
    private TipoTelefono tipoTelefono;
    private String indicativoPais;
    private String numero;

    public Telefono(TipoTelefono tipoTelefono, String indicativoPais, String numero) {
        this.tipoTelefono = tipoTelefono;
        this.indicativoPais = indicativoPais;
        this.numero = numero;
    }

    public TipoTelefono getTipoTelefono() {
        return tipoTelefono;
    }

    public String getIndicativoPais() {
        return indicativoPais;
    }

    public String getNumero() {
        return numero;
    }

    public void setTipoTelefono(TipoTelefono tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public void setIndicativoPais(String indicativoPais) {
        this.indicativoPais = indicativoPais;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono = (Telefono) o;
        return indicativoPais.equals(telefono.indicativoPais)&& numero.equals(telefono.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indicativoPais, numero);
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "tipoTelefono=" + tipoTelefono +
                ", indicativoPais='" + indicativoPais + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

}

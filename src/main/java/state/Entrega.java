package state;

public class Entrega {
    private String codigo;
    private EntregaEstado estado;

    public Entrega() {
        this.estado = EntregaEstadoPendente.getInstance();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EntregaEstado getEstado() {
        return estado;
    }

    public void setEstado(EntregaEstado estado) {
        this.estado = estado;
    }

    public String tornarPendente() {
        return estado.tornarPendente(this);
    }

    public String cancelar() {
        return estado.cancelar(this);
    }

    public String finalizar() {
        return estado.finalizar(this);
    }
}

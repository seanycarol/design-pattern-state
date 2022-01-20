package state;

public class EntregaEstadoPendente implements EntregaEstado {

    private static EntregaEstadoPendente instance = new EntregaEstadoPendente();

    private EntregaEstadoPendente() {
    }

    public static EntregaEstadoPendente getInstance() {
        return instance;
    }

    @Override
    public String tornarPendente(Entrega entrega) {
        entrega.setEstado(EntregaEstadoPendente.getInstance());
        return "Pendência não realizada";
    }

    @Override
    public String cancelar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoCancelada.getInstance());
        return "Cancelamento realizado";
    }

    @Override
    public String finalizar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoFinalizada.getInstance());
        return "Finalização realizada";
    }
}

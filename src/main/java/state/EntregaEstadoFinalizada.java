package state;

public class EntregaEstadoFinalizada implements EntregaEstado {

    private static EntregaEstadoFinalizada instance = new EntregaEstadoFinalizada();

    private EntregaEstadoFinalizada() {
    }

    public static EntregaEstadoFinalizada getInstance() {
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
        return "Cancelamento não realizado";
    }

    @Override
    public String finalizar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoFinalizada.getInstance());
        return "Finalização não realizada";
    }
}

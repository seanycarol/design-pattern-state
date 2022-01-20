package state;

public class EntregaEstadoCancelada implements EntregaEstado {

    private static EntregaEstadoCancelada instance = new EntregaEstadoCancelada();

    private EntregaEstadoCancelada() {
    }

    public static EntregaEstadoCancelada getInstance() {
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
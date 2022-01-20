package state;

public interface EntregaEstado {
    String tornarPendente(Entrega entrega);
    String cancelar(Entrega entrega);
    String finalizar(Entrega entrega);
}

package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {

    Entrega entrega;

    @BeforeEach
    public void setUp() {
        entrega = new Entrega();
    }

    @Test
    public void naoDeveTornarPendenteEntregaPendente() {
        entrega.setEstado(EntregaEstadoPendente.getInstance());
        assertEquals("Pendência não realizada", entrega.tornarPendente());
    }

    @Test
    public void deveCancelarEntregaPendente() {
        entrega.setEstado(EntregaEstadoPendente.getInstance());
        assertEquals("Cancelamento realizado", entrega.cancelar());
    }

    @Test
    public void deveFinalizarEntregaPendente() {
        entrega.setEstado(EntregaEstadoPendente.getInstance());
        assertEquals("Finalização realizada", entrega.finalizar());
    }

    @Test
    public void naoDeveTornarPendenteEntregaCancelada() {
        entrega.setEstado(EntregaEstadoCancelada.getInstance());
        assertEquals("Pendência não realizada", entrega.tornarPendente());
    }

    @Test
    public void naoDeveCancelarEntregaCancelada() {
        entrega.setEstado(EntregaEstadoCancelada.getInstance());
        assertEquals("Cancelamento não realizado", entrega.cancelar());
    }

    @Test
    public void naoDeveFinalizarEntregaCancelada() {
        entrega.setEstado(EntregaEstadoCancelada.getInstance());
        assertEquals("Finalização não realizada", entrega.finalizar());
    }

    @Test
    public void naoDeveTornarPendenteEntregaFinalizada() {
        entrega.setEstado(EntregaEstadoFinalizada.getInstance());
        assertEquals("Pendência não realizada", entrega.tornarPendente());
    }

    @Test
    public void naoDeveCancelarEntregaFinalizada() {
        entrega.setEstado(EntregaEstadoFinalizada.getInstance());
        assertEquals("Cancelamento não realizado", entrega.cancelar());
    }

    @Test
    public void naoDeveFinalizarEntregaFinalizada() {
        entrega.setEstado(EntregaEstadoFinalizada.getInstance());
        assertEquals("Finalização não realizada", entrega.finalizar());
    }
}
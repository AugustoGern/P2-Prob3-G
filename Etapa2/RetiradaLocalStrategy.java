
/**
 *
 * @author akrehn
 */
public class RetiradaLocalStrategy implements EntregaStrategy {

    private static RetiradaLocalStrategy instancia;

    public static RetiradaLocalStrategy getInstancia() {
        if (instancia == null) {
            instancia = new RetiradaLocalStrategy();
        }
        return instancia;
    }

    @Override
    public double getValor(Pedido pedido) {
        return 0;
    }

}

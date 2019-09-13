
/**
 *
 * @author akrehn
 */
public class Produto {

    private String descricao;
    private double valor;
    private int peso;

    public Produto(String descricao, double valor, int peso) {
        setDescricao(descricao);
        setValor(valor);
        setPeso(peso);
    }

    public void setPeso(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        } else {
            this.peso = peso;
        }
    }

    /**
     * Getters e Setters :
     */
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        } else {

            this.valor = valor;
        }
    }

    public int getPeso() {
        return peso;
    }

}

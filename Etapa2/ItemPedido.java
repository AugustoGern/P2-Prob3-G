
/**
 *
 * @author akrehn
 */
class ItemPedido {

    private Produto produto;
    private int quantidade;

    protected ItemPedido(Produto produto, int quantidade) {
        setProduto(produto);
        setQuantidade(quantidade);
    }

    /**
     *
     * Getters e Setters:
     */
    protected Produto getProduto() {
        return produto;
    }

    protected void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto inválido");
        } else {
            this.produto = produto;
        }
    }

    protected int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        } else {
            this.quantidade = quantidade;
        }
    }

    protected double getValorItem() {
        return this.quantidade * this.produto.getValor();
    }
}

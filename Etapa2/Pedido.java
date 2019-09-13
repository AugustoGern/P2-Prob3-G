/**
 *
 * @author akrehn
 */
import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;//array para guardar os itens do pedido
    private EntregaStrategy strategy;

    public void setStrategy(EntregaStrategy strategy) {
        this.strategy = strategy;
    }

    public Pedido() {
        itens = new ArrayList<>();
    }

    /*
    Incluir um item, um produto x na quantidade y
     */
    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));//adiciona na array
    }

    /**
     * Getters e Setters :
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número de pedido inválido");
        } else {
            this.numero = numero;
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.length() > 1) {
            throw new IllegalArgumentException("Nome de Cliente inválido");
        } else {

            this.nomeCliente = nomeCliente;
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.length() > 3) {
            throw new IllegalArgumentException("Endereço inválido");
        } else {
            this.endereco = endereco;
        }
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido itemPedido : this.itens) {
            valorTotal += (itemPedido.getValorItem());
        }
        return valorTotal;
    }

    public double getMassa() {
        double massa = 0;
        for (ItemPedido itemPedido : itens) {
            massa += itemPedido.getQuantidade() * itemPedido.getProduto().getPeso();

        }
        return massa;
    }

    public double getValorEntrega() {

        return strategy.getValor(this);
    }

    public int getQuantidadeItens() {

        return itens.size();
    }

    public double getValorTotal() {
        return getValorPedido() + getValorEntrega();
    }
}

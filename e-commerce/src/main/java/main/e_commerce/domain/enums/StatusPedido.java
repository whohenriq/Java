package main.e_commerce.domain.enums;

public enum StatusPedido {
    AGUARDANDO("Aguardando pagamento"),
    CANCELADO("Cancelar Pedido"),
    PAGO("Pago"),
    ENVIADO("Enviado");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

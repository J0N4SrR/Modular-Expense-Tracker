package expenses.core.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {
    private int idDespesa;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private Categoria categoria;

    public Despesa(String descricao, BigDecimal valor, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
        this.data = LocalDate.now();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

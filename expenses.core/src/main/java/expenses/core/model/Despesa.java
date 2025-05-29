package expenses.core.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.zip.DataFormatException;

public class Despesa {
    private int idDespesa;
    private String descricao;
    private BigDecimal valor;
    private LocalDate dataCompra;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    private Categoria categoria;

    public Despesa(String descricao, BigDecimal valor, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
        this.dataCriacao = LocalDate.now();
        this.dataModificacao = LocalDate.now();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getIdDespesa() {
        return idDespesa;
    }

    public void setDataModificacao(LocalDate dataModificacao) {
        this.dataModificacao = dataModificacao;
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

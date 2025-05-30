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

    public Despesa(String descricao, BigDecimal valor, Categoria categoria, LocalDate dataCompra) {
        setDescricao(descricao);
        setValor(valor);
        setCategoria(categoria);
        setDataCompra(dataCompra);
        this.dataModificacao = null;
        this.dataCriacao = LocalDate.now();

    }

    public BigDecimal getValor() {
        return valor;
    }


    public LocalDate getDataCompra() {
        return dataCompra;

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
        if(idDespesa > 0){
            this.idDespesa = idDespesa;
        } else{
            System.out.println("Valor inválido");
        };
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(BigDecimal valor) {

        if(idDespesa > 0){
            this.valor = valor;
        } else{
            System.out.println("Valor inválido");
        };
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCategoriaPorIndice(int num) {

        switch (num){
            case 1:
                categoria = Categoria.MORADIA;
                break;
            case 2:
                categoria = Categoria.TRANSPORTE;
                break;
            case 3:
                categoria = Categoria.ALIMENTACAO;
                break;
            case 4:
                categoria = Categoria.SAUDE;
                break;
            case 5:
                categoria = Categoria.EDUCACAO;
                break;
            case 6:
                categoria = Categoria.LAZER;
                break;
            case 7:
                categoria = Categoria.PESSOAL;
                break;
            case 8:
                categoria = Categoria.DIVERSOS;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public void setDataCompra(LocalDate dataCompra) {
        if(!dataCompra.isAfter(LocalDate.now())){
            this.dataCompra = dataCompra;
        }else{
            System.out.println("Data inválida");
        };
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}

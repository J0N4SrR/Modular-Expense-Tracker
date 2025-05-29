package expenses.core.repository;

import expenses.core.model.Categoria;
import expenses.core.model.Despesa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDespesas implements Repositorio{
    List<Despesa> listaDeDespesa = new ArrayList<Despesa>();
    private int nId = 0;

    private void registrarDespesa(Despesa despesa) {
        nId++;
        despesa.setIdDespesa(nId);
        listaDeDespesa.add(despesa);
    }

    public void criarDespesa(String descricao, BigDecimal valor, Categoria categoria){
        Despesa despesa = new Despesa(descricao,valor,categoria);
        registrarDespesa(despesa);
    }

    @Override
    public void removerDespesa(int id) {
        listaDeDespesa.remove(id);
    }

    @Override
    public void editarDespesa(int id, String novaDescricao, BigDecimal novoValor, Categoria novaCategoria) {
        listaDeDespesa.get(id).setDescricao(novaDescricao);
        listaDeDespesa.get(id).setValor(novoValor);
        listaDeDespesa.get(id).setCategoria(novaCategoria);
    }

    @Override
    public List<Despesa> listarDespesas() {
        return List.of();
    }

    @Override
    public Despesa encontrarDespesaId(int id) {
        return null;
    }
}

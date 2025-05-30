package expenses.core.repository;

import expenses.core.model.Categoria;
import expenses.core.model.Despesa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDespesas implements Repositorio{
    List<Despesa> listaDeDespesa = new ArrayList<Despesa>();
    private int nId = 0;




    public List<Despesa> getListaDeDespesa() {
        return listaDeDespesa;
    }

    private void registrarDespesa(Despesa despesa) {
        nId++;
        despesa.setIdDespesa(nId);
        listaDeDespesa.add(despesa);
    }

    public void criarDespesa(String descricao, BigDecimal valor, Categoria categoria, LocalDate data){
        Despesa despesa = new Despesa(descricao,valor,categoria, data);
        registrarDespesa(despesa);
    }

    @Override
    public void removerDespesa(int id) {
        for(Despesa despesa : listaDeDespesa){
            if(despesa.getIdDespesa() == id){
                listaDeDespesa.remove(despesa);
            }
        }
    }

    @Override
    public void editarDespesa(int id, String novaDescricao, BigDecimal novoValor, Categoria novaCategoria) {
        listaDeDespesa.get(id).setDescricao(novaDescricao);
        listaDeDespesa.get(id).setValor(novoValor);
        listaDeDespesa.get(id).setCategoria(novaCategoria);
        listaDeDespesa.get(id).setDataModificacao(LocalDate.now());
    }

    @Override
    public List<Despesa> listarDespesas() {
        return listaDeDespesa;
    }

    @Override
    public Despesa encontrarDespesaId(int id) {
        return listaDeDespesa.get(id);
    }


}

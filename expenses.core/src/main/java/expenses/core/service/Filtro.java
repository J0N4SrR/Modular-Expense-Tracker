package expenses.core.service;

import expenses.core.model.Categoria;
import expenses.core.model.Despesa;
import expenses.core.repository.RepositorioDespesas;

import java.util.ArrayList;
import java.util.List;

public class Filtro {

    public void filtrarPorCategoria(List<Despesa> listasDespesa,Categoria categoria){
        List<Despesa> listaCategoria = new ArrayList<Despesa>();
        for(Despesa despesa: listasDespesa){
            if(despesa.getCategoria().equals(categoria)){
                listaCategoria.add(despesa);
            }
        }

    }

}

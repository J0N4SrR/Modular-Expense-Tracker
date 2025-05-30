package expenses.core.service;

import expenses.core.model.Categoria;
import expenses.core.model.Despesa;
import expenses.core.repository.RepositorioDespesas;

import java.util.ArrayList;
import java.util.List;

public class Filtro {

    public List<Despesa> filtrarPorCategoria(List<Despesa> listasDespesa,Categoria categoria){
        List<Despesa> listaCategoria = new ArrayList<Despesa>();
        for(Despesa despesa: listasDespesa){
            if(despesa.getCategoria().equals(categoria)){
                listaCategoria.add(despesa);
            }
        }
        return listaCategoria;
    }
    public static List<Despesa> filtrarPorMes(List<Despesa> listasDespesa,int mes){
        List<Despesa> listaMes = new ArrayList<Despesa>();

        for(Despesa despesa: listasDespesa){
            int MM = Integer.parseInt(String.valueOf(despesa.getDataCompra().getMonth()));
            if(MM == mes){
                listaMes.add(despesa);
            }
        }
        return listaMes;
    }


}

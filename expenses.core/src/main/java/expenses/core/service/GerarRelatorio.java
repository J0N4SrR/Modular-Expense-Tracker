package expenses.core.service;

import expenses.core.model.Despesa;

import java.math.BigDecimal;
import java.util.List;

import static expenses.core.service.Filtro.filtrarPorMes;

public  class GerarRelatorio {
    private BigDecimal somaValor = BigDecimal.valueOf(0);

    public BigDecimal calcularValorGasto(List<Despesa> listasDespesa){

        for(Despesa despesa : listasDespesa){
            this.somaValor = somaValor.add(despesa.getValor());
        }
        return somaValor;
    }

    public BigDecimal calcularValorGastoMes(List<Despesa> listasDespesa, int mes){
        List<Despesa>  listaMes = filtrarPorMes(listasDespesa, mes);
        for(Despesa despesa : listaMes){
            this.somaValor = somaValor.add(despesa.getValor());
        }
        return somaValor;
    }







}

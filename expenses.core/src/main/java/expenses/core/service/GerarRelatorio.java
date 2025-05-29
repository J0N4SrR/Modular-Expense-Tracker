package expenses.core.service;

import expenses.core.model.Despesa;

import java.math.BigDecimal;
import java.util.List;

public  class GerarRelatorio {
    private BigDecimal somaValor = BigDecimal.valueOf(0);

    public BigDecimal calcularValorGasto(List<Despesa> listasDespesa){

        for(Despesa despesa : listasDespesa){
            this.somaValor = somaValor.add(despesa.getValor());
        }
        return somaValor;
    }




}

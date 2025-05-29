package expenses.core.repository;

import expenses.core.model.Categoria;
import expenses.core.model.Despesa;
import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

public interface Repositorio {
    public void criarDespesa(String descricao, BigDecimal valor, Categoria categoria);
    public void removerDespesa(int id);
    public void editarDespesa(int id, String descricao, BigDecimal valor, Categoria categoria);
    public List<Despesa> listarDespesas();
    public Despesa encontrarDespesaId(int id);
}

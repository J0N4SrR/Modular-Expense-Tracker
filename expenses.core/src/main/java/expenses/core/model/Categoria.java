package expenses.core.model;

public enum Categoria {
    MORADIA("moradia"),
    TRANSPORTE("transporte"),
    ALIMENTACAO("alimentacao"),
    SAUDE("saude"),
    EDUCACAO("educacao"),
    LAZER("lazer"),
    PESSOAL("pessoal"),
    DIVERSOS("diversos");



    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

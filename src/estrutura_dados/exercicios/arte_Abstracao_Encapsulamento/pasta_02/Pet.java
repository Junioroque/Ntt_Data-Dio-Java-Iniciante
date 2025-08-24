package estrutura_dados.exercicios.arte_Abstracao_Encapsulamento.pasta_02;

public class Pet {
    private final String name;

    private boolean clean;

    public Pet(final String name) {
        this.name = name;
        this.clean = false; // Inicialmente, o pet não está limpo
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}

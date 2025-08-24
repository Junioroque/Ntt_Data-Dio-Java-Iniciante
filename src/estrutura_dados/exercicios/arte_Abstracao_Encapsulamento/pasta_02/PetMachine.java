package estrutura_dados.exercicios.arte_Abstracao_Encapsulamento.pasta_02;

public class PetMachine {

    //private boolena clean;
    private int water;

    private int shampoo;    

    private Pet pet;

    public void takeAshower(){
        if(this .pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        pet.setClean(true);
        //System.out.println("O pet " + pet.getName() + " está limpo!");

    }
}

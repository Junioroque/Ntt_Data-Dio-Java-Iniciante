package estrutura_dados.primeiraClasse;

public class Main {
    public static void main(String[] args) {
        var male = new Person("João");
        male.incAge();
        var female = new Person("Maria");
        female.incAge();
        System.out.println("Male "+ male.getName() + " age "+male.getAge());
        System.out.println("Female "+ female.getName() + " age "+female.getAge());

    }
}

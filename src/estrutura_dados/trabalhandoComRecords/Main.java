package estrutura_dados.trabalhandoComRecords;

public class Main {
    public static void main(String[] args) {
        var person = new Person("João", 30);
        System.out.println("Nome: " + person.name());
        System.out.println(person);
        //Chamando o método getInfo
        System.out.println(person.getInfo());

    }
}

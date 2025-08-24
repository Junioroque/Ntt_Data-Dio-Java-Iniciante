package herança_Polimorfismo.introducao;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("João");
        manager.setLogin("Joao");
        manager.setPassword("123");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

    }
}

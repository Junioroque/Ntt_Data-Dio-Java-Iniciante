package herança_Polimorfismo.introducao;

public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        switch (employee) {
            case Manager manager -> {
                manager.setCode("001");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("Joao@");
                manager.setPassword("123");
                manager.setComission(40);

                System.out.println(employee.getClass().getCanonicalName());

                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
            }
            case Salesman salesman -> {
                salesman.setCode("002");
                salesman.setName("Lucas");
                salesman.setSalary(2500);
                salesman.setPercentPerSold(10);

                System.out.println(employee.getClass().getCanonicalName());

                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());

            }
        }
    }
}

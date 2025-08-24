package herança_Polimorfismo.introducao;

public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        switch (employee) {
            case Manager manager -> {
                employee.setCode("001");
                employee.setName("João");
                ((Manager) employee).setSalary(5000);
                ((Manager) employee).setLogin("Joao@");
                ((Manager) employee).setPassword("123");

                System.out.println(employee.getClass().getCanonicalName());

                System.out.println(employee.getName());
                System.out.println(((Manager) employee).getSalary());
                System.out.println(((Manager) employee).getLogin());
                System.out.println(((Manager) employee).getPassword());

            }
            case Salesman salesman -> {

            }
        }
    }
}

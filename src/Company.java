import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Company implements Employee {

    int salesmanCount = 0;
    int topManagerCount = 0;
    int operationistCount = 0;

    public ArrayList<Employee> employees = new ArrayList<Employee>();

    public int getOverallProfit(){
        int getOverallProfit = 0;
    for (Employee employee : employees)
    {
        getOverallProfit += employee.getProfit();
    }
    return getOverallProfit;
    }


        public ArrayList<Employee> hireEmployee () {
            if (Math.random() < 0.4) {
                SalesPerson employee = new SalesPerson();
                int randomFixedSalary = (int) (50000 + 20000 * Math.random());
                int randomProfit = (int) (100000 + 100000 * Math.random());
                employee.setFixedSalary(randomFixedSalary);
                employee.setProfit(randomProfit);
                employees.add(employee);
                salesmanCount++;

            } else if (Math.random() < 0.8) {
                Operationist employee = new Operationist();
                int randomFixedSalary = (int) (50000 + 20000 * Math.random());
                employee.setFixedSalary(randomFixedSalary);
                employees.add(employee);
                operationistCount++;
            } else {
                int randomFixedSalary = (int) (100000 + 20000 * Math.random());
                TopManager employee = new TopManager(randomFixedSalary);
                employees.add(employee);
                topManagerCount++;
            }
            return employees;
        }



public void printList(){
    String message = "";
        if (getOverallProfit() > 10000000) {message = "Да";}
        if (getOverallProfit() < 10000000) {message = "Нет";}

    System.out.println("Число продавцов: " + salesmanCount);
    System.out.println("Число операционистов: " + operationistCount);
    System.out.println("Число топ-менеджеров: " + topManagerCount);
    System.out.println("Общий доход компании: " + getOverallProfit());
    System.out.println("Получают ли  топменеджеры ежемесячный бонус в 30000?: " + message);
    System.out.println();
        for (Employee employee : employees){
            System.out.println(employee + " - зарплата: " + employee.getMonthSalary());
        }
}

public ArrayList<Employee> fireEmployee (Employee employee){
        employees.remove(employee);
        return employees;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count){
        Comparator <Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getMonthSalary() > o2.getMonthSalary()){
                    return -1;
                } else if (o1.getMonthSalary() < o2.getMonthSalary())
                {
                    return 1;
                }
                return 0;
            }
        };
        Collections.sort(employees, comparator);

        System.out.println(count + " лучших зарплат");
        for (int i = 0; i < count; i++) {
            System.out.println(employees.get(i) + " - " + employees.get(i).getMonthSalary());
        }
        return employees;}

    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {Comparator <Employee> comparator2 = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getMonthSalary() > o2.getMonthSalary()){
                return 1;
            } else if (o1.getMonthSalary() < o2.getMonthSalary())
            {
                return -1;
            }
            return 0;
        }
    };
        Collections.sort(employees, comparator2);

        System.out.println(count + " худших зарплат");
        for (int i = 0; i < count; i++) {
            System.out.println(employees.get(i) + " - " + employees.get(i).getMonthSalary());
        }
        return employees;}

    @Override
    public int getMonthSalary() {
        return 0;
    }

    @Override
    public int getProfit() {
        return 0;
    }
}

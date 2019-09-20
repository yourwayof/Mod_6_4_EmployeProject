import Company.Company;
import Employee.Employee;
import Employee.*;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        int salesmanCount = 0;
        int topManagerCount = 0;
        int operationistCount = 0;

        final int FIXED_SALARY_AMOUNT = 50000;
        final int START_NUMBER_FOR_RANDOM_SALARY_PART = 20000;
        final int FIXED_PROFIT_AMOUNT = 100000;
        final int START_NUMBER_FOR_RANDOM_PROFIT_PART =  100000;

        System.out.println("Создайте классы, в которых будет информация о зарплатах сотрудников, и интерфейс “Сотрудник” с методом getMonthSalary(). \nТипы сотрудников - менеджер по продажам (зарплата складывается из фиксированной части и 5% от заработанных им для компании денег), \nтоп-менеджер (фиксированная часть + премия, если доход компании составил более 10 миллионов рублей) и операционист (фиксированная зарплата). \nСоздайте также класс, представляющий компанию, в которой работают эти сотрудники. \nИх можно нанимать, увольнять. Также в этом классе должны быть реализованы два метода, \ngetTopSalaryStaff(int count) и getLowestSalaryStaff(int count), - которые будут выводить заданное (в параметре count) количество сотрудников с самыми высокими и самыми низкими зарплатами. \nСгенерируйте и наймите 270 сотрудников с разными зарплатами, а затем вызовите эти два метода и продемонстрируйте их работу.");
        System.out.println("---");

        Company company = new Company(30000, 10000000);

        ArrayList<Employee> randomEmployeeList = new ArrayList<Employee>();

        for (int i = 0; i < 270; i++) {
            if (Math.random() < 0.45) {
                SalesPerson employee = new SalesPerson();
                int randomFixedSalary = (int) (FIXED_SALARY_AMOUNT + START_NUMBER_FOR_RANDOM_SALARY_PART * Math.random());
                int randomProfit = (int) (FIXED_PROFIT_AMOUNT + START_NUMBER_FOR_RANDOM_PROFIT_PART * Math.random());
                employee.setFixedSalary(randomFixedSalary);
                employee.setProfit(randomProfit);
                randomEmployeeList.add(employee);
                salesmanCount++;
            } else if (Math.random() < 0.9) {
                Operationist employee = new Operationist();
                int randomFixedSalary = (int) (FIXED_SALARY_AMOUNT + START_NUMBER_FOR_RANDOM_SALARY_PART * Math.random());
                employee.setFixedSalary(randomFixedSalary);
                randomEmployeeList.add(employee);
                operationistCount++;
            } else {
                int randomFixedSalary = (int) (FIXED_SALARY_AMOUNT + START_NUMBER_FOR_RANDOM_SALARY_PART * Math.random());
                TopManager employee = new TopManager(randomFixedSalary);
                randomEmployeeList.add(employee);
                topManagerCount++;
            }
        }
            company.hireEmployee(randomEmployeeList);

        System.out.println("Число продавцов: " + salesmanCount);
        System.out.println("Число операционистов: " + operationistCount);
        System.out.println("Число топ-менеджеров: " + topManagerCount);
        //company.printListEmployee();

        company.getTopSalaryStaff(10);
        company.getLowestSalaryStaff(11);
    }
}

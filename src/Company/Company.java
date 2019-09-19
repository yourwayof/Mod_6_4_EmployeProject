package Company;

import Employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {

    final int ENOUGH_PROFIT_FOR_BONUS = 10000000;
    final int BONUS = 30000;

    public ArrayList<Employee> employees = new ArrayList<Employee>();

    public int getOverallProfit() {
        int getOverallProfit = 0;
        for (Employee employee : employees) {
            getOverallProfit += employee.getProfit();
        }
        return getOverallProfit;
    }

    public ArrayList<Employee> hireEmployee(ArrayList<Employee> arrayList) {

        employees.addAll(arrayList);
        return employees;
    }

    public void printList(Company company) {
        String message = getOverallProfit() > ENOUGH_PROFIT_FOR_BONUS ? "Да" : "Нет";

        System.out.println("Общий доход компании: " + getOverallProfit());
        System.out.println("Получают ли  топ-менеджеры ежемесячный бонус в " + BONUS + " рублей?: " + message);
        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee + " - зарплата: " + employee.getMonthSalary(company));
        }
    }

    public ArrayList<Employee> fireEmployee(Employee employee) {
        employees.remove(employee);
        return employees;
    }

    public Comparator<Employee> comparatorClass(Company company) {
        Comparator<Employee> comparator = Comparator.comparing(employee -> employee.getMonthSalary(company));
        return comparator;
    }

    public ArrayList<Employee> getTopSalaryStaff (int count, Company company)
    {
        Collections.sort(employees, comparatorClass(company).reversed());
        System.out.println(count + " лучших зарплат");
        printList(count, company);
        return employees;}

    public ArrayList<Employee> getLowestSalaryStaff(int count, Company company)
    {
        Collections.sort(employees, comparatorClass(company));
        System.out.println(count + " худших зарплат");
        printList(count, company);
        return employees;
    }

    public void printList (int count, Company company){
        for (int i = 0; i < count; i++) {
            System.out.println(employees.get(i) + " - " + employees.get(i).getMonthSalary(company));
        }
    }

    }



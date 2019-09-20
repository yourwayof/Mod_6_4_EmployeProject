package Company;

import Employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {

    public final int ENOUGH_PROFIT_FOR_BONUS;
    public final int BONUS;

    private Comparator<Employee> comparator = Comparator.comparing(employee -> employee.getMonthSalary(this));

    public Company (int bonusAmount, int profitForBonus)
    {
        this.ENOUGH_PROFIT_FOR_BONUS = profitForBonus;
        this.BONUS = bonusAmount;
    }

    private ArrayList<Employee> employees = new ArrayList<Employee>();

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

    public void printListEmployee() {
        String message = getOverallProfit() > this.ENOUGH_PROFIT_FOR_BONUS ? "Да" : "Нет";

        System.out.println("Общий доход компании: " + getOverallProfit());
        System.out.println("Получают ли  топ-менеджеры ежемесячный бонус в " + this.BONUS + " рублей?: " + message);
        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee + " - зарплата: " + employee.getMonthSalary(this));
        }
    }

    public ArrayList<Employee> fireEmployee(Employee employee) {
        employees.remove(employee);
        return employees;
    }

    public ArrayList<Employee> getTopSalaryStaff (int count)
    {
        int index = count <= employees.size() ? count : employees.size();
        employees.sort(comparator.reversed());
        System.out.println(index + " лучших зарплат");
        printList(index);
        return employees;}

    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        int index = count <= employees.size() ? count : employees.size();
        employees.sort(comparator);
        System.out.println(index + " худших зарплат");
        printList(index);
        return employees;
    }

    private void printList (int index){
        for (int i = 0; i < index; i++) {
            System.out.println(employees.get(i) + " - " + employees.get(i).getMonthSalary(this));
        }
    }

    }



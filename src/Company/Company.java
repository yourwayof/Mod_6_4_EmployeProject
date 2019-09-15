package Company;

import Employee.Employee;

import java.util.ArrayList;


public class Company {

    public ArrayList<Employee> employees = new ArrayList<Employee>();

    public int getOverallProfit() {
        int getOverallProfit = 0;
        for (Employee employee : employees) {
            getOverallProfit += employee.getProfit();
        }
        return getOverallProfit;
    }

    public ArrayList<Employee> hireEmployee(ArrayList<Employee> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            employees.add(arrayList.get(i));
        }
        return employees;
    }

    public void printList(Company company) {
        String message = "";
        if (getOverallProfit() > 10000000) {
            message = "Да";
        }
        if (getOverallProfit() < 10000000) {
            message = "Нет";
        }

        System.out.println("Общий доход компании: " + getOverallProfit());
        System.out.println("Получают ли  топменеджеры ежемесячный бонус в 30000?: " + message);
        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee + " - зарплата: " + employee.getMonthSalary(company));
        }
    }

    public ArrayList<Employee> fireEmployee(Employee employee) {
        employees.remove(employee);
        return employees;
    }


//public ArrayList<Employee.Employee> getTopSalaryStaff(int count, Company.Company company)
//{
//    TopSalaryComparator topSalaryComparator = new TopSalaryComparator();
//    Collections.sort(employees, topSalaryComparator);
//
//    System.out.println(count + " лучших зарплат");
//        for (int i = 0; i < count; i++)
//        {
//            System.out.println(employees.get(i) + " - " + employees.get(i).getMonthSalary(company));
//        }
//    return employees;
//}
//
//public ArrayList<Employee.Employee> getLowestSalaryStaff(int count, Company.Company company){
//    SalaryComparator comparator = new SalaryComparator();
//    Collections.sort(employees, comparator);
//
//    System.out.println(count + " худших зарплат");
//        for (int i = 0; i < count; i++) {
//            System.out.println(employees.get(i) + " - " + employees.get(i).getMonthSalary(company));
//        }
//    return employees;}
}

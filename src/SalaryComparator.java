import java.util.Comparator;

public class SalaryComparator implements Comparator <Employee>{
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getMonthSalary(), o2.getMonthSalary());
        }
    };

class TopSalaryComparator implements Comparator <Employee>{
    public int compare(Employee o2, Employee o1) {
        return Integer.compare(o1.getMonthSalary(), o2.getMonthSalary());
    }
};
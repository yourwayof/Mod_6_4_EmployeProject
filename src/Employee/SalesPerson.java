package Employee;

import Company.Company;

public class SalesPerson implements Employee {
    int fixedSalary = 0;
    final int BONUS_PERCENT = 5;
    int salary = 0;
    int profit = 0;

    public SalesPerson ()
    {
    }

    public void setFixedSalary(int amount)
    {
        this.fixedSalary = amount;
    }

    public int getFixedSalary()
    {
        return this.fixedSalary;
    }

     public void setProfit(int amount)
     {
            this.profit = amount;
     }

     public int getProfit()
     {
            return this.profit;
     }

    @Override
    public int getMonthSalary(Company company) {
        this.salary = fixedSalary + BONUS_PERCENT * this.profit / 100;
        return this.salary;
    }
}

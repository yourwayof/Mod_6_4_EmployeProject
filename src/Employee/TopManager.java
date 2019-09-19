package Employee;

import Company.Company;

public class TopManager implements Employee {

    int fixedSalary = 0;
    int salary = 0;
    int totalSalary = 0;
    int profit = 0;
    final int ENOUGH_PROFIT_FOR_BONUS = 10000000;
    int bonus = 0;
    final int BONUS = 30000;

    public TopManager(int amount){
        this.fixedSalary = amount;
        this.profit = 0;
    }

    public void setFixedSalary(int amount)
    {
        this.fixedSalary = amount;
    }

    public int getFixedSalary(){
        return this.fixedSalary;
    }

    public int getMonthSalary(Company company) {
        bonus = company.getOverallProfit() > ENOUGH_PROFIT_FOR_BONUS ? BONUS : 0;
        return this.fixedSalary + bonus;
    }


    public int getProfit()
    {
        return this.profit;
    }
}

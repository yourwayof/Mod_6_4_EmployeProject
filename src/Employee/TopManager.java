package Employee;

import Company.Company;

public class TopManager implements Employee {

    private int fixedSalary = 0;
    private int salary = 0;
    private int totalSalary = 0;
    private int profit = 0;
    private int bonus = 0;

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
        bonus = company.getOverallProfit() > company.ENOUGH_PROFIT_FOR_BONUS ? company.BONUS : 0;
        return this.fixedSalary + bonus;
    }


    public int getProfit()
    {
        return this.profit;
    }
}

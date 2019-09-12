public class SalesPerson extends Company {
    int fixedSalary = 0;
    int bonusPercent = 5;
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
    public int getMonthSalary() {
        this.salary = fixedSalary + 5 * this.profit / 100;
        return this.salary;
    }
}

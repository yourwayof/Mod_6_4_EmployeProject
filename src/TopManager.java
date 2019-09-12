public class TopManager extends Company {

    int fixedSalary = 0;
    int salary = 0;
    int profit = 0;

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

    @Override
    public int getMonthSalary() {

        if (super.getOverallProfit() > 10000000){
            this.salary = this.fixedSalary + 30000;
        } else {
        this.salary = this.fixedSalary;
        }
        return salary;
    }

    public int getProfit()
    {
        return this.profit;
    }
}

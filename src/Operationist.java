public class Operationist extends Company implements Employee  {
    int fixedSalary = 0;
    int salary = 0;
    int profit = 0;
    public Operationist(){
        this.profit = 0;
    };

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public int getProfit()
    {
        return this.profit;
    }

    public int getMonthSalary() {
        this.salary = fixedSalary;
        return this.salary;
    }
}


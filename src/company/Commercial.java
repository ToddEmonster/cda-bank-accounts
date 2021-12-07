package company;

import java.math.BigDecimal;

public class Commercial extends BaseEmployee {
    private double fixedSalary;
    private double turnover;

    public Commercial(String name) {
        this(name, 1200);
    }

    public Commercial(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    @Override
    public BigDecimal getSalary() {
        double totalSalary = this.fixedSalary + (turnover * 0.01);
        return new BigDecimal(totalSalary).setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
}

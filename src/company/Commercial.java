package company;

public class Commercial extends BaseEmployee {
    private float fixedSalary;
    private float turnover;

    public Commercial(String name, float fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    public float getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(float fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public float getTurnover() {
        return turnover;
    }

    public void setTurnover(float turnover) {
        this.turnover = turnover;
    }

    @Override
    public float getSalary() {
        return this.fixedSalary + (turnover * 0.01F);
    }
}

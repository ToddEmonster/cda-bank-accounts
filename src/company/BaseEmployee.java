package company;

public class BaseEmployee {
    protected String name;
    protected float nbWorkedHours;
    protected int overtimePayingRate;
    public static final float hourlySMICSalary = 8.29F; // 2021

    public BaseEmployee(String name) {
        this(name, 40, 30);
    }

    public BaseEmployee(String name, float nbWorkedHours, int overtimePayingRate) {
        this.name = name;
        this.nbWorkedHours = nbWorkedHours;
        this.overtimePayingRate = overtimePayingRate;
    }

    public String getName() {
        return name;
    }

    public float getNbWorkedHours() {
        return nbWorkedHours;
    }

    public int getOvertimePayingRate() {
        return overtimePayingRate;
    }

    public float getOvertimeHours() {
        return this.nbWorkedHours > 40F
                ? this.nbWorkedHours - 40F
                : 0;
    }

    public void setSalaryInformation(float nbWorkedHours, int overtimePayingRate) {
        this.nbWorkedHours = nbWorkedHours;
        this.overtimePayingRate = overtimePayingRate;
    }

    public float getSalary() {
        float weekSalary = hourlySMICSalary * 40;
        if (this.getOvertimeHours() > 0) {
            weekSalary += (this.getOvertimeHourlySalary() * this.getOvertimeHours());
        }
        return weekSalary;
    }

    public float getOvertimeHourlySalary() {
        return hourlySMICSalary * (1 + overtimePayingRate / 100 );
    }
}

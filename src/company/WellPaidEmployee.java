package company;

public class WellPaidEmployee extends BaseEmployee {

    public WellPaidEmployee(String name) {
        this(name, 40);
    }

    public WellPaidEmployee(String name, float nbWorkedHours) {
        super(name, nbWorkedHours, 50);
    }

}

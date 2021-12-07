package company;


public class Payroll {

    public static void main(String[] args) {
        BaseEmployee etienne = new BaseEmployee("Étienne");
        BaseEmployee karl = new BaseEmployee("Karl", 60, 20);
        WellPaidEmployee smithers = new WellPaidEmployee("Mr. Smithers");
        Commercial julie = new Commercial("Julie");
        Commercial sophie = new Commercial("Sophie", 2000);
        Commercial george = new Commercial("Georges", 1500);

        etienne.setSalaryInformation(50, 40);

        BaseEmployee[] employees = new BaseEmployee[]{etienne, karl, smithers, julie, sophie, george};

        System.out.println("[ Jour de paye cette semaine ]\n");
        for (BaseEmployee employee : employees) {
            System.out.println(employee.getName() + " gagne cette semaine " + employee.getSalary() + " €");
        }
    }
}

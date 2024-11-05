package company;

public class SalesPerson extends Employee {

    private int salesTarget;


    public SalesPerson(String name, String department, double salary, int salesTarget) {
        super(name, department, salary);

        this.salesTarget = salesTarget;
    }


    public int getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(int salesTarget) {
        this.salesTarget = salesTarget;
    }

    public void updateSalesTarget(int newTarget) {
        salesTarget = newTarget;
    }

    @Override
    public String toString() {
        return super.toString()+"    SalesPerson ====>"+" Sales Target="+salesTarget;

    }

}//end class

public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;
    protected double bonus = 0;
    protected double amountOfWork; // percentage (0-100)
    protected double qualityOfWork; // percentage (0-100)

    public Employee(String n, String j, double s, String a, double am, double q) {
        this.name = n;
        this.jobTitle = j;
        this.salary = s;
        this.address = a;
        this.amountOfWork = am;
        this.qualityOfWork = q;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String calculateBonus() {
        bonus = this.salary * 0;
        return this.jobTitle + " Bonus: $" + bonus;
    }

    public String generatePerformanceReports() {
        return "";
    }

    public String managingProject() {
        return "";
    }

}

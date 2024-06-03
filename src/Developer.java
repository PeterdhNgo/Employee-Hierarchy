public class Developer extends Employee{
    protected String projectName;

    public Developer(String n, String j, double s, String a, int am, int q, String pr) {
        super(n, j, s, a, am, q);
        this.projectName = pr;
    }

    @Override
    public String calculateBonus() {
        bonus = this.salary * (0.03 * (this.amountOfWork / 100.0) * (this.qualityOfWork / 100.0));
        return this.jobTitle + " Bonus: $" + bonus;
    }

    public String generatePerformanceReports() {
        return "Performance report for Developer:\n" +
                "Name: " + this.name + "\n" +
                "Address: " + this.address + "\n" +
                "Job title: " + this.jobTitle + "\n" +
                "Salary: $" + this.salary + "\n" +
                "Bonus: $" + this.bonus + "\n" +
                "Amount of work: " + this.amountOfWork + "%\n" +
                "Quality of work: " + this.qualityOfWork + "%\n" +
                "----> Performance: " + (this.amountOfWork + this.qualityOfWork) / 2 + "% / 100.0%";
    }

    public String managingProject() {
        return "Developer " + this.name + " is overseeing project: " + this.projectName;
    }
}

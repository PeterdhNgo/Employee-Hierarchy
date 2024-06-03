public class Manager extends Employee{
    protected int numberOfTeamsManaged;
    protected String projectName;

    public Manager(String n, String j, double s, String a, int am, int q, int nu, String pr) {
        super(n, j, s, a, am, q);
        this.numberOfTeamsManaged = nu;
        this.projectName = pr;
    }

    @Override
    public String calculateBonus() {
        bonus = this.salary * (0.10 * (this.amountOfWork / 100.0) * (this.qualityOfWork / 100.0));
        return this.jobTitle + " Bonus: $" + bonus;
    }

    public String generatePerformanceReports() {
        return "Performance report for Manager:\n" +
                "Name: " + this.name + "\n" +
                "Address: " + this.address + "\n" +
                "Job title: " + this.jobTitle + "\n" +
                "Salary: $" + this.salary + "\n" +
                "Bonus: $" + this.bonus + "\n" +
                "Amount of work: " + this.amountOfWork + "%\n" +
                "Quality of work: " + this.qualityOfWork + "%\n" +
                "Number of teams managed: " + this.numberOfTeamsManaged + "\n" +
                "----> Performance: " + (this.amountOfWork + this.qualityOfWork) / 2 + "% / 100.0%";
    }

    public String managingProject() {
        return "Manager " + this.name + " is overseeing project: " + this.projectName;
    }
}

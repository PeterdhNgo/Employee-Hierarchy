public class Main {
    public static void main(String[] args) {
        Employee handsomeManager = new Manager("Peter", "Manager", 10000, "2 Old London Road", 90, 90, 5, "Project Alpha");
        System.out.println(handsomeManager.calculateBonus());
        System.out.println(handsomeManager.managingProject());
        System.out.println(handsomeManager.generatePerformanceReports());

        Developer handsomeDeveloper = new Developer("Tony", "Developer", 3500, "21 Berry Street", 40, 60, "Project Beta implementing Java");
        System.out.println(handsomeDeveloper.calculateBonus());
        System.out.println(handsomeDeveloper.managingProject());
        System.out.println(handsomeDeveloper.generatePerformanceReports());

        Programmer handsomeProgrammer = new Programmer("Messi", "Programmer", 2000, "21 Jump Street", 100, 100, "Project Gamma with specialization in Backend");
        System.out.println(handsomeProgrammer.calculateBonus());
        System.out.println(handsomeProgrammer.managingProject());
        System.out.println(handsomeProgrammer.generatePerformanceReports());
    }
}
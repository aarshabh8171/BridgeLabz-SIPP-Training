package Day04_ObjectModeling.Company_and_Departments;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dev = company.addDepartment("Development");
        dev.addEmployee("Aarshabh");
        dev.addEmployee("FiRE");
        
        Department hr = company.addDepartment("Human Resources");
        hr.addEmployee("Dalla");

        company.showStructure();
    }
}

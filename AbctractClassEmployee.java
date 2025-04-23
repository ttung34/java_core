
public class AbctractClassEmployee {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee("1", "hai", "ngtung0304@gmail.com", 20, 2);
        ftEmployee.displayDetail();
        double ft = ftEmployee.calculateSalary();
        System.out.println("salary ft: " + ft);
        PartTimeEmployee ptEmployee = new PartTimeEmployee("2", "Hung", "hai@gmail.com", 6, 2);
        ptEmployee.displayDetail();
        double pt = ptEmployee.calculateSalary();
        System.out.println("salary pt: " + pt);
        ContractEmployee contEmployee = new ContractEmployee("3", "haiem", "haiem@gmail.com", 10, 0);
        contEmployee.displayDetail();
        double ct = contEmployee.calculateSalary();
        System.out.println("salary ct: " + ct);
    }
}

abstract class Employee {
    protected String id;
    protected String name;
    protected String email;

    public Employee(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract double calculateSalary();

    public void displayDetail() {
        System.out.println("Id của employee là: " + id);
        System.out.println("Name của employee là: " + name);
        System.out.println("Email của employee là: " + email);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class FullTimeEmployee extends Employee {
    protected double basicSalary;
    protected double bouns;

    public FullTimeEmployee(String id, String name, String age, double basicSalary, double bouns) {
        super(id, name, age);
        this.basicSalary = basicSalary;
        this.bouns = bouns;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bouns;
    }

    public double getSalary() {
        return basicSalary;
    }

    public void setSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

}

class PartTimeEmployee extends Employee {
    protected double hoursWorked;
    protected double ratePerHouse;

    public PartTimeEmployee(String id, String name, String email, double hoursWorked, double ratePerHouse) {
        super(id, name, email);
        this.hoursWorked = hoursWorked;
        this.ratePerHouse = ratePerHouse;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHouse;
    }

    public double gethoursWorked() {
        return hoursWorked;
    }

    public void sethoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getratePerHouse() {
        return ratePerHouse;
    }

    public void setratePerHouse(double ratePerHouse) {
        this.ratePerHouse = ratePerHouse;
    }

}

class ContractEmployee extends Employee {
    protected double contractAccount;
    protected double taxRate;

    public ContractEmployee(String id, String name, String email, double contractAccount, double taxRate) {
        super(id, name, email);
        this.contractAccount = contractAccount;
        this.taxRate = taxRate;
    }
    @Override
    public double calculateSalary() {
        return contractAccount * (1 - taxRate);
    }
    public double getcontractAccount() {
        return contractAccount;
    }

    public void setcontractAccount(double contractAccount) {
        this.contractAccount = contractAccount;
    }

    public double gettaxRate() {
        return taxRate;
    }

    public void settaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}

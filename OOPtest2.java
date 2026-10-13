interface Payable{
    public double calculateSalary();
}

class Employee implements Payable{
    double salary;
    
    public Employee(double salary){
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

}
class Freelancer implements Payable{
    double hoursWorked;
    double ratePerHour;
    
    public Freelancer(double hoursWorked,double ratePerHour){
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * ratePerHour;
    }
}



public class OOPtest2{
    public static void main(String[] args) {
        Payable[] salary = {new Employee(50000),new Freelancer(12, 13)};

        for(Payable pay : salary){
            System.out.println(pay.calculateSalary());
        }
    }
}
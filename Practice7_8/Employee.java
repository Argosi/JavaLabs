package Practice7_8;
import java.util.*;


public class Employee {
    private double finsal;
    private String position, name, surname;

    Employee(){}

    Employee(String position){
        this.position = position;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    void setFinalsalary(double finalsalary){
        this.finsal = finalsalary;
    }
    double getFinalsalary(){
        return finsal;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

interface EmployeePosition{
    String getJobTitle();
    double calcSalary(double baseSalary);
}

class Manager implements EmployeePosition{

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        double temp = Math.round(115000 + (Math.random()) * ((140000 - 115000) + 1));
        return 0.05 * temp + baseSalary;
    }
}

class TopManager implements EmployeePosition{
    double Sal = Math.round(115000 + (Math.random()) * ((5000000) + 1));
    TopManager(double Sal)
    {
        this.Sal = Sal;

    }
    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if (Sal > 10000000){
            return 1.5 * baseSalary + baseSalary;
        } else{
            return baseSalary;
        }
    }
}

class Operator implements EmployeePosition{

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}

class Company{
    public ArrayList<Employee> employees = new ArrayList<Employee>();
    public double operator_salary;
    public double manager_salary;
    public double topmanager_salary;
    void hire (String pos, Employee em){
        switch (pos) {
            case "Manager":  em.setFinalsalary(new Manager().calcSalary(manager_salary));
                em.setPosition(new Manager().getJobTitle());
                break;
            case "Top Manager":  em.setFinalsalary(new TopManager(getIncome()).calcSalary(topmanager_salary));
                em.setPosition(new TopManager(getIncome()).getJobTitle());
                break;
            case "Operator":  em.setFinalsalary(new Operator().calcSalary(operator_salary));
                em.setPosition(new Operator().getJobTitle());
                break;
        }
    }
    void hireAll(String pos, int amount) {
        for (int i = 0; i < amount; i++) {
            switch (pos) {
                case "Manager":
                    employees.add(i, new Employee(new Manager().getJobTitle()));
                    employees.get(i).setFinalsalary(new Manager().calcSalary(manager_salary));

                    break;
                case "Top Manager":
                    employees.add(i, new Employee(new TopManager(getIncome()).getJobTitle()));
                    employees.get(i).setFinalsalary(new TopManager(getIncome()).calcSalary(topmanager_salary));
                    break;
                case "Operator":
                    employees.add(i, new Employee(new Operator().getJobTitle()));
                    employees.get(i).setFinalsalary(new Operator().calcSalary(operator_salary));
                    break;
            }
        }
        System.out.println(amount + " employees hired.");
    }


    void fire(int amount){
        for(int i=0; i<amount; i++) {

            employees.remove(i);
        }
    }



    void getLowestSalaryStaff( int count){
        for(int i=0; i < employees.size(); i++){
            for(int j=i; j < employees.size(); j++){
                if(employees.get(i).getFinalsalary() > employees.get(j).getFinalsalary()){
                    Collections.swap(employees, i, j);
                }
            }
        }
        for(int i=0; i<count; i++) {
            System.out.println(employees.get(i).getPosition() + " " + employees.get(i).getFinalsalary());
            System.out.println();
        }

    }
    void getTopSalaryStaff(int count) {
        for(int i=0; i < employees.size(); i++){
            for(int j=i; j < employees.size(); j++){
                if(employees.get(i).getFinalsalary() < employees.get(j).getFinalsalary()){
                    Collections.swap(employees, i, j);
                }
            }
        }
        for(int i=0; i<count; i++) {
            System.out.println(employees.get(i).getPosition() + " " + employees.get(i).getFinalsalary());
            System.out.println();
        }
    }

    int getIncome(){
        double Income=0;
        for(int i=0; i< employees.size();i++){
            if (employees.get(i).getPosition()=="Manager"){
                Income += (employees.get(i).getFinalsalary()-manager_salary)/0.05;
            }
        }
        return (int)Income;
    }

    public static void main(String[] args) {



        Company company1 = new Company();
        company1.manager_salary = 150000;
        company1.operator_salary = 100000;
        company1.topmanager_salary = 150000;
        company1.hireAll("Manager",100);
        company1.hireAll("Operator", 180);
        company1.hireAll("Top Manager", 10);
        company1.getTopSalaryStaff(10);
        company1.getLowestSalaryStaff(30);
        company1.fire(10);

    }
}
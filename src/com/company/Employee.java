package com.company;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int workingYear;
    int taxAmount;
    int bonusAmount;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax()
    {
            if(salary>1000)
            {
                taxAmount = (salary * 3) / 100;
            }
            return taxAmount;
        }
        public int bonus()
        {
            if(workHours>40)
            {
                bonusAmount=(workHours-40)*30;
            }
            return bonusAmount;
        }
        public double raiseSalary()
        {
            double newSalary;
            newSalary=(salary-tax())+bonus();
            workingYear= 2021-hireYear;
           if(workingYear<10)
            {
                newSalary= ((newSalary*5)/100)+newSalary;
            }
            else if((workingYear>9) && (workingYear<20))
            {
                newSalary= ((newSalary*10)/100)+newSalary;
            }
            else if(workingYear>19)
            {
                newSalary= ((newSalary*15)/100)+newSalary;
            }
            return newSalary;
        }
        public String toString(){
            System.out.println("Employee's Name: "+name);
            System.out.println("Employee's Salary: "+salary);
            System.out.println("Work Hours: "+workHours);
            System.out.println("Hire Year: "+hireYear);
            System.out.println("Tax Amount: "+tax());
            System.out.println("Bonus Amount: "+bonus());
            System.out.println("Raise Salary: "+raiseSalary());
            System.out.println("Salary with tax and bonus: "+((salary-tax())+bonus()));
            System.out.println("Salary with bonus amount: "+(salary+bonus()));



            return null;
        }


}

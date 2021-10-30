
package assignment2;

import java.util.Date;

public class Employee extends Person{
    public int Office;
    public  float Salary;
    public Date dateHired ;

    public Employee() {
    }


    public Employee(int Office, float Salary, Date dateHired, String Name, String Address, String PhoneNumber, String EmailAddress) {
        super(Name, Address, PhoneNumber, EmailAddress);
        this.Office = Office;
        this.Salary = Salary;
        this.dateHired = dateHired;
    }
    @Override
   public void tostring (){
        System.out.println("Employee"  +Name);
    }

    public int getOffice() {
        return Office;
    }

    public void setOffice(int Office) {
        this.Office = Office;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    
    
}

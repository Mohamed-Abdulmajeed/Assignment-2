
package assignment2;

import java.util.Date;

public class Staff extends Employee{
    public String Title;

    public Staff() {
    }

    public Staff(String Title, int Office, float Salary, Date dateHired, String Name, String Address, String PhoneNumber, String EmailAddress) {
        super(Office, Salary, dateHired, Name, Address, PhoneNumber, EmailAddress);
        this.Title = Title;
    }
       @Override
     public void tostring (){
        System.out.println("Staff"  +Name);
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }
     
}

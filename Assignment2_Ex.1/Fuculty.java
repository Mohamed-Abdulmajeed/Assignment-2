
package assignment2;

import java.util.Date;

public class Fuculty extends Employee{
    public int rank ;
    public int Hours ;

    

    public Fuculty() {
    }

    public Fuculty(int Hours, int Office, float Salary, Date dateHired, String Name, String Address, String PhoneNumber, String EmailAddress) {
        super(Office, Salary, dateHired, Name, Address, PhoneNumber, EmailAddress);
        this.Hours = Hours;
    }
    @Override
 public void tostring (){
        System.out.println("Fuculty"  +Name);
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
 
}

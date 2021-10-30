
package assignment2;
public class Person {
      public String Name ;
      public String Address ;
      public String PhoneNumber ;
      public String EmailAddress ;

    public Person() {
    }

    public Person(String Name, String Address, String PhoneNumber, String EmailAddress) {
        this.Name = Name;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.EmailAddress = EmailAddress;
    }
    public void tostring (){
        System.out.println("Person"  +Name);
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

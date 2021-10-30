
package ass_student;

public class address {
    
    private int streetNo;
    private String city;
    private String country;

    public address() {
    }

    public address(int streetNo, String city, String country) {
        this.streetNo = streetNo;
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

}

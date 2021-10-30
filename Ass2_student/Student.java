
package ass_student;

public class Student {
    
    private String Name;
    private int studentId;
    private double studentGPA;
    private subject sub = new subject();
    private address adres =new address();

    public Student() {
    }

    public Student(String Name, int studentId, double studentGPA) {
        this.Name = Name;
        this.studentId = studentId;
        this.studentGPA = studentGPA;
    }

    public subject getSub() {
        return sub;
    }

    public void setSub(subject sub) {
        this.sub = sub;
    }

    public address getAdres() {
        return adres;
    }

    public void setAdres(address adres) {
        this.adres = adres;
    }


public void Show_All_Information(){
    System.out.println("Name : "+Name+"/nId : "+studentId+"/nGPA : "+studentGPA);
    System.out.println("Subject Id : "+sub.getSubjectID() +"/nSubject Name"+sub.getSubjectName());
    System.out.println("StreetNO : "+adres.getStreetNo()+"/nCity : "+adres.getCity()+"/nCountry : "+adres.getCountry());
}
    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

}

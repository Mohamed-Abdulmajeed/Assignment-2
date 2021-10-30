
package ass_student;

public class Ass_Student {

    public static void main(String[] args) {
Student std = new Student("Mohamed", 1101, 2.7);
address add = new address(22, "samalout", "Egypt");
std.setAdres(add);
subject subj = new subject(1, "Lab1");
std.setSub(subj);
std.Show_All_Information();
    }
    
}

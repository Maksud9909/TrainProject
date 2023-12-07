package Train1;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Test1 {
    public static void main(String[] args) {
        University university1 = new University("WIUT",4,600);
        University university2 = new University("WUT",3,500);
        University university3 = new University("IUT",5,900);
        List<University> universityList = new java.util.ArrayList<>(List.of(university1, university3, university2));
        Collections.sort(universityList,new RatingCompare());
        System.out.println(universityList);
    }
}


class University {
    String name;
    int yearsOfStudy;
    int rating;

    public University(String name, int yearsOfStudy, int rating) {
        this.name = name;
        this.yearsOfStudy = yearsOfStudy;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", yearsOfStudy=" + yearsOfStudy +
                ", rating=" + rating +
                '}';
    }
}

class NameCompare implements Comparator<University> {

    @Override
    public int compare(University o1, University o2) {
        return o1.name.compareTo(o2.name);
    }
}





class RatingCompare implements Comparator<University> {

    @Override
    public int compare(University o1, University o2) {
        return o1.rating - o2.rating;
    }
}


















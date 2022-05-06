import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.sql.Struct;
import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }


        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() == s2.getCgpa()) {
                    int nameCompare = s1.getFname()
                            .compareTo(s2.getFname());
                    if (nameCompare == 0)
                        return s1.getId() - s2.getId();
                    else return nameCompare;
                } else {
                    return (int) (s2.getCgpa() * 1000 - s1.getCgpa() * 1000);
                }
            }
        });

        // 자바8 부터 사용 가능한 람다를 이용한 다중조건 정렬
        // Collections.sort(studentList, Comparator
        //         .comparing(Student::getCgpa).reversed()
        //         .thenComparing(Student::getFname)
        //         .thenComparing(Student::getId));

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}


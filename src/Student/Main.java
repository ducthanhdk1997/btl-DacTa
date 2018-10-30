package Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.lang.Float;


public class Main {
    public static void  main(String[] args)
    {
        StudentBLL studentBLL = new StudentBLL();
        studentBLL.readData();
        List<Student> listStudent = new ArrayList<>();
        listStudent = studentBLL.getArrStudent();
        Heap.sort(listStudent, new Compare<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if(a.getHvTen().compareTo(b.getHvTen())>=0)
                {
                    return 1;
                }
                return 0;
            }

        });

        for(int i=0;i< listStudent.size();i++)
        {
            System.out.println(listStudent.get(i).toString());
        }

        // tìm kiếm
        System.out.println(listStudent.size());
        Student a = listStudent.get(30);
        Student st = Search.binary(listStudent, a, new Compare<Student>() {
            @Override
            public int compare(Student c, Student b) {
                return  c.getHvTen().compareTo(b.getHvTen());

            }
        });
        if(st == null)
        {
            System.out.println("Khong tim thay");
        }else{
            System.out.println("Ket qua tim kiem");
            System.out.println(st.toString());
        }


    }
}

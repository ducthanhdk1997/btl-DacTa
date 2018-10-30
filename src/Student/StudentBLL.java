package Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class StudentBLL {
    private List<Student> arrStudent;

    public StudentBLL(List<Student> arrStudent) {
        this.arrStudent = arrStudent;
    }
    public StudentBLL()
    {
        arrStudent = new ArrayList<>();
    }

    public List<Student> getArrStudent()
    {
        return arrStudent;
    }

    public boolean readData()
    {

        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("Student.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split("\\|");
                if (arr.length != 8) {
                    continue;
                }
                int Masv = Integer.parseInt(arr[0]);
                String HvTen = arr[1];
                String NSinh = arr[2];
                int GTinh = Integer.parseInt(arr[3]);
                String QueQuan = arr[4];
                Float Toan = Float.parseFloat(arr[5]);
                Float Ly = Float.parseFloat(arr[7]);
                Float Hoa = Float.parseFloat(arr[7]);


                Student student = new Student(Masv, HvTen,NSinh,GTinh,QueQuan,Toan,Ly,Hoa);
                arrStudent.add(student);
            }
            bufferedReader.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StudentBLL{" +
                "arrStudent=" + arrStudent +
                "}\n";
    }






}

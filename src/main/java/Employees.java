import java.util.ArrayList;
import java.util.List;

public class Employees {
        String worker;
    List<EmployeesList> data;


    public Employees(String worker, List<EmployeesList> data ) {
        this.worker = worker;
        this.data = data;
    }


    public static class EmployeesList{
        Integer id;
        String name;
        String surname;
        String job;
        double salary;



    public EmployeesList(Integer id, String name, String surname, String job, double salary)
    {
       this.id = id;
       this.name = name;
       this.surname = surname;
       this.job = job;
       this.salary = salary;

    }








    }


}


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        serializeObject();
        deserializeObject();
    }


    private static void serializeObject() {
        List<Employees.EmployeesList> data = new ArrayList<>();
        data.add(new Employees.EmployeesList(1, "John", "Wayne", "cowchaser", 1223.0));

      Employees employees = new Employees("Cowchaser", data);

      String waynson = new Gson().toJson(employees);
        System.out.println(waynson);

    }


    private static void deserializeObject() {


    }
}

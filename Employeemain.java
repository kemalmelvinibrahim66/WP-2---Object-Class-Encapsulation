

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Employeemain {
    public static void main(String[] args) {
        System.out.println("Data Pegawai");

        //Agregattion

        Department devweb = new Department("Membuat Web");
        EmployeeType fullstack = new EmployeeType("segala bisa");

        Employee mp1 = new Employee(50, "Kemal", devweb, fullstack, 10000000);
        
        System.out.println("=".repeat(38));

        System.out.println("Pegawai baru : " + mp1.getName());
        System.out.println("Di departemen : " + mp1.getDepartment().getName());

        //Dependency

        EmployeeService hrService = new EmployeeService();

        System.out.println("=".repeat(38));

        hrService.addEmployee(mp1);
        System.out.println("Pegawai baru berhasil didata");

        System.out.println("=".repeat(38));


        System.out.println("Menaikan gaji pegawai baru dari: " + hrService.getEmployee(50).getSalary());
        hrService.raiseSalary(50, 20);
        System.out.println("Gaji setelah naik: " + hrService.getEmployee(50).getSalary());

        System.out.println("=".repeat(38));

        //Static field dan static method
        System.out.println("Total pegawai terdaftar: " + Employee.gettotalemploye());

    }
}

package designPattern.creationalDesignPattern.Prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please give a id : ");
        Integer id = Integer.parseInt(br.readLine());
        System.out.println("Please give a name :");
        String name = br.readLine();
        System.out.println("Please give the designation :");
        String designation = br.readLine();
        System.out.println("Please give the Salary range :");
        Double salary = Double.parseDouble(br.readLine());
        System.out.println("Please give the address");
        String address = br.readLine();

        EmployeeRecord employeeRecord = new EmployeeRecord(id, name, designation, salary, address);
        EmployeeRecord emp = new EmployeeRecord(2, "rakib", "asst", 12.2, "jessore");
        employeeRecord.showRecord();

        employeeRecord.getAll().showRecord();
        emp.showRecord();
/*
        EmployeeRecord employeeRecordObj = (EmployeeRecord) employeeRecord.getClone();
        employeeRecordObj.showRecord();*/

    }
}

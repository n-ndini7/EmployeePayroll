package com.capgemini;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

//UC1 -  create and employee payroll service to read and write employee payroll to a console

public class EmployeePayrollService {

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO;
	}

	private List<EmployeePayrollData> employeeList;

	public EmployeePayrollService() {

	}

	public EmployeePayrollService(List<EmployeePayrollData> employeeList) {

		this.employeeList = employeeList;
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeeList = new ArrayList<>();
		EmployeePayrollService empService = new EmployeePayrollService(employeeList);
		Scanner sc = new Scanner(System.in);
		empService.readData(sc);
		empService.writeData();
	}

	private void readData(Scanner sc) {
		System.out.println("Enter Employee ID: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee name: ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		Double salary = Double.parseDouble(sc.nextLine());
		employeeList.add(new EmployeePayrollData(id, name, salary));
	}

	private void writeData() {
		System.out.println("\nWriting Employee Payroll Roaster to Console...\n" + employeeList);
	}
}

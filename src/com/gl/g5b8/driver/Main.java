package com.gl.g5b8.driver;

import java.util.ArrayList;

import com.gl.g5b8.model.AdminDepartment;
import com.gl.g5b8.model.HrDepartment;
import com.gl.g5b8.model.SuperDepartment;
import com.gl.g5b8.model.TechDepartment;

public class Main {
	public static void main(String[] args) {
		ArrayList<SuperDepartment> departments = new ArrayList<>();
		departments.add(new AdminDepartment());
		departments.add(new HrDepartment());
		departments.add(new TechDepartment());

		for (SuperDepartment department : departments) {
			System.out.println("Welcome to " + department.departmentName());
			if (department instanceof HrDepartment) {
				System.out.println(((HrDepartment) department).doActivity());
			}
			System.out.println(department.getTodaysWork());
			System.out.println(department.getWorkDeadline());
			if (department instanceof TechDepartment) {
				System.out.println(((TechDepartment) department).getTechStackInformation());
			}
			System.out.println(department.isTodayAHoliday());
			System.out.println();
		}
	}
}

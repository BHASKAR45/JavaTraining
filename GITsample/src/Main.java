package com.cloudgensys.training;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<MyPojo> emps = new ArrayList<MyPojo>();
		emps.add(new MyPojo(1,"name1",15000,true));
		emps.add(new MyPojo(1,"name2",25000,true));
		emps.add(new MyPojo(1,"name3",35000,true));
		
		for(MyPojo e:emps){
			System.out.println("\nid:" +e.getID()+"\name:" +e.getEmpName()+"\nsalary:"+e.getEmpSalary()+"\nstatus:" +e.isStatus());
		}
	}

}

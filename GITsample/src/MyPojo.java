package com.cloudgensys.training;

public class MyPojo {

		private static int ID;
		private String empName;
		private float empSalary;
		private boolean status;
		
		MyPojo(int id, String empName,float empSalary, boolean status){
			ID = id;
			this.empName = empName;
			this.empSalary = empSalary;
			this.status = status;
		}
		
		public static int getID() {
			return ID;
		}
		public static void setID(int id) {
			MyPojo.ID = id;
				
		}

		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public float getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(float empSalary) {
			this.empSalary = empSalary;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
			
		}
	
	   

}

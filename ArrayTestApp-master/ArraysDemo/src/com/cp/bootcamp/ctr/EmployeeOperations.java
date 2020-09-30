package com.cp.bootcamp.ctr;

import com.cp.bootcamp.bean.Employee;

public class EmployeeOperations {
	Employee arr[] = new Employee[100];
	static int index = 0;
	
	public boolean addEmployee(Employee e)
	{
		arr[index++] = e;
		return true;
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee e = null;
		for (int i = 0; i < index; i++) {
			if(arr[i].getCode() == id)
			{
				return arr[i];
			}
		}
		return e;
	}
	
       public Employee updateSalary(String project,int x) {
    	   for (int i = 0; i < index; i++) {
    			if(arr[i].getProject().equals(project))
    			{
    				int Salary = arr[i].getSalary();
    				int updatedSalary = (int)(Salary*(x/100));
    				arr[i].setSalary(updatedSalary);
    				
    			}
    		}
    		
    		return null;	
  
		}
		
		
	public Employee getAllEmployees()
	{
			
Employee e = null;
		
		for (int i = 0; i < index; i++) {
			System.out.println( arr[i]);
		}
		return e;
				
		
	}
	
	


}

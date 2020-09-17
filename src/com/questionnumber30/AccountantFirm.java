package com.questionnumber30;

public class AccountantFirm implements Company{
	int[] income;
	
	AccountantFirm(int n){
		this.income = new int[n];
	}

	@Override
	public void assignSalaries(int[] salaries) throws Exception {
		if(income.length!=salaries.length) {
			throw new Exception("Salary does not match with employee");
		}
		this.income = salaries;
	}

	@Override
	public void averageSalary() {
	}

	@Override
	public void maxSalary() {
		int max = income[0];
		for(int i =0; i<income.length; i++) {
			if(income[i]>max) {
				max = income[i];
			}
		}
		System.out.println("Maximum Salary is "+ max);
	}

	@Override
	public void minSalary() {
		int min = income[0];
		for(int i =0; i<income.length; i++) {
			if(income[i]<min) {
				min = income[i];
			}
		}
		System.out.println("Minimum Salary is "+ min);
	}
}

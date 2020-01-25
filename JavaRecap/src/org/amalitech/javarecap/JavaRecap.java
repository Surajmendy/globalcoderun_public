package org.amalitech.javarecap;

public class JavaRecap {

	public static void main(String[] args) {
		
		//bsilfd
		//b : boolean 
		//s : short
		//i : int
		//l : long
		//f : float
		//d : double
		
		//Initialisation of variables 
		int retirement_age_i = 45;
		
		boolean should_retire_bool;
		should_retire_bool = false;
		
		int customer_age_i = 27;
		
		if(should_retire_bool) {
			
		}
		
		
		/*if(customer_age_i < retirement_age_i){
			//the customer cannot retire now
			should_retire_bool=false;
		}else{
			should_retire_bool=true;
		}*/
		
		int customer_yob_i = 1970;
		int retirement_yob_mark_i = 2020 - 45;
		
		String rslt = "";
		
		switch(customer_yob_i){
			case 1970:
				//do something here . . .
				rslt = "This user was born -> 1970.";
				break;
			case 2020:
				rslt = "This is just a baby.";
				break;
			default:
				rslt = "This user was born -> "+customer_yob_i;
				//do all things related to default,
				//ie. because we cannot predict all
				//the possibilities
				
			break;
		}
		
		System.out.println(rslt);
		
		/*System.out.println(
			"The response for retirement is : "
			//+should_retire_bool
			+is_A_less_than_B(customer_age_i, retirement_age_i)
		);*/
		
	}

	private static boolean is_A_less_than_B(int a, int b) {
		boolean bool=false;
		if(a < b) {
			switch(a) {
			case 27:
				
				break;
				default:
					
					break;
			}
			//the customer cannot retire now
			//should_retire_bool=false;
			//return false;
			bool=false;
		}else{
			
			//should_retire_bool=true;
			//return true;
			bool=true;
		}
		return bool;
		
	}

}

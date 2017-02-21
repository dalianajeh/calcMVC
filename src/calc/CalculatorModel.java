package calc;

public class CalculatorModel {

	
	private int result;
	
	public void addNumbers(int fn, int sn){
		
		result = fn + sn;
		
	}
	
	public void subNumbers(int fn, int sn){
		
		result = fn - sn;
		
	}
	public void mulNumbers(int fn, int sn){
	
	result = fn * sn;
	
}
	public void divNumbers(int fn, int sn){
	
	result = fn / sn;
	
}

	public void modNumbers(int fn, int sn){
	

	result= fn%sn;
	
}
	public int getResult(){
		
		return result;
		
	}
	
}//class
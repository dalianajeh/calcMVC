package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		
		
		this.theView.addListener(new CalculateListener());
		this.theView.subListener(new CalculateListener());
		this.theView.mulListener(new CalculateListener());
		this.theView.divListener(new CalculateListener());
		this.theView.modListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			
			try{
			
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
			if(e.getSource()==theView.addButton)
				theModel.addNumbers(firstNumber, secondNumber);
			else
				if(e.getSource()==theView.divButton)
				theModel.divNumbers(firstNumber, secondNumber);
				else
					if(e.getSource()==theView.modButton)
				theModel.modNumbers(firstNumber, secondNumber);
					else
						if(e.getSource()==theView.mulButton)
				theModel.mulNumbers(firstNumber, secondNumber);
						else
							if(e.getSource()==theView.subButton)
				theModel.subNumbers(firstNumber, secondNumber);
				

				theView.setResult(theModel.getResult());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
}
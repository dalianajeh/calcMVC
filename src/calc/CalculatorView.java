package calc;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	private JTextField result = new JTextField(10);
	
	private JLabel fn1 = new JLabel("First Number");
	private JLabel sn1 = new JLabel("Second Number");
	private JLabel res = new JLabel("Resul");
	
	public JButton addButton = new JButton("+");
	public JButton subButton = new JButton("-");
	public JButton mulButton = new JButton("*");
	public JButton divButton = new JButton("/");
	public JButton modButton = new JButton("%");

	
	CalculatorView(){
		

		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(fn1);
		calcPanel.add(secondNumber);
		calcPanel.add(sn1);
		calcPanel.add(result);
		calcPanel.add(res);
		
		
		this.add(calcPanel ,BorderLayout.NORTH);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(addButton);
		buttonPanel.add(subButton);
		buttonPanel.add(mulButton);
		buttonPanel.add(divButton);
		buttonPanel.add(modButton);
		
		this.add(buttonPanel , BorderLayout.SOUTH);
	
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}
	
	public int getResult(){
		
		return Integer.parseInt(result.getText());
		
	}
	
	public void setResult(int solution){
		
		result.setText(Integer.toString(solution));
		
	}

	void addListener(ActionListener listenForaddButton){
	
		addButton.addActionListener(listenForaddButton);
		
	}
	
	void subListener(ActionListener listenForsubButton){
		
		subButton.addActionListener(listenForsubButton);
		
	}

	void mulListener(ActionListener listenFormulButton){
	
		mulButton.addActionListener(listenFormulButton);
		
	}
	
	void divListener(ActionListener listenFordivButton){
	
		divButton.addActionListener(listenFordivButton);
		
	}
	
	void modListener(ActionListener listenFormodButton){
	
		modButton.addActionListener(listenFormodButton);
		
	}

	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}
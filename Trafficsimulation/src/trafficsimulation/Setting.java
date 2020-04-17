/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsimulation;

/**
 *
 * @author zheng
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;

public class Setting extends JFrame {
    
    static JTextField redText;
	static JTextField greenText;
	static JTextField delayText;
	static JTextField SNText;
	static JTextField EWText;
	
	
	public Setting() {
		getContentPane().setLayout(null);
		
		redText = new JTextField();
		redText.setBounds(251, 87, 86, 21);
		getContentPane().add(redText);
		redText.setColumns(10);
		
		//Setting button and layout
		JButton startButton = new JButton("Start simulation");
		startButton.setBounds(165, 332, 91, 23);
		getContentPane().add(startButton);
		
		greenText = new JTextField();
		greenText.setBounds(251, 136, 86, 21);
		getContentPane().add(greenText);
		greenText.setColumns(10);
		
		JLabel redLabel = new JLabel("2,3 Red light");
		redLabel.setBounds(73, 90, 143, 15);
		getContentPane().add(redLabel);
		
		JLabel greenLabel = new JLabel("2,3 Green light);
		greenLabel.setBounds(73, 139, 143, 15);
		getContentPane().add(greenLabel);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(62, 87, 1, 1);
		getContentPane().add(verticalGlue);
		
		delayText = new JTextField();
		delayText.setBounds(251, 181, 86, 21);
		getContentPane().add(delayText);
		delayText.setColumns(10);
		
		JLabel delayLabel = new JLabel("6,7 Green light delay");
		delayLabel.setBounds(73, 184, 127, 15);
		getContentPane().add(delayLabel);
		
		JLabel lblNewLabel = new JLabel("South to North gap");
		lblNewLabel.setBounds(73, 235, 129, 15);
		getContentPane().add(lblNewLabel);
		
		SNText = new JTextField();
		SNText.setBounds(251, 232, 86, 21);
		getContentPane().add(SNText);
		SNText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("East to West gap");
		lblNewLabel_1.setBounds(73, 282, 134, 15);
		getContentPane().add(lblNewLabel_1);
		
		EWText = new JTextField();
		EWText.setBounds(251, 279, 86, 21);
		getContentPane().add(EWText);
		EWText.setColumns(10);
		
		JLabel label = new JLabel("Traffic simulation system");
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setBounds(128, 33, 149, 15);
		getContentPane().add(label);
		
	
	
		this.setSize(431, 443);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		SimpleListener ourListener = new SimpleListener(); 
		startButton.addActionListener(ourListener); 
	}
	//New FramDome when SimpleListener implement
	private class SimpleListener implements ActionListener 
    {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			FrameDemo demo = new FrameDemo();
		} 
    
    }
	public static void main(String[] args) {
		Setting demo = new Setting();
	}
    
    
}

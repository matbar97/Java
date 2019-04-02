import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CelsiusToFahrenheit extends JFrame implements ActionListener
{
	private JLabel lCelsius, lFahrenheit;
	private JTextField tCelsius, tFahrenheit;
	private JButton bKonwertuj;
	private ButtonGroup bgRozmiar;
	private ButtonGroup radioPanel;
	private JRadioButton rbCtoF, rbFtoC;
	private JRadioButton rbMa≥y, rbåredni, rbDuøy;
	double tempCelsius, tempFahrenheit;
	
	public CelsiusToFahrenheit()
	{
		
		//tworzenie okna g≥Ûwnego
		this.setSize(700,600);
		this.setTitle("Konwersja");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		//etykieta ze stopniami Celsjusza
		lCelsius = new JLabel("Stopnie Celsjusza: ");
		lCelsius.setBounds(50, 50, 200, 200); 
		this.add(lCelsius);
		
		//Pole tekstowe dla stopni Celsjusza
		tCelsius = new JTextField("");
		tCelsius.setBounds(180, 135, 200, 30);
		this.add(tCelsius);
		tCelsius.addActionListener(this);
		tCelsius.setToolTipText("Podaj temperaturÍ w Celsjuszach: ");
		
		//etykieta dla stopni Fahrenheita
		lFahrenheit = new JLabel("Stopnie Fahrenheita: ");
		lFahrenheit.setBounds(50, 90, 200, 200); 
		this.add(lFahrenheit);
		
		//Pole tekstowe dla stopni Fahrenheita
		tFahrenheit = new JTextField(null);
		tFahrenheit.setBounds(180, 180, 200, 30);
		this.add(tFahrenheit);
		tFahrenheit.setToolTipText("Podaj temp w Fahrenheitach: ");
		
		// przycisk konwertujπcy na stopnie Fahrenheita
		bKonwertuj = new JButton("Konwertuj");
		bKonwertuj.setBounds(180, 230, 250, 30);
		this.add(bKonwertuj);		
		bKonwertuj.addActionListener(this);		
		
		radioPanel = new ButtonGroup();
		rbCtoF = new JRadioButton("Celsius to Fahrenheit");
		rbFtoC = new JRadioButton("Fahrenheit to Celsius");
		
		
		
		rbCtoF.setBounds(200, 320, 200, 30);		
		rbFtoC.setBounds(200, 400, 200, 30);
		
		rbCtoF.addActionListener(this); rbFtoC.addActionListener(this);
		
		radioPanel.add(rbCtoF); radioPanel.add(rbFtoC);		
		this.add(rbCtoF); this.add(rbFtoC);	
		
		
		//grupowanie radio buttonÛw
		bgRozmiar = new ButtonGroup();
		//radio buttony (jeden musi mieÊ ustawione true)
		rbMa≥y = new JRadioButton("Ma≥y", true);
		rbMa≥y.setBounds(100, 320, 250, 30);
		bgRozmiar.add(rbMa≥y);
		this.add(rbMa≥y);
		rbMa≥y.addActionListener(this);
		
		rbåredni = new JRadioButton("åredni", false);
		rbåredni.setBounds(100, 350, 250, 30);
		bgRozmiar.add(rbåredni);
		this.add(rbåredni);
		rbåredni.addActionListener(this);
		
		rbDuøy = new JRadioButton("Duøy", false);
		rbDuøy.setBounds(100, 380, 250, 30);
		bgRozmiar.add(rbDuøy);
		this.add(rbDuøy);
		rbDuøy.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) 
	{
		CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();
		
		if (zrodlo == bKonwertuj)
		{
			if (rbCtoF.isSelected())
			{
				tempCelsius = Double.parseDouble(tCelsius.getText());
				tempFahrenheit = 32.0 + (9.0/5.0) * tempCelsius;
				tFahrenheit.setText(String.valueOf(tempFahrenheit));
			}
			else if(rbFtoC.isSelected())
			{
				tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
				tempCelsius = (tempFahrenheit - 32)/1.8;
				tCelsius.setText(String.valueOf(tempCelsius));
			}
		}		
		if(zrodlo == tCelsius)
		{
			tempCelsius = Double.parseDouble(tCelsius.getText());
			tempFahrenheit = 32.0 + (9.0/5.0) * tempCelsius;
			tFahrenheit.setText(String.valueOf(tempFahrenheit));
		}
		else if (zrodlo == tFahrenheit)
		{
			tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
			tempCelsius = (tempFahrenheit - 32)/1.8;
			tCelsius.setText(String.valueOf(tempCelsius));
		}							
		else if (rbMa≥y.isSelected())
		{
			tFahrenheit.setFont(new Font("Times New Roman", Font.PLAIN, 11));	
			tCelsius.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		}
		else if (zrodlo == rbåredni)
		{
			tFahrenheit.setFont(new Font("Times New Roman", Font.PLAIN, 15));	
			tCelsius.setFont(new Font("Times New Roman", Font.PLAIN, 15));			
		}
		else if (zrodlo == rbDuøy)
		{
			tFahrenheit.setFont(new Font("Times New Roman", Font.PLAIN, 18));	
			tCelsius.setFont(new Font("Times New Roman", Font.PLAIN, 18));			
		}
	}

}

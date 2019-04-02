import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;




import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Frame extends JFrame implements ActionListener
{
	private JMenuBar menuBar;
	private JMenu menuAplikacja;
	private JMenuItem menuZamknij;
	private JPanel pDanePacjenta, pBadanie, pListaPacjent�w;
	private JLabel lImie, lNazwisko, lPESEL, lP�e�, lUbezpieczenie, lData, lHDL, lLDL, lTG;
	private JTextField tfImie, tfNazwisko, tfPESEL, tfHDL, tfLDL, tfTG;
	private JRadioButton rbKobieta, rbM�czyzna;
	private JButton bZapisz, bAnuluj, bZapisz2, bAnuluj2, bDodaj, bUsu�, bAktualizuj;
	private JComboBox cbUbezpieczenie;
	private String[] ubezpieczenie = {"Brak", "NFZ", "Prywatne"};
	private JSpinner sData;
	private SpinnerDateModel sdmData;
	private JTable tListaPacjent�w;
	private DefaultTableModel model;
	//private String DanePacjenta[] = {""};
	private JScrollPane spListaPacjent�w;
	//public ArrayList<Pacjent> listaPacjent�w = new ArrayList<Pacjent>();
	private Font czcionka;
	private Object rz�d[] = new Object[6];
	//private ButtonGroup gPrzyciski;
	private JCheckBox chbBadanie;


	
	public Frame()
	{
		
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1440, 30);
		
		this.getContentPane().add(menuBar);
		
		menuAplikacja = new JMenu("Aplikacja Profil lipidowy oznaczany we krwi");
		menuAplikacja.setSize(1440, 10);
		menuBar.add(menuAplikacja);
		
		menuZamknij = new JMenuItem("Zamknij");
		menuAplikacja.add(menuZamknij);	
		menuZamknij.addActionListener(this);
		menuZamknij.setAccelerator(KeyStroke.getKeyStroke("alt F4"));
		
		//Panel Dane Pacjenta
		pDanePacjenta = new JPanel();
		pDanePacjenta.setBackground(Color.yellow);
		pDanePacjenta.setLayout(null);
		pDanePacjenta.setBorder(BorderFactory.createTitledBorder("Dane pacjenta"));
		pDanePacjenta.setBounds(0, 55, 700, 400);
		
		this.getContentPane().add(pDanePacjenta);			
		
		
		//Komponenty Panelu Dane Pacjenta
		lImie = new JLabel("Imi�: ");
		pDanePacjenta.add(lImie);
		lImie.setBounds(10, 10, 100, 80);
	
		
		lNazwisko = new JLabel("Nazwisko: ");
		pDanePacjenta.add(lNazwisko);
		lNazwisko.setBounds(10, 60, 100, 80);
		
		
		
		lPESEL = new JLabel("PESEL: ");
		pDanePacjenta.add(lPESEL);
		lPESEL.setBounds(10, 110, 100, 80);
		
		
		
		lP�e� = new JLabel("P�e�");
		pDanePacjenta.add(lP�e�);
		lP�e�.setBounds(10, 160, 100, 80);
		
		
				
		rbKobieta = new JRadioButton();
		pDanePacjenta.add(rbKobieta);
		rbKobieta.setText("Kobieta");
		rbKobieta.setBounds(110, 185, 70, 30);
		rbKobieta.addActionListener(this);
				

		rbM�czyzna = new JRadioButton();
		pDanePacjenta.add(rbM�czyzna);
		rbM�czyzna.setText("M�czyzna");
		rbM�czyzna.setBounds(200, 185, 90, 30);
		rbM�czyzna.addActionListener(this);
		
		
//		gPrzyciski = new ButtonGroup();
//		gPrzyciski.add(rbM�czyzna);
//		gPrzyciski.add(rbKobieta);
		
		
		
		lUbezpieczenie = new JLabel("Ubezpieczenie");
		pDanePacjenta.add(lUbezpieczenie);
		lUbezpieczenie.setBounds(10, 210, 100, 80);	
		
		
		
		bZapisz = new JButton("Zapisz");
		pDanePacjenta.add(bZapisz);
		bZapisz.setBounds(10, 340, 75, 20);
		bZapisz.addActionListener(this);
				
		
		bAnuluj = new JButton("Anuluj");
		pDanePacjenta.add(bAnuluj);
		bAnuluj.setBounds(85, 340, 75, 20);
		bAnuluj.addActionListener(this);
		
		
		cbUbezpieczenie = new JComboBox(ubezpieczenie);
		pDanePacjenta.add(cbUbezpieczenie);
		cbUbezpieczenie.setBounds(110, 242, 100, 20);
			
		
		//Panel Badanie		
		pBadanie = new JPanel();
		pBadanie.setBackground(Color.yellow);
		pBadanie.setLayout(null);
		pBadanie.setBorder(BorderFactory.createTitledBorder("Badanie"));
		pBadanie.setBounds(0, 460, 700, 300);
		this.getContentPane().add(pBadanie);	
		
		
		//Komponenty Badanie
		lData= new JLabel("Data: ");
		pBadanie.add(lData);
		lData.setBounds(10, 10, 100, 80);		
		
		
		sdmData = new SpinnerDateModel();			
		
		
		sData = new JSpinner();
		pBadanie.add(sData);
		sData.setModel(sdmData);
		sData.setBounds(110, 35, 200, 30);
		
		
		lHDL = new JLabel("HDL: "); 
		pBadanie.add(lHDL);
		lHDL.setBounds(10, 60, 100, 80);
		
		
		lLDL = new JLabel("LDL: "); 
		pBadanie.add(lLDL);
		lLDL.setBounds(10, 110, 100, 80);
		
		
		lTG = new JLabel("TG: "); 
		pBadanie.add(lTG);
		lTG.setBounds(10, 160, 100, 80);
		
		
		tfHDL = new JTextField("");
		pBadanie.add(tfHDL);
		tfHDL.setBounds(110, 85, 200, 30);
		
		
		tfLDL = new JTextField("");
		pBadanie.add(tfLDL);
		tfLDL.setBounds(110, 135, 200, 30);
		
		
		tfTG = new JTextField("");
		pBadanie.add(tfTG);
		tfTG.setBounds(110, 185, 200, 30);
		
		
		bZapisz2 = new JButton("Zapisz");
		pBadanie.add(bZapisz2);
		bZapisz2.setBounds(10, 250, 75, 20);
		
		bAnuluj2 = new JButton("Anuluj");
		pBadanie.add(bAnuluj2);
		bAnuluj2.setBounds(85, 250, 75, 20);
		bAnuluj2.addActionListener(this);
		
		//Panel Lista Pacjent�w
		
		pListaPacjent�w = new JPanel();
		pListaPacjent�w.setBackground(Color.yellow);
		pListaPacjent�w.setLayout(null);
		pListaPacjent�w.setBorder(BorderFactory.createTitledBorder("Lista pacjent�w"));
		pListaPacjent�w.setBounds(710, 55, 700, 705);
		this.getContentPane().add(pListaPacjent�w);	
		
		//Tabela do kt�rej wpisywani s� kolejni pacjenci
		Object[] DanePacjenta = 
			{
				"Imi�", "Nazwisko", "P�e�", "PESEL", "Ubezpieczenie", "Badanie"
		};
		
		model = new DefaultTableModel();
		model.setColumnIdentifiers(DanePacjenta);
		
		//Tabela i model Tabeli
		tListaPacjent�w = new JTable();
		tListaPacjent�w.setModel(model);
		
		//Zabawa z tabel�, czyli zmiany koloru, czcionki itd.
		tListaPacjent�w.setBackground(Color.WHITE);
		tListaPacjent�w.setForeground(Color.BLACK);
		czcionka = new Font("Times New Roman", 1, 15);
		tListaPacjent�w.setFont(czcionka);
		tListaPacjent�w.setRowHeight(20);
		
		//Pola tekstowe Imie, Nazwisko itd.
		tfImie = new JTextField("");
		pDanePacjenta.add(tfImie);
		tfImie.setBounds(110, 35, 200, 30);
		tfImie.addActionListener(this);
		
		tfNazwisko = new JTextField(" ");
		pDanePacjenta.add(tfNazwisko);
		tfNazwisko.setBounds(110, 85, 200, 30);
		
		tfPESEL = new JTextField(" ");
		pDanePacjenta.add(tfPESEL);
		tfPESEL.setBounds(110, 135, 200, 30);
		
		//przycisk Dodaj Usu� Aktualizuj
		bDodaj = new JButton("Dodaj");
		pListaPacjent�w.add(bDodaj);
		bDodaj.setBounds(10, 650, 75, 20);
	
		bUsu� = new JButton ("Usu�");
		pListaPacjent�w.add(bUsu�);
		bUsu�.setBounds(85, 650, 75, 20);

		
		//Panel Scrolluj�cy JScrollPane
		spListaPacjent�w = new JScrollPane(tListaPacjent�w);
		spListaPacjent�w.setBounds(10, 50, 600, 500);
		pListaPacjent�w.add(spListaPacjent�w);
		
		
		//Wpisywanie danych o pacjencie w konkretne miejsca - tablica
		bDodaj.addActionListener(this);
		bUsu�.addActionListener(this);
		
		chbBadanie = new JCheckBox();
		
		this.setTitle("Rejestracja wynik�w bada�");
		this.setSize(1440,825);	
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		
		
// ------ Po co mi to??? ----- Skoro i tak dzia�a bez tej metody jak trzeba..... ????? ----- ///		
		tListaPacjent�w.addMouseListener(new MouseAdapter()
				{
			public void mouseClicked(MouseEvent e)
			{
				Pacjent p = new Pacjent(tfImie.getText(), tfNazwisko.getText(), tfPESEL.getText());

				int i = tListaPacjent�w.getSelectedRow();
				
				tfImie.setText(model.getValueAt(i, 0).toString());
				tfNazwisko.setText(model.getValueAt(i, 1).toString());
				tfPESEL.setText(model.getValueAt(i, 3).toString());	
				if(rbKobieta.isSelected())
				{
					model.getValueAt(i, 2);
				}
				else if(rbM�czyzna.isSelected())
				{
					model.getValueAt(i, 2);
				}		
				
			}
				});       
        
		
	}
	@Override
	public void actionPerformed (ActionEvent e) 
	{
		ArrayList<Pacjent> lista = new ArrayList<Pacjent>();

		Pacjent p = new Pacjent(tfImie.getText(), tfNazwisko.getText(), tfPESEL.getText());
		//Badanie b = new Badanie(tfHDL, tfLDL.toString(), tfTG.toString());
		//cbUbezpieczenie.setSelectedItem(" ");

		Object source = e.getSource();

		if(source == menuZamknij) 
		{
			this.dispose();
		}		
		
		if(source == rbKobieta)
		{
			if(rbKobieta.isSelected())
			{
				rbM�czyzna.setSelected(false);
			}
		}
		if(source == rbM�czyzna)
		{
			if(rbM�czyzna.isSelected())
			{
				rbKobieta.setSelected(false);
			}
		}
			
		if(source == bZapisz)
		{	
			
			int i = tListaPacjent�w.getSelectedRow();			

			if(i>=0)
			{
				model.setValueAt(p.getmImie(),i , 0);
				
				model.setValueAt(p.getmNazwisko(),i , 1);
				
					if(rbKobieta.isSelected())
					{	
						p.setP�e�("K");
						model.setValueAt(p.getP�e�(), i, 2);
					}
					
					else if(rbM�czyzna.isSelected()) 
					{
						p.setP�e�("M");
						model.setValueAt(p.getP�e�(), i, 2);
					}
		
				model.setValueAt(p.getmPESEL(),i , 3);
					
				if(cbUbezpieczenie.getSelectedItem().equals("Brak"))
					{
						p.setUbezpieczenie("Brak");
						model.setValueAt(p.getUbezpieczenie().toString(), i, 4);
					}
				else if(cbUbezpieczenie.getSelectedItem().equals("NFZ"))
				{
					p.setUbezpieczenie("NFZ");
					model.setValueAt(cbUbezpieczenie.getSelectedItem().toString(), i, 4);
				}
				else if(cbUbezpieczenie.getSelectedItem().equals("Prywatne"))
				{
					p.setUbezpieczenie("Prywatne");
					model.setValueAt(cbUbezpieczenie.getSelectedItem().toString(), i, 4);
				}
			}
			else
			{
				System.out.println("Problem z aktualizacj� listy");
			}
		
		}
		
		if(source == bAnuluj)
		{
			tfImie.setText(null);
			tfNazwisko.setText(null);
			tfPESEL.setText(null);
			rbKobieta.setSelected(false);
			rbM�czyzna.setSelected(false);
			cbUbezpieczenie.setSelectedIndex(-1);
		}
		
		if(source == bZapisz2)
		{
			
		}
		
		if (source == bAnuluj2)
		{
			tfLDL.setText(null);
			tfHDL.setText(null);
			tfTG.setText(null);
		}
		
		if(source == bDodaj)
		{	
			lista.add(p);
			for (Pacjent P : lista)
			{
				rz�d[0] = P.getmImie();
	            rz�d[1] = P.getmNazwisko();
	            if (rbKobieta.isSelected())
	            {	
					P.setP�e�("K");
					rz�d[2] = P.getP�e�();				
				}
	            else if (rbM�czyzna.isSelected()) 
				{
					P.setP�e�("M");
					rz�d[2] = P.getP�e�();				
				}
	            else rz�d[2] = null;
	            
	            rz�d[3] = P.getmPESEL();
	            
	            rz�d[4] = cbUbezpieczenie.getSelectedItem();

	            model.addRow(rz�d);
			}	

		}		
		if(source == bUsu�)
		{
			lista.remove(p);
			int i = tListaPacjent�w.getSelectedRow();
			if(i >= 0)
			{
				model.removeRow(i);
				tfImie.setText(null);
				tfNazwisko.setText(null);
				tfPESEL.setText(null);	
				rbKobieta.setSelected(false);
				rbM�czyzna.setSelected(false);
				cbUbezpieczenie.setSelectedIndex(-1);
			}
			else
			{
				System.out.println("Problem z usuni�ciem");
			}
			
		}	
	}
	
	
	public static void main (String[] args) 
	{		
		SwingUtilities.invokeLater (new Runnable()
		{
			public void run()
			{
				Frame app = new Frame();
				app.setVisible(true);
				app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
				
			}
		}				
		);	    
	}

	
}


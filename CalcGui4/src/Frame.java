import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Frame extends JFrame implements ActionListener, KeyListener {

	// -------Globale Deklarationen -----------

	private int zahl1;
	private int zahl2;
	private int erg;
	public String ergCheck;
	public boolean plusOperator = false;
	public boolean minusOperator = false;
	public boolean querOperator = false;
	public boolean sumOperator = false;
	public boolean clearOperator = false;
	public boolean modOperator = false;
	public boolean geteiltOperator = false;
	public boolean malOperator = false;
	public boolean istOperator = false;
	public boolean ergOperator = false;
	public String ergString;
	public boolean einOperatorGedrueckt = false;
	public boolean zahlGesetzt = false;

	// -------- Buttons + TextField---------------
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JButton button11;
	JButton button12;
	JButton button13;
	JButton button14;
	JButton button15;
	JButton button16;
	JButton button17;
	JButton button18;
	JButton button19;
	JButton button20;
	JTextField textField;

	// ------erzeugte Objekte-------------

	NumPad numPad = new NumPad(this);
	ButtonEingabe buttonEingabe = new ButtonEingabe(this);

	// -------Frame--------------

	Frame() {
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setSize(500, 700);

		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setBounds(0, 0, 250, 250);
		panel.setLayout(new GridLayout(5, 4, 20, 20));
		panel.setPreferredSize(new Dimension(300, 500));

		button1 = new JButton("CLEAR");
		button2 = new JButton("MOD");
		button3 = new JButton("SUM");
		button4 = new JButton("/");
		button5 = new JButton("7");
		button6 = new JButton("8");
		button7 = new JButton("9");
		button8 = new JButton("*");
		button9 = new JButton("4");
		button10 = new JButton("5");
		button11 = new JButton("6");
		button12 = new JButton("-");
		button13 = new JButton("1");
		button14 = new JButton("2");
		button15 = new JButton("3");
		button16 = new JButton("+");
		button17 = new JButton("0");
		button18 = new JButton("QUER");
		button19 = new JButton("ERG");
		button20 = new JButton("=");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button20.addActionListener(this);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Calibri", Font.PLAIN, 35));
		textField.setBackground(Color.lightGray);
		textField.setForeground(Color.black);
		textField.setText("Taschenrechner Eingabefeld");
		textField.addKeyListener(this);

		this.add(textField);
		this.add(panel, BorderLayout.SOUTH);
		this.setVisible(true);

		JOptionPane.showMessageDialog(null, "Der Taschenrechner kann über Buttons oder das NumPad bedient werden. Er rechnet jeweils mit zwei zu verrechnenden Eingaben.",
				"Taschenrechner", JOptionPane.INFORMATION_MESSAGE);
	}

	// -------Methoden KeyListener-------------

	@Override
	public void keyTyped(KeyEvent e) { // --------unbenutzt----------------
	}

	@Override
	public void keyPressed(KeyEvent e) { // --------unbenutzt----------------
	}

	@Override
	public void keyReleased(KeyEvent e) { // -------------NumPad-Eingabe-----------------------

		numPad.NumPadRechnen(e);
	}

	// -------Methode ActionListener------------------

	@Override
	public void actionPerformed(ActionEvent e) { // -----------Button-Eingabe-----------------

		buttonEingabe.ButtonRechnen(e);
	}
// ------ getter & setter -------------

	public int getZahl1() {
		return zahl1;
	}

	public void setZahl1(int zahl1) {
		this.zahl1 = zahl1;
	}

	public int getZahl2() {
		return zahl2;
	}

	public void setZahl2(int zahl2) {
		this.zahl2 = zahl2;
	}

	public int getErg() {
		return erg;
	}

	public void setErg(int erg) {
		this.erg = erg;
	}

}
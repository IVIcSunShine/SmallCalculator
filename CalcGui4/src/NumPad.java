import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class NumPad {

	// -------Globale Deklarationen -----------

	Frame frame;
	Rechnen rechnen;

	// -----------Konstruktor-----------------
	NumPad(Frame frame) {
		this.frame = frame;
		rechnen = new Rechnen(frame);
	}

	// ---------Methode-------------------
	public void NumPadRechnen(KeyEvent e) {

		// -----------1. Zahl einlesen-----------------------

		if (e.getKeyCode() == 103 && frame.einOperatorGedrueckt == false) {

			if (frame.zahlGesetzt == false) {
				frame.textField.setText("7");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 7);

			if (frame.zahlGesetzt == true) {

				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 104 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("8");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 8);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 105 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("9");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 9);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 100 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("4");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 4);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 101 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("5");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 5);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 102 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("6");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 6);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 97 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("1");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 1);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 98 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("2");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 2);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 99 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("3");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 3);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 96 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("0");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 0);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		// ---------------Operatoren --------------

		if (e.getKeyCode() == 107) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("+");

			frame.plusOperator = true;
		}

		if (e.getKeyCode() == 111) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("/");

			frame.geteiltOperator = true;

		}

		if (e.getKeyCode() == 106) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("*");

			frame.malOperator = true;

		}

		if (e.getKeyCode() == 109) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("-");

			frame.minusOperator = true;
		}

		if (e.getKeyCode() == 12 && frame.einOperatorGedrueckt == false) {
			frame.einOperatorGedrueckt = false;
			frame.zahlGesetzt = false;
			frame.textField.setText("CLEAR ZAHL 1");
			frame.setZahl1(0);
			frame.setZahl2(0);
		}

		// ---------------2. Zahl einlesen -------------

		if (e.getKeyCode() == 103 && frame.einOperatorGedrueckt == true) {

			if (frame.zahlGesetzt == false) {
				frame.textField.setText("7");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 7);

			if (frame.zahlGesetzt == true) {

				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 104 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("8");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 8);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 105 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("9");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 9);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 100 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("4");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 4);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 101 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("5");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 5);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 102 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("6");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 6);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 97 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("1");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 1);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 98 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("2");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 2);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 99 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("3");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 3);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 96 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("0");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 0);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getKeyCode() == 12 && frame.einOperatorGedrueckt == true) {
			frame.zahlGesetzt = false;
			frame.textField.setText("CLEAR ZAHL 2");
			frame.setZahl2(0);
		}

		// -------- Gleich setzen ----------------------

		if (e.getKeyCode() == 61) {
			frame.einOperatorGedrueckt = false;
			frame.zahlGesetzt = false;
			frame.textField.setText("=");

			if (frame.plusOperator == true) {
				frame.setErg(rechnen.plus());
				frame.textField.setText(frame.ergString);

			}

			if (frame.minusOperator == true) {
				frame.setErg(rechnen.minus());
				frame.textField.setText(frame.ergString);

			}

			if (frame.malOperator == true) {
				frame.setErg(rechnen.mal());
				frame.textField.setText(frame.ergString);

			}

			if (frame.geteiltOperator == true) {
				frame.setErg(rechnen.geteilt());
				frame.textField.setText(frame.ergString);

			}

			if (frame.modOperator == true) {
				frame.setErg(rechnen.mod());
				frame.textField.setText(frame.ergString);

			}

			if (frame.sumOperator == true) {
				frame.setErg(rechnen.sum());
				frame.textField.setText(frame.ergString);

			}

			if (frame.querOperator == true) {
				frame.setErg(rechnen.quer());
				frame.textField.setText(frame.ergString);

			}
			frame.setZahl1(0);
			frame.setZahl2(0);
		}

	}

}

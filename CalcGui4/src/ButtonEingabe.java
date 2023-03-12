import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonEingabe {

	// -------Globale Deklarationen -----------

	Frame frame;
	Rechnen rechnen;

	// ----------- Konstruktor--------------

	ButtonEingabe(Frame frame) {
		this.frame = frame;
		rechnen = new Rechnen(frame);
	}

	// -------------Methode-------------

	public void ButtonRechnen(ActionEvent e) {

		// ------ 1. Zahl einlesen ----------

		if (e.getSource() == frame.button5 && frame.einOperatorGedrueckt == false) {

			if (frame.zahlGesetzt == false) {
				frame.textField.setText("7");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 7);

			if (frame.zahlGesetzt == true) {

				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button6 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("8");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 8);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button7 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("9");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 9);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button9 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("4");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 4);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button10 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("5");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 5);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button11 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("6");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 6);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button13 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("1");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 1);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button14 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("2");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 2);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button15 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("3");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 3);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button17 && frame.einOperatorGedrueckt == false) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("0");
			}

			frame.setZahl1((frame.getZahl1() * 10) + 0);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl1()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button19 && frame.einOperatorGedrueckt == false) {
			frame.textField.setText("LAST ERG: " + String.valueOf(frame.getErg())); // "ERG"

			frame.setZahl1(frame.getErg());

		}

		// ---------------Operatoren --------------

		if (e.getSource() == frame.button16) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("+");

			frame.plusOperator = true;
		}

		if (e.getSource() == frame.button4) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("/");

			frame.geteiltOperator = true;

		}
		if (e.getSource() == frame.button8) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("*");

			frame.malOperator = true;

		}

		if (e.getSource() == frame.button12) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("-");

			frame.minusOperator = true;

		}
		if (e.getSource() == frame.button2) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("MOD");

			frame.modOperator = true;
		}
		if (e.getSource() == frame.button3) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("SUM");

			frame.sumOperator = true;

		}

		if (e.getSource() == frame.button18) {
			frame.einOperatorGedrueckt = true;
			frame.zahlGesetzt = false;
			frame.textField.setText("QUER");

			frame.querOperator = true;
		}
		if (e.getSource() == frame.button1 && frame.einOperatorGedrueckt == false) {
			frame.einOperatorGedrueckt = false;
			frame.zahlGesetzt = false;
			frame.textField.setText("CLEAR ZAHL 1");
			frame.setZahl1(0);
			frame.setZahl2(0);
		}
		// ---------------2. Zahl einlesen -------------

		if (e.getSource() == frame.button5 && frame.einOperatorGedrueckt == true) {

			if (frame.zahlGesetzt == false) {
				frame.textField.setText("7");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 7);

			if (frame.zahlGesetzt == true) {

				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button6 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("8");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 8);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button7 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("9");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 9);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button9 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("4");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 4);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button10 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("5");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 5);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button11 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("6");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 6);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button13 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("1");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 1);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button14 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("2");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 2);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button15 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("3");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 3);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button17 && frame.einOperatorGedrueckt == true) {
			if (frame.zahlGesetzt == false) {
				frame.textField.setText("0");
			}

			frame.setZahl2((frame.getZahl2() * 10) + 0);

			if (frame.zahlGesetzt = true) {
				frame.textField.setText(String.valueOf(frame.getZahl2()));
			}

			frame.zahlGesetzt = true;

		}

		if (e.getSource() == frame.button19 && frame.einOperatorGedrueckt == true) {
			frame.textField.setText("LAST ERG: " + String.valueOf(frame.getErg())); // "ERG"

			frame.setZahl2(frame.getErg());

		}

		if (e.getSource() == frame.button1 && frame.einOperatorGedrueckt == true) {
			frame.zahlGesetzt = false;
			frame.textField.setText("CLEAR ZAHL 2");
			frame.setZahl2(0);

		}

		// -------- Gleich setzen ----------------------

		if (e.getSource() == frame.button20) {
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

import javax.swing.JOptionPane;

public class Rechnen {

	// -------Globale Deklarationen -----------

	Frame frame;

	// ---------- Konstruktor---------------
	Rechnen(Frame frame) {
		this.frame = frame;
	}

	// ------ Rechen-Methoden----------------

	// PLUS RECHNEN

	public int plus() {

		int a = frame.getZahl1();

		int b = frame.getZahl2();

		frame.setErg(a + b);
		frame.ergString = String.valueOf(frame.getErg());
		frame.plusOperator = false;
		return frame.getErg();

	}

	// MINUS RECHNEN

	public int minus() {
		int a = frame.getZahl1();

		int b = frame.getZahl2();

		frame.setErg(a - b);
		frame.ergString = String.valueOf(frame.getErg());
		frame.minusOperator = false;
		return frame.getErg();
	}

	// MAL RECHNEN

	public int mal() {
		int a = frame.getZahl1();

		int b = frame.getZahl2();

		frame.setErg(a * b);
		frame.ergString = String.valueOf(frame.getErg());
		frame.malOperator = false;
		return frame.getErg();
	}

	// GETEILT RECHNEN

	public int geteilt() {

		int a = frame.getZahl1();

		int b = frame.getZahl2();

		while (b == 0) {
			frame.textField.setText("ERROR");
			JOptionPane.showMessageDialog(null, "ERROR - Nenner darf nicht 0 sein!", "Fehlermeldung",
					JOptionPane.ERROR_MESSAGE);
			frame.geteiltOperator = false;
			break;
		}
		while (b != 0) {
			frame.setErg(a / b);
			frame.ergString = String.valueOf(frame.getErg());
			frame.geteiltOperator = false;
			break;
		}
		return frame.getErg();
	}

	// RESTWERT BERECHNEN

	public int mod() {
		int a = frame.getZahl1();

		int b = frame.getZahl2();

		while (b == 0) {
			frame.textField.setText("ERROR");
			JOptionPane.showMessageDialog(null, "ERROR - Durch 0 den Restwert zu berechnen ist nicht möglich!",
					"Fehlermeldung", JOptionPane.ERROR_MESSAGE);
			frame.modOperator = false;
			break;
		}
		while (b != 0) {
			frame.setErg(a % b);
			frame.ergString = String.valueOf(frame.getErg());
			frame.modOperator = false;
			break;
		}
		return frame.getErg();
	}

	// SUMME BERECHNEN

	public int sum() {
		int a = frame.getZahl1();

		int speicher = a;

		int b = frame.getZahl2();

		frame.setErg(0); // ERGEBNIS 0 setzen da sonst aufsummiert wird

		while (a >= b) {
			frame.textField.setText("ERROR");
			JOptionPane.showMessageDialog(null,
					"ERROR - Eine Summe kann nur von einer kleineren zu einer größeren Zahl berechnet werden!",
					"Fehlermeldung", JOptionPane.ERROR_MESSAGE);
			frame.sumOperator = false;
			break;

		}

		while (a < b) {
			for (int i = 0; i <= b - a; i++, speicher++) {
				frame.setErg(frame.getErg() + speicher);
			}
			frame.ergString = String.valueOf(frame.getErg());
			frame.sumOperator = false;
			break;
		}
		return frame.getErg();
	}

	// QUERSUMME BERECHNEN

	public int quer() {

		int a = frame.getZahl1();

		frame.setErg(0); // ERGEBNIS 0 setzen da sonst aufsummiert wird

		while (a <= 0) {
			frame.textField.setText("ERROR");
			JOptionPane.showMessageDialog(null,
					"ERROR - Die Quersumme kann nur aus positiven Zahlen größer 0 berechnet werden!", "Fehlermeldung",
					JOptionPane.ERROR_MESSAGE);
			frame.querOperator = false;
			break;

		}

		while (a > 0) {
			frame.setErg(frame.getErg() + (a % 10));
			a = a / 10;

			frame.ergString = String.valueOf(frame.getErg());
			frame.querOperator = false;

		}

		return frame.getErg();
	}
}

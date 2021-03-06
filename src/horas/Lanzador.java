package horas;

import java.util.Calendar;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Lanzador {

	public static final int HOURS_SCHENDULE = 7;
	public static final int MINUTES_SCHENDULE = 30;

	public static int[] format(String hour) {
		int[] time = new int[2];
		hour = hour.trim();
		StringTokenizer tokenizer = new StringTokenizer(hour, "-,;:_+-*/.");
		int h = Integer.parseInt(tokenizer.nextToken().trim());
		int m = Integer.parseInt(tokenizer.nextToken().trim());
		time[0] = h;
		time[1] = m;

		return time;
	}

	public static void main(String[] args) {

		int[] hour = format(JOptionPane.showInputDialog("�A qu� hora has entrado?"));
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, HOURS_SCHENDULE);
		calendar.set(Calendar.MINUTE, MINUTES_SCHENDULE);
		calendar.add(Calendar.HOUR, hour[0]);
		calendar.add(Calendar.MINUTE, hour[1]);
		JOptionPane.showMessageDialog(null, "Debes trabajar hasta las " + calendar.get(Calendar.HOUR_OF_DAY) + ":"
				+ calendar.get(Calendar.MINUTE) + ".");

	}
}

package lambda_practice.practice06;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing");

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ===== Button 1 =====
		JButton b1 = new JButton("Java");
		b1.setPreferredSize(new Dimension(100, 50)); // JButton 크기(가로, 세로)

		// ----- Java -----
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello, Java");
			}
		});

		frame.add(b1);

		// ===== Button 2 =====
		JButton b2 = new JButton("Lambda");
		b2.setPreferredSize(new Dimension(100, 50));

		// ----- Lambda -----
		b2.addActionListener(
				// 람다 코딩
				(ActionEvent e) -> {
					System.out.println("Welcome, Lambda");
				}
		);

		frame.add(b2);

		frame.setSize(300, 150); // Frame 크기(가로, 세로)
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));// FlowLayout() : 왼쪽 -> 오른쪽 배치
		frame.setLocationRelativeTo(null); // 창이 가운데 오픈
		frame.setVisible(true);// Frame 화면 출력
	}

}
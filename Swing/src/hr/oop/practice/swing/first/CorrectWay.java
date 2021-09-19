package hr.oop.practice.swing.first;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class CorrectWay extends JFrame {
	JButton btnAction = new JButton();
	JProgressBar pbProgress = new JProgressBar();
	public CorrectWay() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pbProgress.setMaximum(10);
		pbProgress.setMinimum(0);
		btnAction.setText("Start");
		btnAction.addActionListener((e) -> {
			btnAction_actionPerformed(e); //vidi sljedeæi slajd
		});
		add(btnAction, BorderLayout.WEST);
		add(pbProgress, BorderLayout.CENTER);
	}


	private void btnAction_actionPerformed(ActionEvent e) {
		btnAction.setEnabled(false);
		pbProgress.setValue(0);
		new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				int progressValue = i;
				SwingUtilities.invokeLater(() ->
				pbProgress.setValue(progressValue));
				try {
					Thread.sleep(500); //zaustavi izvoðenje dretve na 500ms
				} catch (InterruptedException ie) { }
			}
			SwingUtilities.invokeLater(() –> btnAction.setEnabled(true));
		}).start();
}
}
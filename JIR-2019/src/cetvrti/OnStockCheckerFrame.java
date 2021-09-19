package cetvrti;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.WindowConstants;

public class OnStockCheckerFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel lbl1 = new JLabel("Item:");
	private JTextField tf = new JTextField(20);
	private JButton btn = new JButton("Check");
	private JTextArea ta = new JTextArea (10, 0);
	private JLabel lbl2 = new JLabel("Found items:");
	
	public OnStockCheckerFrame() {
		this.setLayout(new BorderLayout());
		
		ta.setLineWrap(true);
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout());
		northPanel.add(lbl1);
		northPanel.add(tf);
		northPanel.add(btn);
		this.add(northPanel, BorderLayout.NORTH);
		
		JScrollPane sp = new JScrollPane(ta);
		this.add(sp, BorderLayout.CENTER);
		this.add(lbl2, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setEnabled(false);
				lbl2.setText("Found items: ");
				ta.setText("");
				onStockCheckerWorker bs = new onStockCheckerWorker(tf.getText());
				bs.execute();
			}
		});
	}

	private class onStockCheckerWorker extends SwingWorker<Integer, String> {
		String itemID;
		Integer totalNumOfItems;
		
		public onStockCheckerWorker(String itemId) {
			// TODO Auto-generated constructor stub
			this.itemID = itemId;
			totalNumOfItems = 0 ;
		}
		
		
		@Override 
		protected Integer doInBackground() throws Exception{
			for(String warehouse : RemoteDatabaseChecker.getRemoteWarehouses()) {
				int num = RemoteDatabaseChecker.checkRemoteForItem(warehouse, itemID);
				totalNumOfItems += num;
				publish(warehouse + " : " + num);
			}
			return totalNumOfItems;
		}
		
		@Override
		protected void process(List<String> chunks) {
			for(String el: chunks) ta.append(el +"\n");
		}
		@Override
		protected void done() {
			lbl2.setText("Found Items: " + totalNumOfItems);
			btn.setEnabled(true);
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override public void run() {
				OnStockCheckerFrame frame = new OnStockCheckerFrame();
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
	
	static class RemoteDatabaseChecker{
		public static List<String> getRemoteWarehouses(){
			return List.of("Zagreb", "Osijek", "Pula", "Varaždin", "Šibenik");
		}
		public static Integer checkRemoteForItem(String warehouse, String itemID) {
			try{
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return (int) (Math.random()*10);
		}
	}
}

package �ǽ�����;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI�ǽ� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JLabel label1 = new JLabel("ȭ���µ�", SwingConstants.CENTER);
		JLabel label2 = new JLabel("�����µ�");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("��ȯ");
		
		Font font1 = new Font(null, Font.BOLD, 30);
		
		label1.setFont(font1);
		label2.setFont(font1);
		
		label1.setForeground(Color.red);
		label2.setForeground(Color.red);
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		f.setSize(350,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("�µ���ȯ��");
		f.setVisible(true);
		
	}

}

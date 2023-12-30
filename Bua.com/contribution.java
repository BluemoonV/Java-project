import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class contribution extends JFrame{
	private JPanel p1;

	public contribution() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(new Rectangle(00,00,900,623));
		setLocationRelativeTo(null);
		p1 = new JPanel();
		p1.setBackground(new Color(13, 30, 49));
		setContentPane(p1);
		p1.setLayout(null);
		
		JButton lblNewLabel = new JButton("BACK");
		lblNewLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEADING);
		lblNewLabel.setBackground(new Color(13, 30, 49));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 547, 90, 37);
		p1.add(lblNewLabel);
		
		JLabel l1 = new JLabel("New label");
		l1.setIcon(new ImageIcon("contribution.png"));
		l1.setBounds(60, 0, 761, 584);
		p1.add(l1);
	}
}
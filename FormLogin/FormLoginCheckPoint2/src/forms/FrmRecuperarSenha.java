package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FrmRecuperarSenha extends JFrame {

	private JFrame frmRecuperarASenha;
	private JTextField textFieldEmail;
	private JLabel lblERRO;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRecuperarSenha window = new FrmRecuperarSenha();
					window.frmRecuperarASenha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmRecuperarSenha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRecuperarASenha = new JFrame();
		frmRecuperarASenha.setResizable(false);
		frmRecuperarASenha.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmRecuperarASenha.setIconImage(
				Toolkit.getDefaultToolkit().getImage(FrmRecuperarSenha.class.getResource("/forms/Logo.png")));
		frmRecuperarASenha.setTitle("Recuperar a senha");
		frmRecuperarASenha.setBounds(100, 100, 350, 264);

		JPanel panel = new JPanel();
		frmRecuperarASenha.getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblRecuperarSenha = new JLabel("Recuperar Senha");
		lblRecuperarSenha.setFont(new Font("Verdana", Font.BOLD, 22));
		panel.add(lblRecuperarSenha);

		JPanel panel_1 = new JPanel();
		frmRecuperarASenha.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(23, 50, 46, 14);
		panel_1.add(lblEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(79, 47, 195, 20);
		panel_1.add(textFieldEmail);
		textFieldEmail.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (EmailPatternCheck(textFieldEmail.getText())) {
					lblERRO.setText("Senha enviada para o seu email!");
					lblERRO.setForeground(Color.BLACK);
				} else {
					lblERRO.setText("email invalido!");
					lblERRO.setForeground(Color.RED);
				}

			}
		});

		btnEnviar.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnEnviar.setBackground(Color.DARK_GRAY);
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setBounds(79, 100, 195, 33);
		panel_1.add(btnEnviar);

		lblERRO = new JLabel("");
		lblERRO.setBounds(79, 78, 195, 14);
		panel_1.add(lblERRO);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVoltar.setBackground(Color.DARK_GRAY);
		btnVoltar.setBounds(79, 144, 195, 33);
		panel_1.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmLogin();
				FrmLogin.main(null);
				frmRecuperarASenha.dispose();
			}
		});
	}

	public static boolean EmailPatternCheck(String emailAddress) {
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		return Pattern.compile(regexPattern).matcher(emailAddress).matches();
	}
}

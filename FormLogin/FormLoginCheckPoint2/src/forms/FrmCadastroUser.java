package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCadastroUser {

	private JFrame frmCadastroUser;
	private JTextField txtEmail;
	private JPasswordField txtPassword;
	private JPasswordField txtPassowordConfirmed;
    private JLabel lblinfo;
	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCadastroUser window = new FrmCadastroUser();
					window.frmCadastroUser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmCadastroUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroUser = new JFrame();
		frmCadastroUser.setResizable(false);
		frmCadastroUser.setIconImage(		
				Toolkit.getDefaultToolkit().getImage(FrmCadastroUser.class.getResource("/forms/Logo.png")));
		frmCadastroUser.setTitle("Cadastro");
		frmCadastroUser.setBounds(100, 100, 380, 290);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmCadastroUser.getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Verdana", Font.BOLD, 26));
		lblCadastro.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblCadastro);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frmCadastroUser.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(83, 29, 44, 14);
		panel_1.add(lblEmail);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(69, 65, 58, 14);
		panel_1.add(lblSenha);

		JLabel lblConfirmSenha = new JLabel("Confirmar senha");
		lblConfirmSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmSenha.setBounds(10, 105, 117, 17);
		panel_1.add(lblConfirmSenha);

		txtEmail = new JTextField();
		txtEmail.setBounds(137, 26, 161, 20);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(137, 62, 161, 20);
		panel_1.add(txtPassword);

		txtPassowordConfirmed = new JPasswordField();
		txtPassowordConfirmed.setBounds(137, 103, 161, 20);
		panel_1.add(txtPassowordConfirmed);
		
		final JLabel lblinfo = new JLabel(""); 
		lblinfo.setBounds(124, 134, 174, 14); 
		panel_1.add(lblinfo); 
		JButton btnCadastrar = new JButton("Cadastrar"); 
		btnCadastrar.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				String email = txtEmail.getText(); 
				String password = String.valueOf(txtPassword.getPassword()); 
				String passwordConfirme = String.valueOf(txtPassowordConfirmed.getPassword()); 
				
				System.out.println("email: "+email + " passoword:" + password + " ConfirmPassword:" + passwordConfirme); 
				
				if(email.length() > 0 && password != null && passwordConfirme.equals(password)) { 
					lblinfo.setText("Registro confirmado!"); 
					lblinfo.setForeground(Color.BLACK);
				}else {
					lblinfo.setText("Preencha todos os campos!"); 
					lblinfo.setForeground(Color.RED);
				}
				
				
			}
		});
		btnCadastrar.setBorder(new LineBorder(Color.WHITE, 2, true)); 
		btnCadastrar.setForeground(Color.WHITE); 
		btnCadastrar.setBackground(Color.DARK_GRAY); 
		btnCadastrar.setBounds(45, 160, 117, 37); 
		panel_1.add(btnCadastrar); 

		JButton btnSair = new JButton("Voltar");
		btnSair.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				new FrmLogin(); 
				FrmLogin.main(null); 
				frmCadastroUser.dispose(); 
			}
		});
		btnSair.setForeground(Color.WHITE); 
		btnSair.setBorder(new LineBorder(Color.WHITE, 2, true)); 
		btnSair.setBackground(Color.DARK_GRAY); 
		btnSair.setBounds(219, 160, 117, 37); 
		panel_1.add(btnSair); 
		
		
	}
}
package forms;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmLogin extends JFrame {

	private JFrame frmVolvologin;
	private Icon icon = new ImageIcon(getClass().getResource("Logo.png"));
	private JTextField textFieldUsuario;
	private JPasswordField textFieldSenha;
	private JLabel lblerro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin window = new FrmLogin();
					window.frmVolvologin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVolvologin = new JFrame();
		frmVolvologin.setIconImage(Toolkit.getDefaultToolkit().getImage(FrmLogin.class.getResource("/forms/Logo.png")));
		frmVolvologin.getContentPane().setBackground(Color.WHITE);
		frmVolvologin.setTitle("Volvo_Login");
		frmVolvologin.setResizable(false);
		frmVolvologin.setBounds(100, 100, 367, 381);
		frmVolvologin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		frmVolvologin.getContentPane().add(panel1, BorderLayout.NORTH);
		panel1.setLayout(new BorderLayout(0, 0));

		JPanel panel1_2 = new JPanel();
		panel1_2.setBackground(Color.WHITE);
		panel1.add(panel1_2, BorderLayout.WEST);

		JLabel logoVolvo = new JLabel("");

		logoVolvo.setIcon(new ImageIcon(FrmLogin.class.getResource("/forms/Logo.png")));
		panel1_2.add(logoVolvo);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel1.add(horizontalStrut, BorderLayout.SOUTH);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 10));
		panel1.add(rigidArea, BorderLayout.CENTER);

		JButton newUser = new JButton("Novo Usuario");
		newUser.setPreferredSize(new Dimension(140, 23));
		newUser.setBorder(null);
		newUser.setAlignmentX(Component.CENTER_ALIGNMENT);
		newUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmCadastroUser.open();
				frmVolvologin.setVisible(false);
			}
		});
		newUser.setForeground(Color.BLACK);
		newUser.setBackground(Color.WHITE);
		panel1.add(newUser, BorderLayout.EAST);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		frmVolvologin.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);

		JLabel usuario = new JLabel("Usuario");
		usuario.setHorizontalAlignment(SwingConstants.RIGHT);
		usuario.setBounds(44, 31, 48, 14);
		panel_2.add(usuario);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(102, 28, 188, 20);
		panel_2.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		textFieldSenha = new JPasswordField();
		textFieldSenha.setBounds(102, 71, 188, 20);
		panel_2.add(textFieldSenha);
		textFieldSenha.setColumns(10);

		JLabel senhaBanana = new JLabel("Senha");
		senhaBanana.setHorizontalAlignment(SwingConstants.RIGHT);
		senhaBanana.setBounds(53, 74, 39, 14);
		panel_2.add(senhaBanana);

		lblerro = new JLabel("");
		lblerro.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblerro.setForeground(Color.RED);
		lblerro.setBounds(90, 110, 188, 29);
		panel_2.add(lblerro);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		frmVolvologin.getContentPane().add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_3.add(panel_4, BorderLayout.NORTH);

		JButton buttonEntrar = new JButton("Entrar");
		buttonEntrar.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		buttonEntrar.setForeground(Color.WHITE);
		buttonEntrar.setBackground(Color.DARK_GRAY);
		buttonEntrar.setPreferredSize(new Dimension(140, 30));
		buttonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textFieldUsuario.getText();
				String senha = String.valueOf(textFieldSenha.getPassword());

				if (user.equals("volvo") && senha.equals("123")) {
					FrmSobreNos.Open();
					lblerro.setText("");
					frmVolvologin.dispose();
				} else {
					lblerro.setText("Usuario ou senha incorreto");

				}
			}
		});
		panel_4.add(buttonEntrar);

		JButton buttonSenha = new JButton("Cancelar");
		buttonSenha.setForeground(Color.WHITE);
		buttonSenha.setBackground(Color.DARK_GRAY);
		buttonSenha.setBorder(new LineBorder(Color.WHITE, 2, true));
		buttonSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		buttonSenha.setPreferredSize(new Dimension(140, 30));
		panel_4.add(buttonSenha);

		Component verticalStrut = Box.createVerticalStrut(15);
		panel_3.add(verticalStrut, BorderLayout.CENTER);

		JButton forgetPW = new JButton("Esqueci a senha");
		forgetPW.setPreferredSize(new Dimension(109, 40));
		forgetPW.setBorder(null);
		forgetPW.setBackground(Color.WHITE);
		forgetPW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmRecuperarSenha();
				FrmRecuperarSenha.open();
				frmVolvologin.dispose();
			}
		});
		panel_3.add(forgetPW, BorderLayout.SOUTH);
	}
}
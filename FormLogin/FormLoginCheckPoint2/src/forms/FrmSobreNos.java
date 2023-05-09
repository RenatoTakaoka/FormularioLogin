package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FrmSobreNos {

	private JFrame frmSobre;

	/**
	 * Launch the application.
	 */
	public static void Open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSobreNos window = new FrmSobreNos();
					window.frmSobre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmSobreNos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSobre = new JFrame();
		frmSobre.setIconImage(Toolkit.getDefaultToolkit().getImage(FrmSobreNos.class.getResource("/forms/Logo.png")));
		frmSobre.setResizable(false);
		frmSobre.setTitle("Sobre");
		frmSobre.setBounds(100, 100, 600, 400);
		frmSobre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmSobre.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblQuemSomos = new JLabel("QUEM SOMOS");
		lblQuemSomos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblQuemSomos);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		frmSobre.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JTextArea txtrOGrupoVolvo = new JTextArea();
		txtrOGrupoVolvo.setWrapStyleWord(true);
		txtrOGrupoVolvo.setLineWrap(true);
		txtrOGrupoVolvo.setBounds(10, 0, 574, 114);
		panel_2.add(txtrOGrupoVolvo);
		txtrOGrupoVolvo.setPreferredSize(new Dimension(550, 100));
		txtrOGrupoVolvo.setEditable(false);
		txtrOGrupoVolvo.setText("O Grupo Volvo é um dos maiores fabricantes mundiais de caminhões, ônibus, equipamentos de construção, motores marítimos e industriais. Com sede em Gotemburgo, Suécia, emprega quase 100 mil pessoas, tem fábricas em 18 países e atua em 190 mercados.");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 122, 574, 194);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNossaMissao = new JLabel("Nossa miss\u00E3o, vis\u00E3o e aspira\u00E7\u00F5es");
		lblNossaMissao.setBounds(0, 0, 584, 22);
		lblNossaMissao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNossaMissao.setBackground(Color.WHITE);
		lblNossaMissao.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNossaMissao);
		
		JTextArea txtrNossasSoluesPara = new JTextArea();
		txtrNossasSoluesPara.setWrapStyleWord(true);
		txtrNossasSoluesPara.setLineWrap(true);
		txtrNossasSoluesPara.setBounds(0, 22, 574, 109);
		txtrNossasSoluesPara.setEditable(false);
		txtrNossasSoluesPara.setPreferredSize(new Dimension(550, 230));
		txtrNossasSoluesPara.setText("Nossas soluções para os desafios globais são impulsionadas pela nossa missão de gerar prosperidade por meio de soluções de transporte e pela  nossa visão de sermos o fornecedor de soluções de transporte mais desejado e bem-sucedido do mundo.\r\n");
		panel_1.add(txtrNossasSoluesPara);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnSair.setBackground(Color.DARK_GRAY);
		btnSair.setBounds(496, 146, 68, 37);
		panel_1.add(btnSair);
	}

}

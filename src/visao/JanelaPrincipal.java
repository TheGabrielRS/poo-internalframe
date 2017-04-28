package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javafx.scene.paint.Color;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.SystemColor;
import java.io.IOException;

import javax.swing.JPasswordField;

import jdk.nashorn.internal.scripts.JD;

public class JanelaPrincipal extends JFrame {

	private JDesktopPane contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnAutenticar;
	private JMenuItem mntmCriarCadastro;
        private JButton btnLimpar;

	
	public JanelaPrincipal() {
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 428);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmCriarCadastro = new JMenuItem("Criar Cadastro");
		mntmCriarCadastro.setEnabled(false);
		mnMenu.add(mntmCriarCadastro);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmSair);
		contentPane = new JDesktopPane();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(47, 73, 174, 163);
		try {
			lblNewLabel.setIcon(new ImageIcon(ImageIO.read(JanelaPrincipal.class.getResource("/figuras/login.png")).getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		contentPane.add(lblNewLabel);
		
		JLabel lblTelaDeLogin = new JLabel("TELA DE LOGIN");
		lblTelaDeLogin.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblTelaDeLogin.setBounds(264, 48, 229, 56);
		contentPane.add(lblTelaDeLogin);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsurio.setBounds(264, 151, 56, 16);
		contentPane.add(lblUsurio);
		
		textField = new JTextField();
		textField.setBounds(332, 149, 161, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(264, 189, 56, 16);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(332, 186, 161, 22);
		contentPane.add(passwordField);
		
		btnAutenticar = new JButton("Autenticar");
		btnAutenticar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAutenticar.setBounds(264, 232, 108, 25);
		contentPane.add(btnAutenticar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpar.setBounds(384, 232, 109, 25);
		contentPane.add(btnLimpar);
	}

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

	public JButton getBtnAutenticar() {
		return btnAutenticar;
	}

	public void setBtnAutenticar(JButton btnAutenticar) {
		this.btnAutenticar = btnAutenticar;
	}

	public JMenuItem getMntmCriarCadastro() {
		return mntmCriarCadastro;
	}

	public void setMntmCriarCadastro(JMenuItem mntmCriarCadastro) {
		this.mntmCriarCadastro = mntmCriarCadastro;
	}

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }
	
        
	
	
	
}

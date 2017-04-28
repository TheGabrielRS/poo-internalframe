package visao;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class JanelaInterna extends JInternalFrame {
	private JTextField fieldNome;
	private JTextField fieldCPF;
	private JTextField fieldDataNasc;
	private JTextField fieldEndereco;
        private JButton    buttonLimpar;
        private JButton    buttonGravar;

	public JanelaInterna() {
		setTitle("Janela Interna");
		setBounds(0, 0, 450, 345);
		setClosable(true);
		getContentPane().setLayout(null);
		
		JLabel labelFigura = new JLabel("");
		labelFigura.setBounds(22, 13, 73, 78);
		ImageIcon img;
		try {
			img = new ImageIcon(ImageIO.read(JanelaPrincipal.class.getResource("/figuras/homer.jpg"))
					.getScaledInstance(labelFigura.getWidth(), labelFigura.getHeight(), BufferedImage.SCALE_SMOOTH));
			labelFigura.setIcon(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		getContentPane().add(labelFigura);
		
		JLabel labelTitulo = new JLabel("Cadastro");
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelTitulo.setBounds(182, 34, 87, 31);
		getContentPane().add(labelTitulo);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelNome.setBounds(22, 129, 64, 16);
		getContentPane().add(labelNome);
		
		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelCPF.setBounds(22, 166, 56, 16);
		getContentPane().add(labelCPF);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(71, 129, 198, 18);
		getContentPane().add(fieldNome);
		fieldNome.setColumns(10);
		
		fieldCPF = new JTextField();
		fieldCPF.setBounds(71, 166, 115, 18);
		getContentPane().add(fieldCPF);
		fieldCPF.setColumns(10);
		
		JLabel labelDataNascimento = new JLabel("Data Nascimento");
		labelDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelDataNascimento.setBounds(198, 168, 119, 16);
		getContentPane().add(labelDataNascimento);
		
		fieldDataNasc = new JTextField();
		fieldDataNasc.setBounds(327, 168, 95, 18);
		getContentPane().add(fieldDataNasc);
		fieldDataNasc.setColumns(10);
		
		JLabel labelSexo = new JLabel("Sexo");
		labelSexo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelSexo.setBounds(281, 131, 43, 16);
		getContentPane().add(labelSexo);
			
		
		JRadioButton radioMasc = new JRadioButton("M");
		radioMasc.setBounds(325, 128, 43, 25);
		getContentPane().add(radioMasc);
		
		JRadioButton radioFem = new JRadioButton("F");
		radioFem.setBounds(372, 128, 64, 25);
		getContentPane().add(radioFem);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		labelEndereco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelEndereco.setBounds(22, 207, 81, 16);
		getContentPane().add(labelEndereco);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setBounds(93, 205, 146, 18);
		getContentPane().add(fieldEndereco);
		fieldEndereco.setColumns(10);
		
		JLabel labelProfissao = new JLabel("Profiss\u00E3o");
		labelProfissao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelProfissao.setBounds(251, 208, 87, 16);
		getContentPane().add(labelProfissao);
		
		JComboBox comoProfissao = new JComboBox();
		comoProfissao.addItem("Médico");
		comoProfissao.addItem("Professor");
		comoProfissao.setBounds(327, 205, 95, 18);
		getContentPane().add(comoProfissao);
		
		buttonGravar = new JButton("Gravar");
		buttonGravar.setIcon(new ImageIcon(JanelaInterna.class.getResource("/figuras/ok1.png")));
		buttonGravar.setBounds(22, 258, 97, 25);
		getContentPane().add(buttonGravar);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setIcon(new ImageIcon(JanelaInterna.class.getResource("/figuras/clean.png")));
		buttonLimpar.setBounds(131, 258, 97, 25);
		getContentPane().add(buttonLimpar);

	}
        
        public JTextField getFieldNome() {
        return fieldNome;
    }

    public void setFieldNome(JTextField fieldNome) {
        this.fieldNome = fieldNome;
    }

    public JTextField getFieldCPF() {
        return fieldCPF;
    }

    public void setFieldCPF(JTextField fieldCPF) {
        this.fieldCPF = fieldCPF;
    }

    public JTextField getFieldDataNasc() {
        return fieldDataNasc;
    }

    public void setFieldDataNasc(JTextField fieldDataNasc) {
        this.fieldDataNasc = fieldDataNasc;
    }

    public JTextField getFieldEndereco() {
        return fieldEndereco;
    }

    public void setFieldEndereco(JTextField fieldEndereco) {
        this.fieldEndereco = fieldEndereco;
    }

    public JButton getButtonLimpar() {
        return buttonLimpar;
    }

    public void setButtonLimpar(JButton buttonLimpar) {
        this.buttonLimpar = buttonLimpar;
    }

    public JButton getButtonGravar() {
        return buttonGravar;
    }

    public void setButtonGravar(JButton buttonGravar) {
        this.buttonGravar = buttonGravar;
    }
}

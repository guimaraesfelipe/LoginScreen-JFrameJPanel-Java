package br.com.javalogin.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "admin";
	
	public static void main(String[] args) {
		
		// Instanciar a janela<JFrame> e definir o nome e a ação de encerramento.
		JFrame janela = new JFrame("Tela de Login");
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
		
		// Instanciar layout da janela<JPanel> e atribuir o tipo de layout da bibliotéca.
		JPanel layout = new JPanel();
		layout.setLayout(new BoxLayout(layout, BoxLayout.PAGE_AXIS));
		
		// Instanciar os itens da janela.
		
		// Campo Usuário
		JLabel labelUser = new JLabel("Usuário: ");
		JTextField textfUser = new JTextField(30);
		textfUser.setToolTipText("Digite seu usuário...");
		
		// Campo Senha
		JLabel labelPass = new JLabel("Senha: ");
		JPasswordField textfPass = new JPasswordField(30);
		textfPass.setToolTipText("Digite sua senha...");
		
		// Botões de ação.
		
		// Botão Cancelar
		JButton buttonCancel = new JButton("Cancelar");
		
		buttonCancel.addActionListener(new ActionListener() {

			@Override // Fechar janela
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		// Botão Login
		JButton buttonLogin = new JButton("Login");
		
		buttonLogin.addActionListener(new ActionListener() {

			@Override // Apresentar pop-up informando se o acesso foi autorizado ou não.
			public void actionPerformed(ActionEvent e) {
				if(textfUser.getText().equals(USERNAME) && new String(textfPass.getPassword()).equals(PASSWORD)) {
					JOptionPane.showMessageDialog(janela, "Acesso autorizado");
				}else {
					JOptionPane.showMessageDialog(janela, "Acesso negado");
				}
			}
			
		});
		
		// Montar layout com o itens instanciados e atribui-lo a janela.
		layout.add(labelUser);
		layout.add(textfUser);
		layout.add(labelPass);
		layout.add(textfPass);
		layout.add(buttonLogin);
		layout.add(buttonCancel);
		
		janela.setContentPane(layout);
		janela.pack();
		
	}
}

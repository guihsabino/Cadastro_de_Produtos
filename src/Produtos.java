import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Produtos implements ActionListener {

	private JFrame janela;
	private JTextField txtNomeProduto;
	private JButton btnPesquisar;

	public Produtos() {

		// Criando os elementos gráficos

		janela = new JFrame("Produtos");

		// labels
		JPanel painel = new JPanel();
		JLabel lblNomeProd = new JLabel("Digite o nome do Produto ");

		// textos
		txtNomeProduto = new JTextField(99);

		// botoes
		btnPesquisar = new JButton("Pesquisar");

		painel.add(lblNomeProd);
		painel.add(txtNomeProduto);
		painel.add(btnPesquisar);
		janela.setContentPane(painel);

		// Editando layout dos objetos
		lblNomeProd.setBounds(4, 4, 150, 100);
		txtNomeProduto.setBounds(165, 44, 320, 20);
		btnPesquisar.setBounds(530, 42, 100, 25);

		// Conectando os botoes
		btnPesquisar.addActionListener(this);

		// Conectando o Layout Manager aos objetos
		painel.setLayout(null);

		// Tornando a janela vísivel
		janela.setSize(700, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		if ("Pesquisar".equals(e.getActionCommand())) {

			ListaProdutos l = new ListaProdutos();

			System.out.println(l);

		}
	}

	public static void main(String[] args) {
		new Produtos();

	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroProduto implements ActionListener {

	private JFrame janela;
	private JTextField txtNome;
	private JTextField txtCodigo;
	private JTextField txtValor;
	private JComboBox<Produtos> boxGrupo;
	private JButton btnAdicionar;
	private JButton btnAlterar;
	private JButton btnExcluir;

	public CadastroProduto() {

		// Criando os elementos gráficos
		janela = new JFrame("Cadastro de Produtos");

		// labels
		JPanel painel = new JPanel();
		JLabel lblNome = new JLabel("Nome ");
		JLabel lblCodigo = new JLabel("Codigo ");
		JLabel lblValor = new JLabel("Valor     R$ ");
		JLabel lblGrupo = new JLabel("Grupo ");

		// textos
		txtNome = new JTextField(40);
		txtCodigo = new JTextField(30);
		txtValor = new JTextField(30);
		boxGrupo = new JComboBox<Produtos>();

		// botoes
		btnAdicionar = new JButton("Adicionar");
		btnAlterar = new JButton("Alterar");
		btnExcluir = new JButton("Excluir");

		// Conectando os elementos
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblCodigo);
		painel.add(txtCodigo);
		painel.add(lblValor);
		painel.add(txtValor);
		painel.add(lblGrupo);
		painel.add(boxGrupo);
		painel.add(btnAdicionar);
		painel.add(btnAlterar);
		painel.add(btnExcluir);
		janela.setContentPane(painel);

		// Conectando Botoes

		btnAdicionar.addActionListener(this);
		btnAlterar.addActionListener(this);
		btnExcluir.addActionListener(this);

		// Editando Layout dos objetos
		lblNome.setBounds(4, 4, 150, 100);
		txtNome.setBounds(70, 44, 320, 20);
		lblCodigo.setBounds(4, 42, 150, 100);
		txtCodigo.setBounds(70, 80, 100, 20);
		lblValor.setBounds(4, 75, 180, 100);
		txtValor.setBounds(70, 115, 150, 20);
		lblGrupo.setBounds(4, 109, 150, 100);
		boxGrupo.setBounds(70, 150, 150, 20);
		btnAdicionar.setBounds(15, 250, 100, 40);
		btnAlterar.setBounds(150, 250, 100, 40);
		btnExcluir.setBounds(280, 250, 100, 40);

		// Conectando o Layout Manager aos objetos
		painel.setLayout(null);

		// Tornando a janela vísivel
		janela.setSize(450, 380);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// Dando reações aos botoões de acordo com as suas funções
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("Adicionar".equals(e.getActionCommand())) {
			JOptionPane.showMessageDialog(null, "Produto Adicionado");
		}

		if ("Alterar".equals(e.getActionCommand())) {
			JOptionPane.showMessageDialog(null, "Alterações Realizadas");

		}

		if ("Excluir".equals(e.getActionCommand())) {
			JOptionPane.showMessageDialog(null, "Produto excuido");
		}

	}

	public static void main(String[] args) {
		new CadastroProduto();

	}

}

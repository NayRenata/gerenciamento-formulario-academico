package sistemagerenciamento.service;

import java.sql.Connection;

import javax.swing.JOptionPane;

import configuration.ConnectionFactory;
import sistemagerenciamento.dao.FormularioDao;
import sistemagerenciamento.model.Formulario;

public class FormularioService {
	ConnectionFactory connection = new ConnectionFactory();
	FormularioDao formularioDao = new FormularioDao(connection.recuperarConexao());  

	public void CadastrarFormulario() {
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        String materia = JOptionPane.showInputDialog("Digite o nome da matéria:");
        String professor = JOptionPane.showInputDialog("Digite o nome do professor:");
        String unidade = JOptionPane.showInputDialog("Digite o nome da unidade:");
        
        Formulario newFormulario = new Formulario(nome,materia,professor,unidade);
        formularioDao.cadastraFormulario(newFormulario);
        
        	}
	
}

package sistemagerenciamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sistemagerenciamento.model.Formulario;

public class FormularioDao {
	private Connection connection;

	public FormularioDao(Connection conn) {
		this.connection = conn;
	}

	public void cadastraFormulario(Formulario newFormulario){
		PreparedStatement ps; 
		String query = "INSERT INTO tb_formulario (nome, materia, professor, unidade) VALUE(?,?,?,?)";
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, newFormulario.getNome());
			ps.setString(2, newFormulario.getMateria());
			ps.setString(3, newFormulario.getProfessor());
			ps.setString(4, newFormulario.getUnidade());
			ps.execute();
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

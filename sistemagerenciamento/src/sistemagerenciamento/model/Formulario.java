package sistemagerenciamento.model;

public class Formulario {

	
	private String nome;
	private String materia;
	private String professor;
	private String unidade;
	private Integer id;
	
	public Formulario(String nome, String materia, String professor, String unidade) {
		this.nome = nome;
		this.materia = materia;
		this.professor = professor;
		this.unidade = unidade;
		
	}
	
	//Construtor default, ai quando eu crio um construtor com as minhas variaveis, ele acaba eliminando o construtor default mas a jb ped os dois
	public Formulario() {} 
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
}

package sistemagerenciamento;

import javax.swing.JOptionPane;

import sistemagerenciamento.model.Formulario;
import sistemagerenciamento.service.FormularioService;

public class Principal {


    public static void main(String[] args) {
        
       
        /*
        String mensagem = "Informações inseridas:\n";
        mensagem += "Nome: " + nome + "\n";
        mensagem += "Matéria: " + materia + "\n";
        mensagem += "Professor: " + professor + "\n";
        mensagem += "Unidade: " + unidade;
        
        JOptionPane.showMessageDialog(null, mensagem);
      */
       FormularioService formularioService = new FormularioService();
       
       formularioService.CadastrarFormulario();
        
    }
    
    
}
 
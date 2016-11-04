package estoque.persistence;

import java.sql.SQLException;
import java.util.List;

import estoque.model.Funcionario;
import estoque.model.Produto;

public interface IFuncionarioDAO {

	public void adicionarFuncionario( Funcionario func ) throws SQLException;
	public void excluirFuncionario( int codigo ) throws SQLException;
	public void consultarFuncionario( String nome ) throws SQLException;
	public void alterarFuncionario( Funcionario func ) throws SQLException;
	public List<Funcionario> retornaFuncionarios ( ) throws SQLException;
	public String verificaLogin( Funcionario func ) throws SQLException;
	
}

package formulan.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public interface DAOBasico {
    
    public void inserir(Object objeto);
    public void editar(Object objeto);        
    public void excluir(int id); 
    public Object getObjetoById(int id);
    public List<Object> listaBusca(String textoBusca);    
    public void executarUpdate(Object objeto);
    
}

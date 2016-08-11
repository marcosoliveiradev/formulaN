package formulan.view;

import javax.swing.JFrame;
import javax.swing.JTable;

public interface CadBasico{

    void limpar();
    void modoEdicao();
    void modoNavega();    
    void listarTabela(String textoBusca);
    void mostrarDados(JTable tabela, int itemTabela);
    void setarTabelaItemAtual();    
    
}

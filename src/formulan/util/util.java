package formulan.util;

import formulan.control.EquipeDAO;
import formulan.control.PaisDAO;
import formulan.control.PilotoDAO;
import formulan.model.Equipe;
import formulan.model.Pais;
import formulan.model.Piloto;
import java.awt.Component;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class util {    

    public static void mostrarFrame(JFrame telaFrame) {
        telaFrame.getContentPane();
        telaFrame.setVisible(true);
    }        

    public static Image imgByteToImage(byte[] imagemEmBytes) {
        if (imagemEmBytes!=null) {
            InputStream is = new ByteArrayInputStream(imagemEmBytes);
            Image imagem = new ImageIcon(imagemEmBytes).getImage();

            return imagem;            
        }
        return null;
    }        

    public static byte[] fileToBytes(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        long length = file.length();
        byte[] bytes = new byte[(int) length];
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }
        if (offset < bytes.length) {
            throw new IOException("Não foi possível ler o arquivo: " + file.getName());
        }
        is.close();
        return bytes;
    }

    public static String txtByteToString (byte[] textoEmByte) {
        try {
            if (textoEmByte != null) {
                String msgDecode = new String(textoEmByte, "UTF-8");
                return msgDecode;
            } else return "";                
        } catch (UnsupportedEncodingException ex) {
            //Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }

        return "";
    }
    
    public static Image redimensiona(Image imagem, int largura, int altura) {
        if (imagem!=null) {
            ImageIcon imagemPraTratar = new ImageIcon(imagem);
            Image imagemRedimensionada = imagemPraTratar.getImage().getScaledInstance(largura, altura, Image.SCALE_DEFAULT);

            return imagemRedimensionada;            
        }
        return null;                        
    }
    
    public static void preencherComboPais(JComboBox cbPaises) {
//        cbPaises.removeAll(); //pra sempre zerar os itens
        PaisDAO paisDao = new PaisDAO();
        List<Pais> listaPaises = (List)paisDao.listaBusca("");
        
        if (listaPaises != null) {  //pra evitar tabela vazia
            for (Pais pais : listaPaises) {
                cbPaises.addItem(pais);
            }
        }
    }
    
    public static void preencherComboEquipe(JComboBox<Equipe> cbEquipes) {
        cbEquipes.removeAllItems(); 
        EquipeDAO equipeDao = new EquipeDAO();
        List<Equipe> listaEquipes = (List)equipeDao.listaBusca("");
        
        if (listaEquipes != null) {  //pra evitar tabela vazia
            for (Equipe equipe : listaEquipes) {
                cbEquipes.addItem(equipe);
            }
        }

    }    
    
    public static int setarComboPais(JComboBox<Pais> cbPaises, int id) {
        Pais item = null;
        cbPaises.setSelectedIndex(-1);
        
        for (int i = 0; i < cbPaises.getItemCount(); i++) {
            item = cbPaises.getItemAt(i);
            if (item.getPaisId().equals(id)) {
                cbPaises.setSelectedIndex(i);
                return i;
            }
        }
        return -1;
    }

    public static int setarComboEquipe(JComboBox<Equipe> cbEquipes, Integer id) {
        Equipe item = null;
        cbEquipes.setSelectedIndex(-1);
        
        for (int i = 0; i < cbEquipes.getItemCount(); i++) {
            item = cbEquipes.getItemAt(i);
            if (item.getEquipeId().equals(id)) {
                cbEquipes.setSelectedIndex(i);
                return i;
            }
        }
        return -1;
    }
    
    public static int getIdComboPais(JComboBox<Pais> cbPais) {
        if (cbPais.getSelectedIndex()!=-1)
            return cbPais.getItemAt(cbPais.getSelectedIndex()).getPaisId();
        else
            return -1;
    }    
    
    public static int getIdComboEquipe(JComboBox<Equipe> cbEquipes) {
        if (cbEquipes.getSelectedIndex()!=-1)
            return cbEquipes.getItemAt(cbEquipes.getSelectedIndex()).getEquipeId();
        else
            return -1;
    }    
    
    public static void preencherComboPiloto(JComboBox cbPilotos) {
        PilotoDAO pilotoDao = new PilotoDAO();
        List<Piloto> listaPilotos = (List)pilotoDao.listaBusca("");
        
        for (Piloto piloto : listaPilotos) {
            cbPilotos.addItem(piloto);
        }
    }
    
    public static int setarComboPiloto(JComboBox<Piloto> cbPilotos, int id) {
        Piloto item = null;
        
        for (int i = 0; i < cbPilotos.getItemCount(); i++) {
            item = cbPilotos.getItemAt(i);
            if (item.getPilotoId().equals(id)) {
                cbPilotos.setSelectedIndex(i);
                return i;
            }
        }
        return -1;
    }    
    
    public static void lblImagemModoEdicao(JLabel labelImagem) {
        if (labelImagem.getIcon()==null) {
            labelImagem.setText("[Clique para adicionar]");
            labelImagem.setBorder(BorderFactory.createEtchedBorder());
        }        
    }    
    
    public static void lblImagemModoNavega(JLabel labelImagem) {        
        if (labelImagem.getIcon() != null) {
            labelImagem.setBorder(BorderFactory.createEmptyBorder());
            labelImagem.setText("");
        }
        else {
            labelImagem.setBorder(BorderFactory.createEtchedBorder());
            labelImagem.setText("Imagem não cadastrada");
        }
        
    }        

    public static byte[] escolherImagem(Component contexto, JLabel lblImagem) {
        byte[] varByte=null;
            try {
                JFileChooser file = new JFileChooser();                               
                file.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int resposta = file.showOpenDialog(contexto);
               
                if (resposta == JFileChooser.APPROVE_OPTION) {
                    File arquivoQueVeio = file.getSelectedFile();

                    Image imagemQueveio = ImageIO.read(arquivoQueVeio);
                    varByte = util.fileToBytes(arquivoQueVeio);

                    ImageIcon imgIcone = new ImageIcon(util.redimensiona(imagemQueveio, lblImagem.getWidth(), lblImagem.getHeight()));

                    lblImagem.setText("");
                    lblImagem.setIcon(imgIcone);
                } 
            } catch (IOException ex) {
                System.out.println(ex);
            }
        return varByte;            
    }
    
    public static String formatarData(Date dataOrigem) {
        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dataOrigem);        
        
        return dataFormatada;
    }
    
    public static Date strToDate (String dataString) {
        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); 
        try {        
            Date dataTransformada=sdf1.parse(dataString);
            return dataTransformada;
        } catch (ParseException ex) {
            System.out.println(ex);;
        }        
        return null;
    }
}

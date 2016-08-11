package formulan.util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Fundo extends JPanel{
    BufferedImage b;
    Rectangle2D rect;

    public Fundo() {
        try {
            //se você pegar uma imagem dentro do mesmo jar/projeto  
            b = ImageIO.read(getClass().getResourceAsStream(vars.imgFundoApp));                   
                
            //cria uma imagem do tamanho 1x1, que vai se repetir ao longo do fundo, o tamanho é você quem escolhe.  
            rect = new Rectangle(0, 0, 1, 1);

        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        //Se você quiser que a imagem seja uma só (extendida ao tamanho da tela, não replicada:
        rect = new Rectangle(0,0,this.getWidth(),this.getHeight());  
        
        TexturePaint p = new TexturePaint(b, rect);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(p);
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}
package utilidades;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class MyDesktopPane extends JDesktopPane {

    private Image img;

    public MyDesktopPane() {
        try {
            URL caminhoImagem = getClass().getResource("/swing/img/banner-locadora6.jpg");
            img = new ImageIcon(caminhoImagem).getImage(); //ou: ImageIO.read(caminhoImagem);
        } catch (Exception e) {
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        } else {
            g.drawString("Imagem não encontrada!", 50, 50);
        }
    }
}


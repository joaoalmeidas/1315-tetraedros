import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Tetraedro extends JPanel {
	
	SecureRandom aleatorio = new SecureRandom();	
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath tetra = new GeneralPath();
		GeneralPath linha = new GeneralPath();
		
		Point pontoCima = new Point(getWidth()/2 + 50, 10);
		Point pontoBaixo = new Point(getWidth()/2 - 50, getHeight() - 10);
		Point pontoDireita = new Point(getWidth() - 10, getHeight()/2 + 20);
		Point pontoEsquerda = new Point(10, getHeight()/2 - 20);
		
		tetra.moveTo(pontoCima.getX(), pontoCima.getY());
		tetra.lineTo(pontoBaixo.getX(), pontoBaixo.getY());
		
		tetra.moveTo(pontoCima.getX(), pontoCima.getY());
		tetra.lineTo(pontoEsquerda.getX(), pontoEsquerda.getY());
		tetra.lineTo(pontoBaixo.getX(), pontoBaixo.getY());
		
		tetra.moveTo(pontoCima.getX(), pontoCima.getY());
		tetra.lineTo(pontoDireita.getX(), pontoDireita.getY());
		tetra.lineTo(pontoBaixo.getX(), pontoBaixo.getY());
		


		g2d.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
		g2d.fill(tetra);
		g2d.setColor(Color.BLACK);
		g2d.draw(tetra);
		
		float[] tracos = {10};
		linha.moveTo(pontoDireita.getX(), pontoDireita.getY());
		linha.lineTo(pontoEsquerda.getX(), pontoEsquerda.getY());
		g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, tracos, 0));
		
		g2d.draw(linha);
		
		
	}
	
}

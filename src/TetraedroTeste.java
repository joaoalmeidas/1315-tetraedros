import javax.swing.JFrame;

public class TetraedroTeste {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Tetraedro tetra = new Tetraedro();
		frame.add(tetra);
		frame.setVisible(true);
		frame.setSize(500, 500);
		
	}

}

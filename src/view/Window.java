package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Window {
	JFrame frame = new JFrame();
	Dimension dimensoes = Toolkit.getDefaultToolkit().getScreenSize();
	
	/**
	 * Contrutor
	 */
	public Window(){
		frame.setVisible(true);
		frame.setSize( largura(), altura()	);
		frame.setLocation( margemLeft(), margemTop() );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println(dimensoes.getWidth());
	}
	

	/**
	 * Define margem da esqueda da tela
	 * @return
	 */
	private int margemLeft()
	{	return (int) (dimensoes.getWidth()-largura())/2;
	}
	
	/**
	 * Define margem do topo da tela
	 * @return
	 */
	private int margemTop()
	{	return (int) (dimensoes.getHeight()-altura())/2;
	}
	
	/**
	 * Define a largura da janela
	 * @return
	 */
	public int largura(){
		if(dimensoes.getWidth()<=800){
			return (int)dimensoes.getWidth();
		}
		return (int)(dimensoes.getWidth()/100)*80;
	}
	
	/**
	 * Define a altura da janela
	 * @return
	 */
	public int altura(){
		if(dimensoes.getWidth()<=800){
			return (int)dimensoes.getHeight();
		}
		return (int)(dimensoes.getHeight()/100)*80;
	}
}

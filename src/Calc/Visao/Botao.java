package Calc.Visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	public Botao(String texto, Color cor) {

		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setBorder(BorderFactory.createLineBorder(Color.black));
		setForeground(Color.white);
		setFont(new Font("courier", Font.PLAIN, 20));
	}

}

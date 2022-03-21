package br.com.fiap;

import javax.swing.JOptionPane;

public class AreaCirculo {

	public static void main(String[] args) {
		final double PI = 3.14;
		double raio = 0, area = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do raio: ");
			raio = Double.parseDouble(aux);
			area = PI * raio * raio;
			JOptionPane.showMessageDialog(null, "A área do circulo é: " + area);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato numérico inválido");
		}
	
}
	
}

import javax.swing.JOptionPane;

public class Piramide {

	public static void main(String args[]) {

		int i, k, j, tamanho = 0;

		try {
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de linhas"));
		} catch (NumberFormatException e) {
			System.out.println("tamanho invalido " + e);
		}
		for (i = 1; i <= tamanho; i++) {

			for (j = i; j < tamanho; j++) // para printar espaço correspondente
				System.out.print(" ");

			for (k = 1; k <= i; k++)
				System.out.print(" *");

			System.out.print("\n");
		}

	}

}

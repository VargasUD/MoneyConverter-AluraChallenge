package principal;

import javax.swing.JOptionPane;

import conversorLongitud.functionLongitud;
import conversorMonedas.function;

public class Principal {
	public static void main(String[] args) {

		function monedas = new function();
		functionLongitud temperatura = new functionLongitud();

		while (true) {

			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Conversor de Moneda", "Conversor de Longitud" },
					"Seleccion")).toString();

			switch (opciones) {
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;

			case "Conversor de Longitud":
				input = JOptionPane.showInputDialog("Ingresa el valor de la longitud que deseas convertir ");
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					temperatura.ConvertirLongitud(Minput);

					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if ((respuesta == 0) && (ValidarNumero(input) == true)) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}
		}

	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

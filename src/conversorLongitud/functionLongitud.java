package conversorLongitud;

import javax.swing.*;

public class functionLongitud {
	
	ConvertirLongitud temperatura = new ConvertirLongitud();
	
	public void ConvertirLongitud(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Longitud", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Metros a Kilometros", "Metros a Millas", "Kilometros a Metros","Kilometros a Millas","Millas a Metros"}, "Seleccion")).toString();
        switch(opcion) {
        case "Metros a Kilometros":
        	temperatura.ConvertirMetrosAKilometros(Minput);
        	break;
        case "Metros a Millas":
            temperatura.ConvertirMetrosAMillas(Minput);
            break;
        case "Kilometros a Metros":
           temperatura.ConvertirKilometrosAMetros(Minput);
           break;
        case "Kilometros a Millas":
           temperatura.ConvertirKilometrosAMillas(Minput);
           break;
        case "Millas a Metros":
        	temperatura.ConvertirMillasAMetros(Minput);
        	break;
        }
	}
}
    	
     



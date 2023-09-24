package conversorLongitud;

import javax.swing.JOptionPane;

public class ConvertirLongitud {
	
	public double ConvertirMetrosAKilometros(double valor) {
		double kilometro = valor / 1000;
    	kilometro = (double) Math.round(kilometro *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Metros son " +kilometro+ " Kilometros ");
		return kilometro;
	}
	
	public void ConvertirMetrosAMillas(double valor){
		double milla = valor / 1609.344;
        milla = (double) Math.round(milla *1000d)/1000;
        JOptionPane.showMessageDialog(null, +valor+ " Metros son " +milla+ " Millas");
	}
	
	public void ConvertirKilometrosAMetros(double valor) {
		double metro = valor * 1000 ;
        metro = (double) Math.round(metro *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kilometros son " +metro+ " Metros");
	}
	
	public double ConvertirKilometrosAMillas(double valor) {
		 double milla = valor / 1.609344;
         milla = (double) Math.round(milla *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kilometros son " +milla+ " Millas");
         return milla;
	}
	
	public void ConvertirMillasAMetros(double valor) {
		double metros = valor * 1609.344;
		metros	= (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Millas son " +metros+ " Metros");
	}

}

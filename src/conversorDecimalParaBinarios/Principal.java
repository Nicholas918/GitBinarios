package conversorDecimalParaBinarios;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Conversor conversor = new Conversor();

        int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o decimal a ser convertido para binario", "Conversor App", 3));
        conversor.setDecimal(decimal);
 
       JOptionPane.showMessageDialog(null,"O numero " + decimal + " em binarios é " + conversor.converteDecimalParaBinario(), "Conversor App", 1);
       
       String binario = JOptionPane.showInputDialog(null, "Digite o binario a ser convertido para decimal;", "Conversor App", 3);
        conversor.setBinario(binario);
        
        JOptionPane.showMessageDialog(null,"O binario " + binario + " em decimal é " + conversor.converteBinarioParaDecimal(binario),"Conversor App", 1);
        
    }

}

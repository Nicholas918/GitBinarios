package conversorDecimalParaBinarios;

public class Conversor {

    private int decimal;
    private String binario;

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }


    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String converteDecimalParaBinario() {
       
        int resto;
        String binario = "";

        while (decimal > 0) {

            resto = decimal % 2;
            binario = resto + binario;
            decimal = decimal / 2;
        }

        return binario;
    }
    
    public int converteBinarioParaDecimal(String binario) {
   
    int potencia = 0;

    for (int i = binario.length() - 1; i >= 0; i--) {
        int digito = Character.getNumericValue(binario.charAt(i));
        decimal += digito * Math.pow(2, potencia);
        potencia++;
    }

    return decimal;
}





}



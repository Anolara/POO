import javax.swing.*;

public class IMC {

    public static void main(String[] args) {
        float altura, peso, imc;
        String sAltura, sPeso, resultado;

        try {
            sAltura = JOptionPane.showInputDialog("Digite o valor da altura em metros:");
            altura = Float.parseFloat(sAltura);

            sPeso = JOptionPane.showInputDialog("Digite o valor do peso em kg:");
            peso = Float.parseFloat(sPeso);

            if (altura <= 0 || peso <= 0) {
                JOptionPane.showMessageDialog(null, "Altura e peso devem ser números maiores que zero.");
                return; // Encerra o programa
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite números validos " +
                    "para altura e peso e use ponto para separar os numeros.");
            return; // Encerra o programa
        }

        imc = peso / (altura * altura);
        String imcFormatado = String.format("%.2f", imc);

        if (imc < 17) {
            resultado = "Você está muito abaixo do peso.";
        } else if (imc >= 17 && imc <= 18.49) {
            resultado = "Você está abaixo do peso.";
        } else if (imc >= 18.5 && imc <= 24.99) {
            resultado = "Você está com o peso normal.";
        } else if (imc >= 25 && imc <= 29.99) {
            resultado = "Você está acima do peso.";
        } else if (imc >= 30 && imc <= 34.99) {
            resultado = "Você tem obesidade nível 1.";
        } else if (imc >= 35 && imc <= 39.99) {
            resultado = "Você tem obesidade nível 2.";
        } else {
            resultado = "Você tem obesidade nível 3.";
        }

        JOptionPane.showMessageDialog(null, "Valor do IMC: " + imcFormatado + "\n" + resultado);
    }
}
//Com os conhecimentos adquiridos até agora, desenvolva um programa em Java que declara variáveis inteiras, reais e String,
//recebe dois números inteiros usando interface com usuário, calcula o quociente da divisão dos dois números, 
//a potência do primeiro número pelo segundo número e mostra essas informações usando interface com usuário.

//salvar como AtividadePratica.java
import javax.swing.*;

class AtividadePratica
{
  public static void main (String entrada[])
  {
    //declaração de variáveis
    int num1, num2, div;
    double pot;
    String msg="";
    //entrada de dados
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro:"));
    //processamento
    div = (int)num1 / (int)num2;
    pot = Math.pow(num1,num2);

    //saída de resultados
    msg = msg + "quociente da divisao de " + num1 + " por " + num2 + " = " + div + "\n";
    msg = msg + "potencia de " + num1 + " por " + num2 + " = " + pot + "\n";
    JOptionPane.showMessageDialog(null, msg);

    System.exit(0);
  }
}
import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class TratamentoDeExcecoesEmJava {
    public static void main(String[] args) {
        
        boolean continueLop = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador");
            String b = JOptionPane.showInputDialog("Denominador");
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println(resultado);
                continueLop= false;
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "entrada invalida informe um numero inteiro"+ e.getMessage(), b, 0, null);
                e.printStackTrace();
            } 
            catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null, "impossível dividir por zero"+ e.getMessage(), b, 0, null);
            }
            finally{
                System.out.println("Chegou ao final");
            }
        } while(continueLop);
        
    }

    public static int dividir(int a, int b) {
        return a/b;
    }
}

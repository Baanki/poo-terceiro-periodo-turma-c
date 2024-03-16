// A calculadora deve ser capaz de realizar as seguintes operações:

// 1. Cálculo de Preço Total:
//     Dona Gabrielinha deseja calcular o preço total da venda de um item, considerando a quantidade de uma planta vendida vezes seu preço unitário.
   
//     Entrada: Receber dois valores, primeiro a quantidade da referida planta, segundo a valor o preço da mesma.
//     Saída: Retornar o resultado do cálculo.
   
// 2. Cálculo de Troco:
//     A calculadora deve calcular o troco a ser dado ao cliente, considerando o valor pago.
   
//     Entrada: Receber dois valores, primeiro o valor recebido pelo cliente, segundo o valor total da compra.
//     Saída: Retornar o resultado do cálculo.

// 3. Criar Menu Console:
//     [1] - Calcular Preço Total
//     [2] - Calcular Troco    
//     [3] - Sair    

// INFORMAÇÕES IMPORTANTES!
// A ENTREGA CONSISTE NO LINK DO PULL REQUEST DO SEU GIT.
// APÓS ADICIONADO O LINK, MARCAR ATIVIDADE COMO ENTREGUE!
// ENTREGAS EM ATRASO SERÁ DESCONTADO METADE DA NOTA!!
// APÓS UMA SEMANA DA DATA INICIAL DA ATIVIDADE, NÃO SERÁ MAIS POSSÍVEL REALIZAR ENTREGA.
import javax.swing.JOptionPane;

public class java {
    public static void main(String[] args) {
        double menu = 0.0; // Use double para operações com valores monetários
        String menu_digitar;

        while (menu != 3) { // Condição corrigida para continuar o loop até que o usuário escolha a opção 3 (Sair)
            menu_digitar = JOptionPane.showInputDialog("---MENU--\n[1] - CALCULAR PRECO TOTAL\n[2] - CALCULAR TROCO\n[3] - SAIR");
            menu = Double.parseDouble(menu_digitar);

            if (menu == 1) {
                String valor_total = JOptionPane.showInputDialog("Insira o preco do produto: ");
                double valor = Double.parseDouble(valor_total);

                String quantidade_total = JOptionPane.showInputDialog("Insira a quantidade: ");
                double quantidade = Double.parseDouble(quantidade_total);

                double total = valor * quantidade;

                JOptionPane.showMessageDialog(null, "O preço total é: " + total);
                
            } else if (menu == 2) {
                String troco_total = JOptionPane.showInputDialog("Insira o valor da compra: ");
                double troco_ = Double.parseDouble(troco_total);

                String pagamento_total = JOptionPane.showInputDialog("Insira o valor do pagamento ");
                double pagamento = Double.parseDouble(pagamento_total);

                double troco = pagamento - troco_;
                if (troco < 0 ){
                    while(troco<0){
                        pagamento_total = JOptionPane.showInputDialog("Insira um valor pagável: ");
                        pagamento = Double.parseDouble(pagamento_total);
                        troco = pagamento - troco_;
                    }
                }

                JOptionPane.showMessageDialog(null, "O troco é: " + troco);
            }
        }
    }
}

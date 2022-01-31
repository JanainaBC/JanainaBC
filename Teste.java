/* @author janai
 * Desenvolva um aplicativo JAVA que determine se um cliente de uma loja de departamento excedeu o limite de credito em uma conta corrente. 
 * Para cada cliente, os seguintes fatos estão disponivéis:
 * 
 * a)Numero da Conta
 * b)Saldo no inicio do mês
 * c)Total de Todos os itens comprados a crédito por este cliente neste mês 
 * d)Total de todos os creditos lançados na conta do cliente neste mês;e 
 * e)Limite autorizado de crédito.
 * O programa deve ler cada um desses fatos como inteiros a partir de dialogos de entrada, calcular o novo saldo(=saldo inicial+compras a credito - creditos),
 * exibir o novo saldo e determinar se ele exceder o limite de credito do cliente. Para aqueles clientes cujo limite de credito for excedido, o programa deve 
 * exibir a mensagem "Limite de Credito excedido"
 */
import javax.swing.JOptionPane;

public class Atividade9 {

    public static void main(String args[]) {
        int nConta, saldoInicial, comprasCred, creditos, vlitensCred;
        int novoSaldo, limiteCred, menu, totalCompCred, totalItensCred;
        String aLimiteCred, tipoCompra, itensCred, nContacliente, asaldoInicial;

        //Solicita entrada e lê o numero da Conta 
        nContacliente = JOptionPane.showInputDialog("Digite O Numero da Conta");
        nConta = Integer.parseInt(nContacliente);

        //Solicita entrada e lê o Saldo Inicial do mês
        asaldoInicial = JOptionPane.showInputDialog("Digite o Saldo Inicial do Mês");
        saldoInicial = Integer.parseInt(asaldoInicial);

        //Solicita entrada e lê o Limite de Credito do seu Cartão
        aLimiteCred = JOptionPane.showInputDialog("Digite O Limite de Credito do seu Cartão");
        limiteCred = Integer.parseInt(aLimiteCred);

        tipoCompra = JOptionPane.showInputDialog("1 - Cartão,0-Sair");
        menu = Integer.parseInt(tipoCompra);

        totalCompCred = 0;
        totalItensCred = 0;

        while (menu != 0) {

            if (menu == 1) {
                itensCred = JOptionPane.showInputDialog("Digite o Valor do Item: ");
                vlitensCred = Integer.parseInt(itensCred);

                //Adiciona os itens comprados no credito
                totalCompCred = totalCompCred + 1;

                //Soma os valores dos itens no credito
                totalItensCred = totalItensCred + vlitensCred;

                novoSaldo = (saldoInicial + totalItensCred - limiteCred);
                
                if (totalItensCred > limiteCred) {
                    JOptionPane.showMessageDialog(null,"Limite de Credito excedido"
                            + "Total do Itens:" + totalCompCred + " \n- Valor Itens Comprados:" + totalItensCred + "\n Limite Credito: " 
                            + limiteCred+"\n Novo Saldo:"+novoSaldo);
                    System.exit(0);
                }

                
            }

            

            tipoCompra = JOptionPane.showInputDialog("1 - Cartão,0-Sair");
            menu = Integer.parseInt(tipoCompra);

        }
    }
}

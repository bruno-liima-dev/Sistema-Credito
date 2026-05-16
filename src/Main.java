import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        double salario = 3500.0;
        double dividaTotal = 800.0;
        double limite = salario * 0.30;
        boolean temEmprego = true;

        if (temEmprego && dividaTotal <= limite) {

            System.out.println("Credito Aprovado!");
            System.out.println("Limite : R$ " + (limite - dividaTotal));
        } else if (!temEmprego) {

            System.out.println("Reprovado: sem emprego.");


        } else {

            System.out.println("Reprovado: divida alta");


        }


    }

}

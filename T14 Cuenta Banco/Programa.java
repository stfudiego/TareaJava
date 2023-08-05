public class Programa {
    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount();
        BankAccount cuenta2 = new BankAccount();
        cuenta1.displayDinero();
        cuenta1.getNumeroDeCuenta();
        cuenta1.depositarDinero(10009);
        cuenta1.retirarDinero(900);
        cuenta1.displayDinero();
        System.out.println(BankAccount.getTotalCuentas());

    }
}

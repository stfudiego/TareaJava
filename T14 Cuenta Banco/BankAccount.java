import java.util.Random;

class BankAccount{
    private String numeroDeCuenta;
    private double saldoCorriente;
    private double saldoCuentaDeAhorros;
    private static int totalCuentas = 0;
    private static double totalDinero = 0;

    public BankAccount(){
        totalCuentas++;
        setNumeroDeCuenta(generarNumCuenta());
    }

    private String generarNumCuenta(){
        int numCuenta = 0;
        Random numRandom = new Random();
        for (int i = 0; i < 10; i++) {
            int num = numRandom.nextInt(10);
            numCuenta+=num*(Math.pow(10, i));
        }
        return numCuenta+"";
    }

    public static void depositarDinero(double depositar){
        totalDinero=+depositar;
        System.out.println("Total dinero: "+totalDinero);
    }

    public static void retirarDinero(double retirar){
        if (totalDinero<=0) {
            System.out.println("Fondos insuficientes");
        }
        else {
            totalDinero-=retirar;
        System.out.println("Total dinero: "+totalDinero);
        }
    }

    public static void displayDinero(){
        System.out.println("Total dinero: "+totalDinero);
    }

    public String getNumeroDeCuenta() {
        
        System.out.println(numeroDeCuenta);
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldoCorriente() {
        return saldoCorriente;
    }

    public void setSaldoCorriente(double saldoCorriente) {
        this.saldoCorriente = saldoCorriente;
    }

    public double getSaldoCuentaDeAhorros() {
        return saldoCuentaDeAhorros;
    }

    public void setSaldoCuentaDeAhorros(double saldoCuentaDeAhorros) {
        this.saldoCuentaDeAhorros = saldoCuentaDeAhorros;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }

    public static void setTotalCuentas(int totalCuentas) {
        BankAccount.totalCuentas = totalCuentas;
    }

    public static double getTotalDinero() {
        return totalDinero;
    }

    public static void setTotalDinero(int totalDinero) {
        BankAccount.totalDinero = totalDinero;
    }
    
}
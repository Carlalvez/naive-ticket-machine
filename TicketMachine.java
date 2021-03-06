/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Modifica el constructor de la clase TicketMachine para que no admita ning�n par�metro. En lugar de ello, el precio del billete siempre ser� de 1000 c�ntimos.
     */
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
    }
    
    /**
     * A�ade ahora un segundo constructor a la clase TicketMachine que permita crear m�quinas cuyo precio del billete sea el que se indica por par�metro.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    
    public void vaciar()
    { 
       total = 0;
    }
    
    /**
       * A�ade a la clase un m�todo llamado vaciar que simule el proceso de extraer todo el dinero que haya acumulado en la m�quina. Este m�todo no devuelve nada y vamos a dar por hecho que se
       * va a invocar siempre que no hay ninguna operaci�n en curso (es decir, siempre que el balance de la m�quina est� a 0).
    */
    public void setVaciar (int balance)
    {
        if (balance == 0);{
            total = 0;
    }
    }
    
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}

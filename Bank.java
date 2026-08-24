import java.util.*;

class Bank{
    static String customerName;
    static String accountNum;
    static double balance;

    Bank(String Name, String accountNum, double accBalance){
        this.customerName =  Name;
        this.accountNum = accountNum;
        this.balance = accBalance;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of customer : ");
        String name =  sc.next();
        
        String randomString = new Random().ints('0', 'z' + 1)
                .filter(i -> Character.isLetterOrDigit(i))
                .limit(15)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString()                
                .toUpperCase();

        System.out.println("Enter balance amounnt to deposit : ");
        double accBalance = sc.nextDouble();
        Bank b = new Bank(name, randomString, accBalance);
        List<Bank> list = new ArrayList<>();
        list.add(b);
        
        for(Bank acc: list){
            System.out.println("\n--- Printing via List loop ---");
            System.out.println(acc.toString());
        }
        System.out.println("normal retrival : "+b.customerName +" " +b.accountNum+" "+ b.balance);
    }
}

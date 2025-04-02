package Polimorphism.task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        Notes notes = new Notes();
        Bank bank = new Bank();
        Calculate calculate = new Calculate();

        System.out.println("Welcome to phone!");
        while (true){
            System.out.println("""
                   
                    Select the application:
                    1. Notes
                    2. Bank account
                    3. Calculate
                    4. OFF
                    """);

            int userChoice = scanInt.nextInt();
            if (userChoice == 1) {
                    System.out.println("Welcome to application 'notes'");
                    boolean isTrue = true;
                    while (isTrue){
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("""
                          
                                select the action: 
                                1. Create new note
                                2. Add note
                                3. Delete notes
                                4. Show all notes
                                5. Exit
                                """);
                        int userC = scanner.nextInt();
                        switch (userC) {
                            case 1:
                                System.out.println("Write the title of note: ");
                                notes.createTitleOfNote(scanString.nextLine());

                                System.out.println("Write the note: ");
                                notes.createNote(scanString.nextLine());
                                notes.showTitleAndNote();
                                break;
                            case 2:
                                System.out.println("add note: ");
                                notes.addNote(scanString.nextLine());
                                notes.showTitleAndNote();
                                break;
                            case 3:
                                notes.deleteNotes();
                                break;
                            case 4:
                                notes.showTitleAndNote();
                                break;
                            case 5:
                                System.out.println("Bye bye");
                                isTrue = false;
                                break;
                            default:
                                System.out.println("Invalid choice!");

                        }
                    }}

                else if (userChoice == 2) {
                System.out.println("Welcome to bank account!");
                bank.showBalance();
                boolean isTrue2 = true;
                while (isTrue2) {
                    System.out.println("""
                            
                            Select the action:
                            1. Send money
                            2. Get money
                            3. Show balance
                            4. Exit
                            """);
                    switch (scanInt.nextInt()) {
                        case 1:
                            System.out.println("How many money you wants to send?");
                            bank.sendMoney(scanInt.nextInt());
                            break;
                        case 2:
                            System.out.println("How many money you wants to get?");
                            bank.getUserMoney(scanInt.nextInt());
                            bank.showBalance();
                            break;
                        case 3:
                            bank.showBalance();
                            break;
                        case 4:
                            System.out.println("Bye bye");
                            isTrue2 = false;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                }
            } else if (userChoice == 3) {
                    int userOperation = 0, userNum1 = 0, userNum2 = 0;
                System.out.println("Welcome to application 'calculate'");
                boolean isTrue = true;
                while (isTrue){
                    System.out.println("""
                            
                            Select the operation:
                            1. ( + )
                            2. ( - )
                            3. ( * )
                            4. ( / )
                            5 Exit
                            """);

                    System.out.println("Write the operation: ");
                    userOperation = scanInt.nextInt();
                    if (userOperation != 5){
                    System.out.println("write the first number: ");
                    userNum1 = scanInt.nextInt();
                    System.out.println("write the second number: ");
                    userNum2 = scanInt.nextInt();
                    calculate.calculate(userOperation, userNum1, userNum2);
                    } else {
                        isTrue = false;
                    }
                }

            } else if (userChoice == 4) {
                System.out.println("Bye Bye!");
                return;
            }

            }
        }




    }













//    Озунуздун телефонунузду тузунуз.
//    Телефонунузда томондогу мумкунчулуктор болсун : заметки,
//            банк приложения, калькулятор .
//            -Заметкиге озунуз каалаганча текст турундо маалыматтарды
//    сактай алыныз жаnа аларды озгортуп очуруп колдонунуз.
//    -Bank приложенияда озунуздун балансынызды текшеруу, башка
//    адамдын картасына акча которуу мумкунчулуктору болсун
//    -Калькулятордо болсо сандарды кошуп, алып, кобойтуп, боло
//    алыныз.
//            Эскертуу, кандай полелер жана кандай методдор болот озубуз
//    ойлонобуз ар бир студенттин тапшырмасы уникалдуу болсун!
package at.dcv.marcella;

import java.util.Scanner;

public class KW43_Day03 {

    public static void bankomat() {
        boolean isActive = true;
        int accountBalance = 0;
        while (isActive) {
            int menueItem = chooseMenueItem();
            switch (menueItem) {
                case 1:
                    showAccountBalance(accountBalance);
                    break;
                case 2:
                    accountBalance = withdrawMoney(accountBalance);
                    break;
                case 3:
                    accountBalance = depositMoney(accountBalance);
                    break;
                case 0:
                    salutation();
                    isActive = false;
            }
        }
    }

    private static int getScannerInput(String text) {
        while (true) {
            System.out.println(text);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
        }
    }

    private static int chooseMenueItem() {
        return getScannerInput("Bitte wählen Sie aus: \nNummer 0: Beenden \nNummer 1: Kontostand \nNummer 2: Auszahlung \nNummer 3: Einzahlung");
    }

    private static void showAccountBalance(int accountBalance) {
        System.out.println("Ihr aktueller Kontostand ist " + accountBalance + "\n");
    }

    private static int withdrawMoney(int accountBalance) {
        int withdraw = getScannerInput("Ihr aktueller Kontostand ist: " + accountBalance + "\nWelchen Betrag wollen Sie auszahlen lassen?");
        if (accountBalance < withdraw) {
            System.out.println("Sie haben nicht genug Geld auf dem Konto, bitte zahlen Sie zuerst etwas ein.\n");
            return accountBalance;
        } else {
            accountBalance -= withdraw;
            System.out.println("Ihr neuer Kontostand ist: " + accountBalance + "\n");
            return accountBalance;
        }
    }

    private static int depositMoney(int accountBalance) {
        int deposit = getScannerInput("Ihr aktueller Kontostand ist: " + accountBalance + "\nWelchen Betrag wollen Sie einzahlen?");
        accountBalance += deposit;
        System.out.println("Ihr neuer Kontostand ist: " + accountBalance + "\n");
        return accountBalance;
    }

private static void salutation(){
        System.out.println("Auf Wiedersehen");
        }
        }

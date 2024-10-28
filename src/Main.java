import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Food> list = new ArrayList<>();

        Scanner menuChose = new Scanner(System.in);
        int opcja;
        

        while(true){
            System.out.print("\n===== MENU =====");
            System.out.print("\n1. Dodaj danie");
            System.out.print("\n2. Pokaż dania");
            System.out.print("\n3. Exit");
            System.out.print("\nWybierz swoją opcje: ");
            opcja = menuChose.nextInt();
            if(opcja >= 1 && opcja <= 4){
                switch (opcja){
                    case 1:
                        Scanner addFood  = new Scanner(System.in);
                        System.out.println("==== Dodaj danie ====");
                        System.out.print("Podaj nazwe dania: ");
                        String nazwa = addFood.nextLine();
                        System.out.print("Podaj cene dania: ");
                        String cena = addFood.nextLine();
                        try {
                            FileWriter menuWritter = new FileWriter("menu.txt",true);
                            menuWritter.write(nazwa);
                            menuWritter.write("\n");
                            menuWritter.write(cena);
                            menuWritter.write("\n");
                            menuWritter.close();
                            System.out.println("Pomyślnie dodano danie");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 2:
                        list.clear();

                        try {
                            BufferedReader bfr = new BufferedReader(new FileReader("menu.txt"));
                            String linia;

                            while ((linia = bfr.readLine()) != null) {
                                int price = Integer.parseInt(bfr.readLine());

                                Food food = new Food(linia, price);
                                list.add(food);
                            }
                            bfr.close();

                            System.out.println("\n==== Menu ====");
                            for (Food food : list) {
                                System.out.println(food);
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 3:
                        System.out.println("Do widzenia:)");
                        Runtime.getRuntime().exit(0);
                        break;
                }
            }else {
                System.out.println("Zły numer");
            }
        }

    }
}
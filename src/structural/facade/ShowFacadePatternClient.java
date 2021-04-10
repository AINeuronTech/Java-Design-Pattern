package structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowFacadePatternClient {
    private static int choice;
    public static void main(String[] args) throws IOException {
        do{
            System.out.println("..........Pizza Shop with Uber Eat............");
            System.out.println("..........1) Small Size Pizza with Single Topping.................");
            System.out.println("..........2) Medium Size Pizza with Multiple Toppings.................");
            System.out.println("..........3) Large Size Pizza with Various Toppings.................");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            UberEat uberEat = new UberEat();
            switch (choice){
                case 1:{
                    uberEat.smallPizzaDiscount();
                }
                break;

                case 2:{
                    uberEat.mediumPizzaDiscount();
                }
                break;

                case 3:{
                    uberEat.largePizzaDiscount();
                }
                break;

                default:{
                    uberEat.smallPizzaDiscount();
                }
            }
        }while (choice !=4);
    }
}

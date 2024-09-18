import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CentralSystem {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner app = new Scanner(System.in);

        System.out.print("\nPLUG IN YOUR DEVICES USING THIS CENTRAL POWER SYSTEM!");

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        boolean init = true;

        while (init)
        {
            System.out.print("\n======================================================================");
            System.out.print("\n\n                            Appliances");
            System.out.print("\n----------------------------------------------------------------------");
            System.out.print("\n|[1]Laptop  |  [2]Refrigerator  |  [3]Smartphone   |   [4]Exit|");
            System.out.print("\n----------------------------------------------------------------------");
            System.out.print("\nChoose your appliance by typing the appliance number to plug in: ");
            Integer choice = app.nextInt();

            if(choice.equals(1))
            {
                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Laptop plugging into the power source ");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("=====");
                TimeUnit.SECONDS.sleep(1);
            }
            else if(choice.equals(2))
            {
                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Refrigerator plugging into the power source ");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("=====");
                TimeUnit.SECONDS.sleep(1);
            }
            else if(choice.equals(3))
            {
                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Smartphone plugging into the power source ");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("=====");
                TimeUnit.SECONDS.sleep(1);
            }
            else if(choice.equals(4))
            {
                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Loading...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" =====");
                TimeUnit.SECONDS.sleep(1);
            }

            switch(choice)
            {
                case 1:
                    PowerOutlet laptopPo = new LaptopAdapter(laptop);
                    System.out.print(laptopPo.plugIn());
                    break;
                case 2:
                    PowerOutlet refrigeratorPo = new RefrigeratorAdapter(refrigerator);
                    System.out.print(refrigeratorPo.plugIn());
                    break;
                case 3:
                    PowerOutlet smartphoneChargerPo = new SmartphoneAdapter(smartphoneCharger);
                    System.out.print(smartphoneChargerPo.plugIn());
                    break;
                case 4:
                    init = false;
                    System.out.print("\n\nThank you for using this application! :)\n");
                    break;
                default:
                    System.out.print("\n\nInvalid input. Please try again. :(");
                    break;
            }
        }
    }
}
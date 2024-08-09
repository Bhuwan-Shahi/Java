import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Display();



    }
    public  static  void Display(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Play Game and 2 for Seeing Score");
        int service = sc.nextInt();
        if(service == 1){
            System.out.println("You Have Choosen To Play Game Enjoy");
            Play_Game();
        }
        else if (service == 2 ){
            See_Score();
        }
        else {
            System.out.println("Enter the valid choice!");

        }
    }
    public  static  void Play_Game(){
      Tic ti = new Tic();
        ti.Start();
        ti.SelectOX();
        ti.InitailBoard();
        ti.over();
        Display();

    }
    public  static void See_Score(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter The name of player:(One || Two)");
        String name = sc.nextLine();
        Tic.databases.ShowWins(name );
        Display();



    }

}
package number3;
import java.util.Scanner;
public class Magazine_test {
    public static void main(String[] args) {
        int choice;
        int magazine_nember;
        Scanner input = new Scanner(System.in);
        Magazine magazine[] = new Magazine[5];
        magazine[0] = new Magazine("Addis_zemen", "111.2-567/32/89", "yihenew_addis",
                " sunday12/08/2015at2:25pm", "nefas");
        magazine[1] = new Magazine("zehabesha", "23.5-5654/89", "alenu bekele",
                " monday 16/07/2012 at 2:2pm", "dolma");
        magazine[2] = new Magazine("addis_admass", "764-5654/32.98/89", "bahiru_girma",
                " tuesday 21/11/2011 at 5:25pm", "gorf_media");
        magazine[3] = new Magazine("addis_fortune", "564-675/86.87/76", "ashenafi_belay",
                " thursday 19/02/2015 at 7:25am", "norda");
        magazine[4] = new Magazine("nazret.com", "5654.8765-65/32.876/78-86", "sleshe_ashenafe",
                " sunday 07/01/2014 at 2:25am", "lole");
        for (int i = 0; i <= 0; i++) {
            System.out.println("would you went to get some description about magazine");
            System.out.println("press  1   if you went...\npress  0  if you don't went ..");
            System.out.println(" ");
            choice = input.nextInt();
            if (choice == 0)
                break;
            else {
                System.out.print("pleas inter the index(number) of magazine what you went to get description ");
                magazine_nember = input.nextInt();
                System.out.println("-----------------------------------------------------------------------------");
        }
            System.out.println("all description about " + magazine[magazine_nember]);
            System.out.println("");
            System.out.println("name of magazine = "+magazine[magazine_nember].getMgazine_name());
            System.out.println("the isbn number= "+magazine[magazine_nember].getISBN_number());
            System.out.println("Autor_name="+magazine[magazine_nember].getAutor_name());
            System.out.println("date= "+magazine[magazine_nember].getDate());
            System.out.println("publisher= "+magazine[magazine_nember].getPublisher());
        }
        System.out.println("*************************************************************************************");
        System.out.println("*************************************************************************************");
            for (int j = 0; j <= 0; j++) {
                System.out.println("would you went set property of magazine");
                System.out.println("");
                System.out.println("press  1   for set...\npress  0  if you don't went set..");
                System.out.println(" ");
                choice = input.nextInt();
                if (choice == 0)
                    break;
                else {
                    System.out.print("pleas inter the index(number) of magazine you went to set ");
                    magazine_nember = input.nextInt();
                }
                System.out.println("pleas inter all information about the magazine below");
                System.out.println("---------------------------------------------------------------");
                System.out.println(" ");
                String name = input.nextLine();
                System.out.println("pleas inter the name of magazine");
                String buble = input.nextLine();
                System.out.println("pleas inter the isbn number");
                String isbn = input.nextLine();
                System.out.println("pleas inter the Autor_name");
                String autor = input.nextLine();
                System.out.println("pleas inter the date in the form of date/..month/..year/..time");
                String date = input.nextLine();
                System.out.println("pleas inter name of publisher");
                String publisher = input.nextLine();
                magazine[magazine_nember].setAutor_name(name);
                magazine[magazine_nember].setISBN_number(isbn);
                magazine[magazine_nember].setAutor_name(autor);
                magazine[magazine_nember].setDate(date);
                magazine[magazine_nember].setPublisher(publisher);
                System.out.println("---------------------------------------------------------------");
                System.out.println(" you have finished your set operations  bye bye");
                System.out.println("---------------------------------------------------------------");
            }
       }
    }

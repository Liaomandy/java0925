public class inputtest {
    public static void main(String[]args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("What's you're name");
        String Name = sc.nextLine();

        System.out.println("How old are you?");
        Double Age = sc.nextDouble();

        System.out.println(Name + " ,You're " +  Age + " years old");


    }
}

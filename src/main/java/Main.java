import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Container arr = new Container();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int amount = inp.nextInt(), tmp;
        for(int i = 0; i < amount; i++){
            System.out.println("Enter " + (i+1) + " number\n");
            tmp = inp.nextInt();
            arr.add(tmp);
        }
        arr.show();
        System.out.println("Enter index of number you want to remove: ");
        int ind = inp.nextInt();
        arr.show(ind);
        arr.remove(ind);
        System.out.println("Container without " + ind + " number: ");
        arr.show();
    }
}

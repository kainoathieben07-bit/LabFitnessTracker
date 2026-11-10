import java.util.Scanner;
class Workout{
    String name;
    int dur;
    void showWrk(){System.out.println("Workout type: "+name
    +"\nDuration (min): "+dur);
    }
}
class Running extends Workout{
 double dist;
 void showRun(){
     showWrk();
     System.out.println("-----Workout Summary-----" +
             "\nDistance (km): "+ dist
     +"\nCalories burned: "+(dist*60));
 }
 }
void main() {
        System.out.println("Enter 1 to begin (any other # to exit):");
        Scanner dih = new Scanner(System.in);
        int cuh = dih.nextInt();
        if(cuh == 1){
            Running bts = new Running();
            bts.name = dih.nextLine();
            System.out.println("Enter workout type:");
            bts.name = dih.nextLine();

            System.out.println("Enter duration (min):");
            bts.dur = dih.nextInt();

            System.out.println("Enter distance (km):");
            bts.dist = dih.nextDouble();

            bts.showRun();
        }
        else{System.out.println("Program closed...");}
}

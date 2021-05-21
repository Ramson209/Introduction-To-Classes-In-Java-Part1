class Bike {
//Data or Attributes 
Boolean power;
int speed;
void Start () {
power=true;
speed=0;
}

void stop () {
power=false;
speed=0;
}
void accelerate (int newSpeed) {
speed =newSpeed;
}
void printstate () {
System.out.println("Current State");
System.out.println("Power -" +power);
System.out.println("Speed - " +speed);
}
}

public class Main {
public static void main (String [] args) {
Bike b1 = new Bike();
Bike b2 = new Bike ();
b1. Start ();
b2. Start ();
b2. accelerate (50);
b1. printstate ();
b2. printstate ();
}
}





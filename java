import java.util.*;

class Plane{
private String name;
private String model;
private int number;

private static int count = 0;

public Plane() {
name = "null";
model = "null";
number = 0;
}

public Plane(String n, String m, int s) {
name = n;
model = m;
number = s;
}
count++;


public static int getcount(){
return count;
}
}

public class PlaneTest{
public static void main(String[] args) {


Plane p1= new Plane("", "", 0);
Plane p2= new Plane("Airbus", "A380", 500);
int n = Plane.getcount();

System.out.println("제작사 : "+n);
System.out.println("모델 : "+

System.out.println

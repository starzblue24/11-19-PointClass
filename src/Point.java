// A Point object represents a pair of (x, y) integer coordinates.
// Reference Building Java Programs pp 505-517
import java.lang.Math;
public class Point{
  int x;
  int y;
   public int setX(){
return x;
}
public int setY(){
return y;
}
public double distanceFromOrigin(){
return  Math.sqrt((x*x)+(y*y));
}
public double distance(double a){
a=Math.sqrt((x-x)*2+(y-y)*2);
return a;
}
public String toString(){
    return "("+x+","+y+")";
}
public void translate(int dx, int dy)
{
x+=dx;
y+=dy;
}
}


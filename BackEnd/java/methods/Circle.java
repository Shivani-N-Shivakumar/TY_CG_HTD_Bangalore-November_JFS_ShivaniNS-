class Circle{
static double areaCircle(int r){
double areaCircle=3.142*r*r;
return areaCircle;
}
static double perimeterCircle(int r){
double perimeterCircle=2*3.142*r;
return perimeterCircle;
}
public static void main(String arr[]){
double result=areaCircle(6);
double result1=perimeterCircle(6);
System.out.println("area of circle "+result);
System.out.println("perimeter of circle "+result1);

}
}
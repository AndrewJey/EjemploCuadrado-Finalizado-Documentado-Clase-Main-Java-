public class SquareCheck {
 public static void main(String[] args) throws Exception {

 practica.Cuadrado square=new practica.Cuadrado(3);CheckSupport.close(square.Area(3),9);CheckSupport.close(square.Perimetro(3),12);
 CheckSupport.close(square.Area(50000),2500000000d);square.setLado(7);CheckSupport.check(square.toString().contains("49.0"),"Display uses current side");

 CheckSupport.done();
 }
}

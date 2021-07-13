public class App {
    public static void main(String[] args) throws Exception {
            double n1=20, n2=10;
        System.out.println(DivisionNumeros(n1,n2));}
          public static String DivisionNumeros(double n1, double n2)
        {
            String e;
            if(n2==0){
               e="No se puede dividir por cero";   
            }else{
               e=n1 + " / " + n2 + " = " +n1/n2;       
            }
            return e;
        }
    }


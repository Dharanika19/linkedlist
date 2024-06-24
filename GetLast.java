import java.util.LinkedList;
public class GetLast{
    public static void main(String args[]){
        LinkedList<String> bikes=new LinkedList<>();
        bikes.add("RE");
        bikes.add("RX100");
        bikes.add("KTM");
        bikes.add("RN5");
        System.out.println(bikes.getLast());                                                              
      }
}
    

/*OUTPUT:
      RN5*/
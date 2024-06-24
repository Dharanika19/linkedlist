import java.util.LinkedList;
public class AddFirst{
    public static void main(String args[]){
        LinkedList<String> company=new LinkedList<>();
        company.add("TCS");
        company.add("IBM");
        company.add("zoho");
        company.add("wipro");
        company.addFirst("LTImindtree");

        System.out.println(company);
    }
}





OUTPUT:
 [LTImindtree,TCS,IBM,zoho,wipro]
 
    


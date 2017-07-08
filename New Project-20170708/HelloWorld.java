import java.util.StringTokenizer;
public class HelloWorld{

    public static void main (String[] args) throws java.lang.Exception
	{
String address1 = " Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
String address2 = " Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
/*String address2 = " Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
String address1 = " Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";*/
/*StringTokenizer st= new StringTokenizer(address1,",");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());

}*/
System.out.println(address1.substring(0,8));
System.out.println(address2.substring(0,8));
String search  = "Mason";
String search1 ="Pin";

if ( address1.toLowerCase().indexOf(search.toLowerCase()) != -1 ) {

   System.out.println(address1);

}
if ( address2.toLowerCase().indexOf(search.toLowerCase()) != -1 ) {

   System.out.println(address2);

}
if ( address1.toLowerCase().indexOf(search1.toLowerCase()) != -1 ) {

   System.out.println("address1 has pincode");

}
if ( address2.toLowerCase().indexOf(search1.toLowerCase()) != -1 ) {

   System.out.println("address2 has pincode");

}
}}

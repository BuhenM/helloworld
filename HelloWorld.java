import javax.swing.JOptionPane;
 
public class Helloworld {
public static void main(String[] args) { 

String a = "What is your name? ";
String b = "How are you? ";
String c = "What is your favoite food? ";

String d = JOptionPane.showInputDialog("What is your name?");
String e = JOptionPane.showInputDialog("How are you?");
String f = JOptionPane.showInputDialog("What is your favorite food?");

System.out.println("Hello!");
System.out.println(a + d);
System.out.println(b + e);
System.out.println(c + f);  
System.out.println("Very nice!");

}
}
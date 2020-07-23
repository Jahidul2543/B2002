public class VariableDemo{

public static void main(String[] args){

System.out.println("Hello learning Data Types in Java");

// How many phone due you have?

int numberOfPhone = 2;

int numerOfLaptops = 2;

// Value of total gadagate = 4
int totalGadagets = numberOfPhone + numerOfLaptops;

// Please print in the console whatever inside the double quotation " "
System.out.println("Total Gadget of Jahidul " + totalGadagets );

// name of the last boy of the class

String nameOfLastBoy = "Jahidul";

char jahidulsGrade = 'F';

// Is Jahidul is bad boy? true/false

boolean isJahidulIsGoodBoy = false;

System.out.println("Is Jahidul Is Good Boy " + isJahidulIsGoodBoy);

byte numberOfBytes = 127;
//Number Of Bytes  127
System.out.println("Number Of Bytes " + numberOfBytes);

double valueOfPie = 3.14161234455555545555;
System.out.println("Value of Pie " + valueOfPie);
// Bring add() method inside the main method
 add();

    }

public static void add(){
    int x = 4;
    int y = 5;

    int total = x + y;
    System.out.println("Total : " + total);
}


}
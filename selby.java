import java.util.Scanner; 

class selby {
  public static void main(String[] args) {
    int a, b, sum;
    Scanner fhulu = new Scanner(System.in); 
    System.out.println("Type a number:");
    a = fhulu.nextInt(); 

    System.out.println("Type another number:");
    b = fhulu.nextInt(); 

    sum = a - b;  
    System.out.println("Sum is: " + sum); 
  }
} 
package Week10;

public class IfElse_Compare2Number {
    public static void main(String[] args) {
     //Number 1 มากกว่า Number 2  
     //Number 1 น้อยกว่า Number 2 
     //Number 1 เท่ากับ Number 2  

     //รับตัวเลขเข้ามา2ตัว
     int number1 = 33, number2= 35;

     //เปรียบเทียบตัวเลขทั้ง2
    if (number1>number2 ) {
        System.out.println(number1 + " มากกว่า " + number2);
        
    } else if(number1<number2) {
        System.out.println(number1 + "น้อยกว่า" + number2);
        
    } else {
           System.out.println(number1 + "น้อยกว่า" + number2);
    }
}
}
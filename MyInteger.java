public class MyInteger {
    private int value;

    //constructor
    public MyInteger(){
        value = 0;
    }

    //setter
    public void setValue(int value){
        this.value = value;
    }

    //getter
    public int getValue(){
        return this.value;
    }

    //method

    public boolean isEven(){
        return value % 2 == 0;
    }

    public boolean isOdd(){
        return value % 2 != 0 ;
    }
    
    public boolean isPrime(){
        if (number <=1) return false;
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0) return false;
        }
        return true;
    } // by ChatGPT btw

    // static method

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean isOdd(int number){
        return number % 2 != 0;
    }

    public static boolean isPrime(int number){
        if (number <=1) return false;
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0) return false;
    }
            return true;
}

    // method equals

    public boolean equals(int Int){
        return this.value == Int;
    }

    public boolean equals(MyInteger Int){
        return this.value == Int.getValue();
    }

    // static parse

    public static int parseInt(char[] charArray){
        return Integer.parseInt(new String(charArray));
    }

    public static int parseInt(String s){
        return Integer.parseInt(s);
    }






    
}

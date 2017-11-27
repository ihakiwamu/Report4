package jp.ac.uryukyu.ie.e175709;

public class Main {
    public static void main(String[] args) {
        try {
            String str = "3．14";
            double value = Double.parseDouble(str);

        }catch(NullPointerException e){
            System.out.println(e.getMessage());

        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}

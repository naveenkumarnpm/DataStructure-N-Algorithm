import java.util.*;

enum ones{
    ZERO(""), ONE("One"), TWO("Two"), THREE("Three"), FOUR("Four"),
    FIVE("Five"), SIX("Six"), SEVEN("Seven"), EIGHT("Eight"), NINE("Nine");

    String value;
    ones(String v){
        value=v;
    }

    String getvalue(){
        return value;
    }

}
enum tens{
    ZERO(""), TEN(""), TWENTY("Twenty"), THIRTY("Thirty"), FORTY("Forty"),
    FIFTY("Fifty"), SIXTY("Sixty"), SEVENTY("Seventy"), EIGHTY("Eighty"), NINETY("Ninety");

    String value;
    tens(String v){
        value=v;
    }

    String getvalue(){
        return value;
    }


}

enum teens{
    ZERO(""),ELEVEN("eleven"),TWELVE("twelve"),THIRTEEN("thirteen"),FOURTEEN("fourteen"),
    FIFTEEN("fifteen"),SIXTEEN("sixteen"),SEVENTEEN("seventeen"),EIGHTEEN("eighteen"),NINETEEN("ninteen");

    String value;
    teens(String v){
        value=v;
    }

    String getvalue(){
        return value;
    }
}

enum hundreds{
    ZERO(""), ONE_HUNDRED("One Hundred"), TWO_HUNDRED("Two Hundred"), THREE_HUNDRED("Three Hundred"),
    FOUR_HUNDRED("Four Hundred"), FIVE_HUNDRED("Five Hundred"), SIX_HUNDRED("Six Hundred"),
    SEVEN_HUNDRED("Seven Hundred"), EIGHT_HUNDRED("Eight Hundred"), NINE_HUNDRED("Nine Hundred");

    String value;
    hundreds(String v){
        value=v;
    }

    String getvalue(){
        return value;
    }
}

public class nine {
    public static String converter(int number){
        if(number==0||number>9999){
            System.out.println("invalid ...input again");
        }
        StringBuilder work=new StringBuilder();

        int tho=number/1000;
        int hun=(number%1000)/100;
        int ten=(number%100)/10;
        int one=number%10;

        if(tho>0){
                work.append(ones.values()[tho].getvalue()).append(" thousand ");
        }
        if(hun>0){
            work.append(hundreds.values()[hun].getvalue()).append(" ");
        }
        if(ten==1){
            work.append(teens.values()[ten].getvalue());
        }else{
            work.append(tens.values()[ten].getvalue()).append(" ");
            if(one!=0){
                work.append(ones.values()[one].getvalue());
            }else{
                work.append("");
            }
        }
        return work.toString();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("the answer is"+converter(n));
    }

}

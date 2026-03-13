import java.util.*;

public class Investment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stock = sc.nextInt();
        int years = sc.nextInt();
        sc.nextLine();
        String tolerance = sc.nextLine();
        String volatility = sc.nextLine();

        int bond = 100-stock;

        int score = stock;

        if(years<=5){
            if(stock>50) score+=20;
        }
        else if(years<=10){
            if(stock>60) score+=10;
        }
        else if(years<=20){
            if(stock>80) score+=5;
        }

        if(volatility.equals("Medium")) score+=10;
        else if(volatility.equals("High")) score+=20;

        if(score>100) score=100;

        String category="";
        if(score<=30) category="Low";
        else if(score<=60) category="Moderate";
        else if(score<=80) category="High";
        else category="Very High";

        String alignment="";
        String recommendation="";
        String rebalance="";

        if(tolerance.equals("Conservative")){
            if(category.equals("Low")){
                alignment="Well Aligned";
                recommendation="Portfolio is appropriately balanced for your profile";
                rebalance="No action needed";
            }
            else if(category.equals("Moderate")){
                alignment="Acceptable";
                recommendation="Monitor risk exposure";
                rebalance="Consider slightly reducing stocks";
            }
            else{
                alignment="Misaligned";
                recommendation="Portfolio risk significantly exceeds tolerance level";
                rebalance="Reduce stocks to 30-40%, increase bonds and cash";
            }
        }

        else if(tolerance.equals("Moderate")){
            if(category.equals("Moderate")){
                alignment="Well Aligned";
                recommendation="Portfolio is appropriately balanced for your profile";
                rebalance="No action needed";
            }
            else if(category.equals("Low")||category.equals("High")){
                alignment="Acceptable";
                recommendation="Portfolio acceptable but may need adjustment";
                rebalance="Review allocation strategy";
            }
            else{
                alignment="Misaligned";
                recommendation="Risk level too high for moderate tolerance";
                rebalance="Reduce stock allocation slightly";
            }
        }

        else{
            if(category.equals("High")||category.equals("Very High")){
                alignment="Well Aligned";
                recommendation="High risk level acceptable given long horizon and tolerance";
                rebalance="Monitor closely, consider slight reduction if volatility persists";
            }
            else if(category.equals("Moderate")){
                alignment="Acceptable";
                recommendation="Consider increasing growth assets";
                rebalance="Increase stocks gradually";
            }
            else{
                alignment="Misaligned";
                recommendation="Portfolio is too conservative for your risk tolerance";
                rebalance="Increase stocks to 80-90% for better growth potential";
            }
        }

        System.out.println("Stock Allocation: "+stock+"%");
        System.out.println("Bond Allocation: "+bond+"%");
        System.out.println("Investment Horizon: "+years+" years");
        System.out.println("Risk Tolerance: "+tolerance);
        System.out.println("Market Volatility: "+volatility);
        System.out.println("Portfolio Risk Score: "+score+"/100");
        System.out.println("Risk Category: "+category);
        System.out.println("Alignment Status: "+alignment);
        System.out.println("Recommendation: "+recommendation);
        System.out.println("Suggested Rebalancing: "+rebalance);
    }
}

package ua.com.juja.core.Week2;

/**
 * Created by andy on 11.04.16.
 *
 * Номинал мелких монет - 1,2,5,10,25,50.
 1 копейку можно разменять 1 разным способом - {1}
 2 - двумя разными способами {1 + 1; 2}
 5 - 4 {1 + 1 + 1 + 1 + 1; 1 + 1 + 1 + 2; 1 + 2 + 2; 5}
 ........
 Сколькими разными способами можно разменятьгривну (100 монет) ?

 Реализовать алгоритм подсчета колличества разных разменов для входящего параметра.
 */

public class ExchangeMoney {
    public static void main(String[] args) {
        int testMoney=100;

        int actualValue=ExchangeMoney.exchangeAmountOfCoinsBrutForce(testMoney);
        System.out.println(actualValue);
    }



    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int[] money = {1, 2, 5, 10, 25, 50};
        int variants = 0;

        if ( amountForExchange <= 0) return 0;

        for (int i1=0; i1<=amountForExchange; i1++)
            for (int i2=0; i2<=amountForExchange/2; i2++)
                for (int i3=0; i3<=amountForExchange/5; i3++)
                    for (int i4=0; i4<=amountForExchange/10; i4++)
                        for (int i5=0; i5<=amountForExchange/25; i5++)
                            for (int i6=0; i6<=amountForExchange/50; i6++) {
                    if (money[0]*i1 + money[1]*i2 + money[2]*i3 + money[3]*i4 + money[4]*i5 + money[5]*i6 == amountForExchange) variants++;
                }

        return variants;
    }
}

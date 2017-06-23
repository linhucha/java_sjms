package strategy;

/**
 * Created by lyj on 2017/6/23.
 */
public class CjMember implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}

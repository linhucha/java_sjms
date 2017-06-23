package strategy;

/**
 * Created by lyj on 2017/6/23.
 */
public class ZjMember implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}

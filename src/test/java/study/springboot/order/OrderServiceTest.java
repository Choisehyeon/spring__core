package study.springboot.order;

import org.junit.jupiter.api.Test;
import study.springboot.member.Grade;
import study.springboot.member.Member;
import study.springboot.member.MemberService;
import study.springboot.member.MemberServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {

        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.회원가입(member);

        //when
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        //then
        assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}

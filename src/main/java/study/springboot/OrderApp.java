package study.springboot;

import study.springboot.member.Grade;
import study.springboot.member.Member;
import study.springboot.member.MemberService;
import study.springboot.member.MemberServiceImpl;
import study.springboot.order.Order;
import study.springboot.order.OrderService;
import study.springboot.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.회원가입(member);

        Order order = orderService.createOrder(memberId, "memberA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());


    }
}

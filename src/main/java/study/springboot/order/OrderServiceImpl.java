package study.springboot.order;

import study.springboot.discount.DiscountPolicy;
import study.springboot.discount.FixDiscountPolicy;
import study.springboot.member.Member;
import study.springboot.member.MemberRepository;
import study.springboot.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);

    }
}

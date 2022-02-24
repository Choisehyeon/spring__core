package study.springboot;

import study.springboot.member.Grade;
import study.springboot.member.Member;
import study.springboot.member.MemberService;
import study.springboot.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.회원가입(memberA);

        Member findMember = memberService.회원조회(1L);
        System.out.println("findMember = " + findMember.getName());
        System.out.println("memberA = " + memberA.getName());
    }

}

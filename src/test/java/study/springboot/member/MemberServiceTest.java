package study.springboot.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void _회원가입_() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.회원가입(member);
        Member findMember = memberService.회원조회(1L);

        //then
        assertThat(member).isEqualTo(findMember);
    }
}

package study.springboot.member;

public interface MemberService {

    void 회원가입(Member member);

    Member 회원조회(Long memberId);
}

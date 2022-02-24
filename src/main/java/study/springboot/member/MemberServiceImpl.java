package study.springboot.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void 회원가입(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member 회원조회(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

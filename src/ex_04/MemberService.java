package ex_04;

import java.util.List;

public class MemberService {

    private MemberDao dao = new MemberDao();

    public void registerMember(String id, String name) {
        Member newMember = new Member(id, name);
        dao.insert(newMember);
    }

    public void printAllMembers() {
        List<Member> members = dao.findAll();
        // 향상된 for문
        for (Member member : members) {
            System.out.println("ID: " + member.getId() + ", 이름: " + member.getName());
        }
    }
}

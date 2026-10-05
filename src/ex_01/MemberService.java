package ex_01;

public class MemberService {

    private MemberDao dao = new MemberDao();

    public void registerMember(String id, String name) {
        Member newMember = new Member(id, name);
        dao.insert(newMember);
    }
}

package construct;

public class MethodInit {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.initMember("지유", 24, 100);
        MemberInit m2 = new MemberInit();
        m2.initMember("토토", 2, 0);

        MemberInit[] members = {m1, m2};
        for(MemberInit m : members){
            System.out.println("이름:" + m.name + " 나이:" + m.age + " 성적:" + m.grade);
        }
    }
}
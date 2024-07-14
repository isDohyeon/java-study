package level1.final1.ex1;

public class MemberMain {

    public static void main(String[] args) {
        Member member1 = new Member("myID", "name");
        member1.print();
        member1.changeData("changeId", "name2");
        member1.print();
    }
}

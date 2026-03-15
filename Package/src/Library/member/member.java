package Library.member;

public class member {
    String memberName;
    int memberId;
    public void registerMember(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
        System.out.println("Member Registered:");
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }
}
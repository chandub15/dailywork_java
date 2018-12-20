

public class Member extends MemberVar{

    public static void main(String[] args) {

        MemberVar m=new MemberVar();
        m.setName("Chandu");
        m.setAge(30);
        m.setSal(24313.032);

        System.out.println("Member name: "+m.getName());
        System.out.println("Member age: "+m.getAge());
        System.out.println("Member salary: "+m.getSal());

    }
}
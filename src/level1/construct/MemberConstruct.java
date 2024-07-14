package level1.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출, 이름 : " + grade + "나이 : " + age + "성적 : " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

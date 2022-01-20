package equals.and.hashcode;

public class MainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("John");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("John");
        System.out.println("e1 and e2 objects are created.");

        System.out.println("Between e1 and e2 Shallow compare e1==e2 returns "+ (e1==e2));
        System.out.println("Deep compare between e1 and e2 returns " + (e1.equals(e2))+" ,e1 hashcode:"+e1.hashCode()+" ,e2 hashcode"+e2.hashCode());
    }
}

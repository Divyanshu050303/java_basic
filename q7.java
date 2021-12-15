package timesss;

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        String ans;
        if (age < 13) {
            ans = "You are young.";
        } else if (age >= 13 && age < 18) {
            ans = "You are a teenager.";
        } else {
            ans = "You are old.";
        }
        System.out.println(ans);
    }

    public void yearPasses() {
        age += 1;
    }
}
public  class q7 {
    public static void main(String[] args) {
        Person p = new Person(18);
        p.amIOld();
        p.yearPasses();
    }
}
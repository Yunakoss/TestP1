package lesson3;

public class M4Assignment {
    public static void main(String[] args) {
        M4Assignment m4Assignment = new M4Assignment();
        m4Assignment.stringContains();
    }

    public void stringContains() {
        String txt1 = "Category";
        String txt2 = "Cat";

        if (txt1.equals(txt2)) ;
        {
            System.out.println("Cat is the part of Category");
        }
        if (txt2.contains(txt1)) {
            System.out.println("The Strings are the same");
        } else {
            System.out.println("Cannot compare Strings");
        }
    }
}


package acadamy.learningKotlinProgramming.JavaKotlinInteroperability;

public class MyJavaFile {

    public static void main(String[] args) {
        int sum = MyFileKt.add(3,5);
        System.out.println("The sum of a and b is: "+sum);
    }

    public  static int getArea(int l, int w) {
        return l * w;
    }
}


public class Reverse_String {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String arr[] = s.split("\\."); // it will separated by . thats why we use \\.
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans = arr[i] + "." + ans;
        }
        System.out.println(ans.substring(0, s.length()));

    }

}

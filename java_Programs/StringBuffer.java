public class StringBuffer {
    public static void main(String[] args){
        java.lang.StringBuffer sbf = new java.lang.StringBuffer("Hello");
        sbf.append("world");
        sbf.reverse();
        System.out.println(sbf);
    }
}
public class StringBuilder {
    public static void main(String[] args){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        sb.append("World");
        sb.insert(5,"Java");
        sb.delete(0 , 5);
        sb.reverse();
        System.out.println(sb);
    }
}
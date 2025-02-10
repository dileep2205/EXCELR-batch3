public class Demo005 {
    public static void main(String[] args) {
        String username = "123456";
        String pwd = "1234";
        while((username == "123456") && (pwd == "1234")) {
            System.out.println("Hello User");
            break;
        }
    }
}

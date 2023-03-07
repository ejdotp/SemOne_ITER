public class randy {
    public static void main(String[] args) {
        int x=20;
        int y = 25;
        System.out.println(++x<(y=y-=4) || (x=x+=4)>y);
    }
}

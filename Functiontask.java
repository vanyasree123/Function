public class Functiontask {
    static int a=10;
    public static void main(String[] args) {
        System.err.println("hai," +a);
        Greet ab=new Greet();
        Greet.Mess ac=new Greet.Mess();
        System.out.printf("welcome back %d",ab.b);
        System.out.printf("welcome back %d",ab.ac.Gt(a));
    }   
}
class Greet{
    int b=20;
    static void Msg(){
        System.out.println("hello,");
    }
    public class Mess{
        public int Gt(int a){
            System.out.println("welcome"+a);
            return b;
        }
    }
}

public class Bob {
// access modifier
//    |
//    |   return type
//    |     |
//    |     |   method name (class function)
//    |     |     |
//    V     V     V
    public void sayHi(String name) {
        System.out.println("hi " + name);
    }

    public int sum(int x,int y) {
        int sum = x+ y;
        return sum;
    }

}
public class test {
    private test(){
    }
    static test t = new test();
    public static test t(){
        return t;
    }
    private static final int c = 41;
     static public void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("This is only a");
        sb.append("simple");
        sb.append("test");
    }
}

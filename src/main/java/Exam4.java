import java.util.*;

public class Exam4 {
    public static List<Integer> getRandomNum(){
        Random random = new Random();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static void main(String[] args) {
        Map<Integer,List<Integer>> map = new HashMap();
        List<Integer> list = Exam4.getRandomNum();
        System.out.println("随机生成50个小于100的数,分别为:"+list.toString());
        for (int i:list) {
            map.put(i/10,new ArrayList());
        }
        for (int i:list) {
            map.get(i/10).add(i);
        }
        System.out.println("Map中的数据为:"+map.toString());
        for (int i:map.keySet()) {
            Collections.sort(map.get(i));
        }
        System.out.println("排序后的Map为: "+map);
    }
}

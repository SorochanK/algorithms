import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        Tmp tmp = new Tmp();
        List<String> l = tmp.getList();
        l.add("one item");
        System.out.println(tmp.getList());

        HashMap<String, String> m = new HashMap<>();
        m.put("a","b");

        TreeSet<String> s = new TreeSet<>();
        s.add("a");
    }

    static class Tmp {
        private List<String> list = new ArrayList<>();

        public List<String> getList() {
            return new ArrayList<>(list);
        }

        public void setList(List<String> list) {
            this.list = list;
        }
    }
}

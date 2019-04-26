import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

         String name;

         name=null;

        ceshi(name);


        User user1 = new User(1, "u1", "shenyang", "hahaha");
        User user2 = new User(2, "u2", "shenyang", "gaga");
        User user3 = new User(3, "u3", "shanghai", "lala");
        User user4 = new User(4, "u4", "shanghai", "hahaha");
        User user5 = new User(5, "u5", "shenyang", "gaga");
        User user6 = new User(6, "u6", "shanghai", "hahaha");
        User user7 = new User(7, "u7", "beijing", "gaga");
        User user8 = new User(8, "u8", "beijing", "hahaha");
        User user9 = new User(9, "u9", "shenyang", "lala");
        List<User>  deviceIdsssss=new ArrayList<>();
        deviceIdsssss.add(user1);
        deviceIdsssss.add(user2 );
        deviceIdsssss.add(user3);
        deviceIdsssss.add(user4);
        deviceIdsssss.add(user5 );
        deviceIdsssss.add(user6);
        deviceIdsssss.add(user7);
        deviceIdsssss.add(user8 );
        deviceIdsssss.add(user9);
        String[] deviceIds = {""};

        deviceIdsssss.forEach(item -> {
            deviceIds[0] += item.getName()+",";
        });
        if(StringUtils.isBlank( deviceIds[0])){
            System.out.println("aliyun  push  exception deviceIds  为空");
            System.out.println("aliyun  push  exception deviceIds  为空");
            return;
        }
        String deviceIds0=deviceIds[0];
        deviceIds0= deviceIds0.substring(0,deviceIds0.length() - 1);



        Integer[] a={100, 200, 300, 400, 500};
        // 新方法：
        List<Integer> costBeforeTax = Arrays.asList(a);

        double bill = costBeforeTax.stream().reduce((sum, cost) -> sum + cost).get();

        IntSummaryStatistics intSummaryStatistics = costBeforeTax.stream().map(e -> e + 1).filter(e -> e > 300).mapToInt(e -> e).summaryStatistics();

        System.out.println("Total : " + intSummaryStatistics.getSum());




        List<String> arg1 = new ArrayList<>();
        arg1.add("wangpw1");
        arg1.add("wangpw2");
        List<String> arg2 = new ArrayList<>();
        arg2.add("wangpw1");
        arg2.add("wangpw3");

        List<String> jiguo = new TestArray<String>().trst1(arg1, arg2);

        arg1.stream().map((e) -> e+"---->map").forEach(e-> System.out.println(e));

        arg1= arg1.stream().filter(

                (e1) -> {

                    return !jiguo.contains(e1);

                }

        ).collect(Collectors.toList());//.forEach(e-> System.out.printf(e));



        arg2=arg2.stream().filter(

                (e1) -> {

                    return !jiguo.contains(e1);

                }

        ).collect(Collectors.toList());//.forEach(e-> System.out.printf(e));



        List<User> lis = new ArrayList<>();
        lis.add(user1);
        lis.add(user2);
        lis.add(user3);
        lis.add(user4);
        List<User> lis2 = new ArrayList<>();
        lis2.add(user5);
        lis2.add(user6);
        lis2.add(user7);
        lis2.add(user8);
        lis2.add(user9);

        List<List<User>> collect = Stream.of(lis, lis2).collect(Collectors.toList());
        List<User> figures = Stream.of(lis, lis2).flatMap(u -> u.stream()).collect(Collectors.toList());
        figures.forEach(f -> System.out.println(f.getName()));






    }

    public static  void  ceshi (String  name){

        System.out.println(name);

    }




    public static <T> List<T> trst1(List<T> arg1, List<T> arg2) {

        List<T> arg3 = new ArrayList<>();

        arg1.stream().forEach(

                (e1) -> {

                    if (arg2.contains(e1)) {

                        arg3.add(e1);
                    }

                }
        );

        return arg3;
    }

}


class TestArray<T> {


    public List<T> trst1(List<T> arg1, List<T> arg2) {

        List<T> arg3 = new ArrayList<>();

        arg1.stream().forEach(

                (e1) -> {

                    if (arg2.contains(e1)) {

                        arg3.add(e1);
                    }

                }
        );

        return arg3;
    }
}


    class User {

        private Integer id;
        private String name;
        private String sping;
        private String  tomcat;

        public User(Integer id, String name, String sping, String tomcat) {
            this.id = id;
            this.name = name;
            this.sping = sping;
            this.tomcat = tomcat;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSping() {
            return sping;
        }

        public void setSping(String sping) {
            this.sping = sping;
        }

        public String getTomcat() {
            return tomcat;
        }

        public void setTomcat(String tomcat) {
            this.tomcat = tomcat;
        }
    }

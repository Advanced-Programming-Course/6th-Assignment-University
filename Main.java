public class Main {
    public static void main(String[]args) {

        Human student = new Student();
        Human professor = new Professor();
        //بله بودند و خروجی true برای هردو چاپ شد

        System.out.println(student instanceof Human);
        System.out.println(professor instanceof Human);

        Human human = new Student();
        human.sayMyName();
        // خروجی چاپ شده : null

        Human human1 = new Professor();
        human1.sayMyName();
        // خروجی چاپ شده:null
        //null

/*
     دو سوال بالا نشان داد که تا وقتی که ورودی به متد sayName
 داده نشود خروجی را بصورت پیش فرض null چاپ می کند و همچنین دو کلاس Student , Professor  بصورت مجزا از کلاس Human
     ارث بری می کنند
  */

    }

}

package exercise1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Professor professor = new Professor();

        String result1 = (student instanceof Human)? "student an instance of Human" : "Student is not an instance of Human.";
        System.out.println(result1);
        String result2 = (professor instanceof Human)? "professor an instance of Human" : "professor is not an instance of Human.";
        System.out.println(result2);

        Human human1 = new Student("negin Ahmadi", 11111, "major", "university");
        Human human2 = new Professor("name_one", "Specialty", "faculty", 2);

        human1.sayMyName();
        human2.sayMyName();
        /* 9
کد بالا نمونه ای از چند شکلی در برنامه نویسی هست
 هر 2 کلاس از کلاس Human ارث بری کرده اند برای همین میتوان
 یک شی از کلاس Human ساخت که با کلاس هایی که از ان ارث برده اند مقدار دهی میشود
 اما متد های ان با توجه به کلاس مربوط مجدد نوشته شده می شوند برای همین
 sayMyName
 خروجی های متفاوتی بر اساس چیزی که در کلاس های ارث برده شده نوشته شده نشان میدهد
        */
    }
}

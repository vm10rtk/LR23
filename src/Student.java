abstract public class Student implements Learner,Object{
    protected String FIO;
    protected String Gender;
    protected int age;
    protected int Group_number;
    protected String Faculty;
    protected String Spec;
    Student(){
        this.FIO = "n/a";
        this.age = 0;
        this.Gender = "n/a";
        this.Group_number = 0;
        this.Faculty = "n/a";
        this.Spec = "n/a";
        //educational_institution();
    }
    Student(String FIO,int age,String F,String S,int G){
        this.FIO = FIO;
        this.age = age;
        this.Gender = "n/a";
        this.Group_number = G;
        this.Faculty = F;
        this.Spec = S;
    }
    Student(String FIO,int age,String gender,String F,String S,int G){
        this.FIO = FIO;
        this.age = age;
        this.Gender = gender;
        this.Group_number = G;
        this.Faculty = F;
        this.Spec = S;
    }

    public String getGender() {
        return Gender;
    }

    public int getAge() {
        return age;
    }

    public String getFIO() {
        return FIO;
    }

    public void getGroup_number() {
        System.out.println(this.Group_number);
    }

    public void getFaculty() {
        System.out.println(this.Faculty);
    }

    public void getSpec() {
        System.out.println(this.Spec);
    }

    @Override
    public void institution() {
        System.out.println("Институт");
    }

    @Override
    public void print() {
        getAge();
        getFaculty();
        getSpec();
        getFIO();
        getGroup_number();
        getGender();
    }


}

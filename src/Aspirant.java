public class Aspirant implements Learner,Object{
    private String FIO;
    private String Gender;
    private int age;
    private String Science_W_N;
    private String Science_W_H;
    Aspirant(){
        this.FIO = "n/a";
        this.age = 0;
        this.Gender = "n/a";
        this.Science_W_N = "n/a";
        this.Science_W_H = "n/a";
        //educational_institution();
    }
    Aspirant(String FIO,int age){
        this.FIO = FIO;
        this.age = age;
        this.Gender = "n/a";
        this.Science_W_N = "n/a";
        this.Science_W_H = "n/a";
    }
    Aspirant(String FIO,int age,String gender,String C_l,String C_N){
        this.FIO = FIO;
        this.age = age;
        this.Gender = gender;
        this.Science_W_N = C_l;
        this.Science_W_H = C_N;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setScience_W_H(String science_W_H) {
        Science_W_H = science_W_H;
    }

    public void setScience_W_N(String science_W_N) {
        Science_W_N = science_W_N;
    }

    public String getGender() {
        return Gender;
    }

    public String getFIO() {
        return FIO;
    }

    public int getAge() {
        return age;
    }

    public String getScience_W_H() {
        return Science_W_H;
    }

    public String getScience_W_N() {
        return Science_W_N;
    }

    @Override
    public void institution() {
        System.out.println("Институт");
    }

    @Override
    public void print() {
    getAge();
    getFIO();
    getGender();
    getScience_W_H();
    getScience_W_N();
    }


}

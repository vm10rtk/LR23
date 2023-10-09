public class Pupil implements Learner,Object{
    private String FIO;
    private String Gender;
    private int age;
        private int Class_number;
        private String Class_letter;
        Pupil(){
            this.FIO = "n/a";
            this.age = 0;
            this.Gender = "n/a";
            this.Class_letter = "n/a";
            this.Class_number = 0;
            //educational_institution();
        }
        Pupil(String FIO,int age,String C_l,int C_N){
            this.FIO = FIO;
            this.age = age;
            this.Gender = "n/a";
            this.Class_letter = C_l;
            this.Class_number = C_N;
        }
        Pupil(String FIO,int age,String gender,String C_l,int C_N){
            this.FIO = FIO;
            this.age = age;
            this.Gender = gender;
            this.Class_letter = C_l;
            this.Class_number = C_N;
        }


    public int getAge() {
        return age;
    }

    public String getFIO() {
        return FIO;
    }

    public String getGender() {
        return Gender;
    }

    public void getClass_letter() {
            System.out.println("class name - "+this.Class_number);
        }

        public void getClass_number() {
            System.out.println("class number - "+this.Class_letter);
        }



    @Override
    public void institution() {
        System.out.println("Школа");
    }

    @Override
    public void print() {
    getClass_number();
    getAge();
    getClass_letter();
    getGender();
    getClass_number();

    }
}

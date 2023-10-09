public class StuDay extends Student{
    private String Stype ;

    StuDay(){
        this.FIO = "n/a";
        this.age = 0;
        this.Gender = "n/a";
        this.Group_number = 0;
        this.Faculty = "n/a";
        this.Spec = "n/a";
        this.Stype= "day";
    }
    StuDay(String FIO,int age,String F,String S,int G){
        this.FIO = FIO;
        this.age = age;
        this.Gender = "n/a";
        this.Group_number = G;
        this.Faculty = F;
        this.Spec = S;
        this.Stype= "day";
    }
    StuDay(String FIO,int age,String gender,String F,String S,int G){
        this.FIO = FIO;
        this.age = age;
        this.Gender = gender;
        this.Group_number = G;
        this.Faculty = F;
        this.Spec = S;
        this.Stype= "day";
    }


    @Override
    public void print() {
        super.print();
        };
    @Override
    public void institution() {
        super.institution();{
            System.out.println("institute");
        }
    }
    }


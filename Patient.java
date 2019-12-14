public class Patient {
    int idNum;
    int age;
    String type;
    String rh;

    public Patient(){
        this.idNum = 0;
        this.age = 0;
        this.type = "O";
        this.rh = "+";
    }

    public Patient(int num){
        this.idNum = num;
        this.age = 0;
        this.type = "O";
        this.rh = "+";
    }

    public Patient(int num, int age){
        this.idNum = num;
        this.age = age;
        this.type = "O";
        this.rh = "+";
    }

    public Patient(int num, int age, String type){
        this.idNum = num;
        this.age = age;
        this.type = type;
        this.rh = "+";
    }

    public Patient(int num, int age, String type, String rh){
        this.idNum = num;
        this.age = age;
        this.type = type;
        this.rh = rh;
    }

    public String getIdNum(){
        return "The ID Number is: "+idNum;
    }

    public void setIdNum(int newIdNum){
        idNum = newIdNum;
    }

    public String getAge(){
        return "Your Age is: "+age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public String getType(){
        return "The blood type is: "+type;
    }

    public void setType(String newType){
        type = newType;
    }

    public String getRh(){
        return "The Rh is: "+rh;
    }

    public void setRh(String newRh){
        rh = newRh;
    }

    public String toString(){
        return "ID number: "+idNum+"\nAge: "+age+"\nBlood type: "+type+"\nRh: "+rh+"\n";
    }
}

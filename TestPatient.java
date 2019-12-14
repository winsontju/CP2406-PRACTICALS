public class TestPatient {
    public static void main(String [] args){
        Patient patient1 = new Patient();
        Patient patient2 = new Patient(1);
        Patient patient3 = new Patient(2, 10);
        Patient patient4 = new Patient(3, 15, "B");
        Patient patient5 = new Patient(4, 20, "AB","-");
        System.out.println(patient1.toString());
        System.out.println(patient2.toString());
        System.out.println(patient3.toString());
        System.out.println(patient4.toString());
        System.out.println(patient5.toString());
        patient1.setIdNum(20);
        patient1.setAge(30);
        patient1.setType("A");
        patient1.setRh("-");
        System.out.println(patient1.getIdNum());
        System.out.println(patient1.getAge());
        System.out.println(patient1.getType());
        System.out.println(patient1.getRh());
    }
}

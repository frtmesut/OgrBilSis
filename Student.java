package ogrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3, int quiz1, int quiz2, int quiz3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (quiz1 >= 0 && quiz1 <= 100) {
            this.c1.quiz = quiz1;
        }
        if (quiz2 >= 0 && quiz2 <= 100) {
            this.c2.quiz = quiz2;
        }
        if (quiz3 >= 0 && quiz3 <= 100) {
            this.c3.quiz = quiz3;
        }
    }

    void isPass() {
        System.out.println("===============");
        this.avarage = ((this.c1.note * 0.8 + this.c1.quiz * 0.2) + (this.c2.note * 0.8 + this.c2.quiz * 0.2) + (this.c3.note * 0.8 + this.c3.quiz * 0.2)) / 3.00;
        if (this.avarage > 55) {
            System.out.println("Sınıfı geçtiniz !");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız !");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.name + " Sınav Notu\t :" + this.c1.note + "\nSözlü Notu\t :" + this.c1.quiz);
        System.out.println(c2.name + " Sınav Notu\t :" + this.c2.note + "\nSözlü Notu\t :" + this.c2.quiz);
        System.out.println(c3.name + " Sınav Notu\t :" + this.c3.note + "\nSözlü Notu\t :" + this.c3.quiz);
        System.out.println("Ortalamanız " + this.avarage);
    }


}

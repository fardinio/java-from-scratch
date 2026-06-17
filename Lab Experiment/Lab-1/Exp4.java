
public class Exp4 {
    public static void main(String[] args){
        float attendence = 90f;
        float assignment = 85.4f;
        float labexercise = (23f /26f )*100f;
        float examnum =(((76 + 88 + 82) / 3f) / 90f ) * 100f;

        float attenGrade = attendence * (10/100f);
        float assiGrade = assignment * (17/100f);
        float labGrade = labexercise * (13/100f);
        float examGrade = examnum * (60/100f);

        float finalgrade = attenGrade + assiGrade + labGrade + examGrade ;
        System.out.println("Final Grade: " + finalgrade);
    }
}

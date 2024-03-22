package class_supplementary;

import java.util.Date;

class Participation {
    String name;
    String profile;
    String email;
    Date time;
}

class Math {
    int add (int a, int b) {
        return a + b;
    }

    int division (int a, int b) {
        return a / b;
    }
}

public class variable {
    
    public static void main(String[] args) {
        
        // String name1 = "김민철";
        // String name2 = "김다인";
        // String name3 = "엄수현";
        // String name4 = "박영근";
        // String name5 = "고동현";
        // String name6 = "정영종";
        // String name7 = "장현아";

        String[] names = {"김민철", "김다인", "엄수현", "박영근", "고동현"};

        // String name = "김민철";
        // String profile = "https://~~~";
        // String email = "email";
        // Date time = new Date(); 

        Participation participation1 = new Participation();
        participation1.name = "고동현";
        participation1.profile = "https://~~~";
        participation1.email = "email";
        participation1.time = new Date();

        Participation participation2 = new Participation();
        participation2.name = "김다인";
        participation2.profile = "https://~~~";
        participation2.email = "email";
        participation2.time = new Date();
        
        Participation[] participations = new Participation[19];

        for (int index = 0; index < participations.length; index++) {
            Participation participation = new Participation();
            participations[index] = participation;
        }


    }

}

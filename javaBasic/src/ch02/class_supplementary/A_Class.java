package class_supplementary;

// Class : 공통적 성질을 가진 대상들을 정의, 현실 세계 주체의 정보를 표현하는 방법 
// 접근제어자 일반제어자 class 클래스명 { ... } 
class ClassName {
    //# 속성 (변수) : 현실 세계 주체가 가질수 있는 정보나 상태 
    //# 기능 (메서드) : 현실 세계 주체가 행할수 있는 동작이나 행동 

    //# 생성자 : 인스턴스를 생성할 때 실행될 작업을 정의한 특별한 메서드 
    //# 클래스명과 동일한 이름, 반환타입 X 
    //# 생성자를 개발자가 작성하지 하지않으면 자바 컴파일러가 자동으로 기본생성자 생성 
    //# 개발자가 생성자를 작성하면 자동으로 기본생성자를 만드는 행위를 컴파일러가 하지않음 
    ClassName () {

    }
    //# 오버라이딩: 같은 이름의 메서드를 매개변수의 조합만 다르게 하여 여러개 정의하는 것 
    void method () {
        System.out.println("출력합니다.");
    }
    void method (String arg) {
        System.out.println(arg + " 출력합니다.");
    }
}

//# 이력서 표현 Resume 
class Resume {
    String koreanName;
    String englishName;
    String contact;
    String email;
    String address;
    String profileImage;
    EducationHistory[] educationHistories;
    ExperienceHistory[] experienceHistories;
    Certificate[] certificates;
    String writeDate;
    String writer;

    Resume () {}
    Resume (String koreanName, String englishName, 
            String contact, String email, String profileImage) {
        this.koreanName = koreanName;
        this.englishName = englishName;
        this.contact = contact;
        this.email = email;
        this.profileImage = profileImage;
    }
}

class EducationHistory {
    String period;
    String schoolName;
    String major;
    double credit;
    double totalCredit;
    boolean isGraduation;

    EducationHistory (String period, String schoolName, String major, double credit, double totalCredit, boolean isGraduation) {
        this.period = period;
        this.schoolName = schoolName;
        this.major = major;
        this.credit = credit;
        this.totalCredit = totalCredit;
        this.isGraduation = isGraduation;
    }
}

class ExperienceHistory {
    String period;
    String workPlace;
    String position;
    String businessDetail;
}

class Certificate {
    String acquisitionDate;
    String name;
    String level;
    String issuePlace;
}

class User {
    String id;
    String password;
    String name;
}

//# class: 회원관리 
class UserManagement {
    //# 회원 등록 
    void userRegist (String id, String password, String name) {
        //# 회원 등록 작업
    }

    //# 회원 정보보기 
    User getUser (String id) {
        return new User();
    }

    //# 회원 정보수정 
    void userUpdate (String id, String password, String name) {
        //# 회원 수정 작업
    }

    //# 회원 정보삭제 
    void userDelete (String id) {
        //# 회원 삭제 작업
    }
}

public class A_Class {
    public static void main(String[] args) {
        
        Resume seojihoon = new Resume("서지훈", "SEO JI HOON", "01011111111", "부산광역시 진구 에원프라자 4층", "http://~");
        // seojihoon.koreanName = "서지훈";
        // seojihoon.englishName = "SEO JI HOON";
        // seojihoon.contact = "01011111111";
        // seojihoon.address = "부산광역시 진구 에원프라자 4층";
        // seojihoon.profileImage = "";

        Resume godonghyeun = new Resume("고동현", "GO DONG HYUEN", "01011111111", "부산광역시 진구 에원프라자 4층", "http://~");
        // seojihoon.koreanName = "고동현";
        // seojihoon.englishName = "GO DONG HYUEN";
        // seojihoon.contact = "01011111111";
        // seojihoon.address = "부산광역시 진구 에원프라자 4층";
        // seojihoon.profileImage = "data:image/jpeg;bas";



    }
}

//주문 인터페이스
interface spell{
        
    public abstract void attack();
    public abstract void defend();
    public abstract void speak();

}

//마법사 추상클래스
abstract class wizard{
    String name;//이름
    String sex;//성별
} 

//마법사 추상클래스와 주문 인터페이스 상속받은 해리포터 클래스
class HarryPotter extends wizard implements spell{
    
    HarryPotter(){
        name = "해리포터";
        sex = "남성";
    }

    //상속받은 인터페이스 구체화-인터페이스는 청사진, 즉 도면같은 거라 대략적인 것만 구현이 되어있고 그 자세한 내용은 클래스로 구현한다.
    public void speak(){
        System.out.println("명대사: 입닥쳐 말포이");
    }
    public void attack(){
        System.out.println("무장해제 마법");
    }
    public void defend(){
        System.out.println("어둠의 마법 방어술");
    }
}

//헤르미온느 클래스
class Hermione extends wizard implements spell{

    Hermione(){
        name = "헤르미온느";
        sex = "여성";
    }

    public void speak(){
        System.out.println("명대사: 뛰어!");
    }
    public void attack(){
        System.out.println("기절마법");
    }

    public void defend(){
        System.out.println("어둠의 마법 방어술");
    }
}

//볼드모트 클래스
class Voldemort extends wizard implements spell{

    Voldemort(){
        name = "볼드모트";
        sex = "남성";
    }

    public void speak(){
        System.out.println("명대사: 죽어라");
    }
    public void attack(){
        System.out.println("살인마법");
    }
    public void defend(){
        System.out.println("반사마법");
    }

}

//메인 클래스
class Main {

    public static void main(String[] args) {

        //객체화
        HarryPotter hp = new HarryPotter();
        Hermione hm = new Hermione();
        Voldemort vm = new Voldemort();

        //해리포터 객체에 대한 메서드 및 상수 호출
        System.out.println("이름: "+hp.name);
        System.out.println("성별: "+hp.sex);
        hp.speak();
        hp.attack();
        hp.defend();

        //헤르미온느 객체에 대한 메서드 및 상수 호출
        System.out.println("이름: "+hm.name);
        System.out.println("성별: "+hm.sex);
        hm.speak();
        hm.attack();
        hm.defend();

        //볼드모트 객체에 대한 메서드 및 상수 호출
        System.out.println("이름: "+vm.name);
        System.out.println("성별: "+vm.sex);
        vm.speak();
        vm.attack();
        vm.defend();

    }
}
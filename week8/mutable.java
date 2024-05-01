class Immutable{
    private final String a="durga";
    Immutable(String a){
        
    }
    void display(){
        System.out.println("Name : "+a);
    }
}

public class MutableandImmutable {
    public static void main(String[] args) {
        //Mutable Object
        StringBuilder obj=new StringBuilder("durga");
        obj.append(" ");
        obj.append("prasad");
        String a=obj.toString();
        System.out.println("Modified string : "+a);
        //Immutable object
        Immutable obj1=new Immutable("noo end");
        obj1.display();
    }
}


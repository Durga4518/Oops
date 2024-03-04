class Public 
{ 
public 
    String publicname="durga"; 
private 
    int privateroll=547; 
protected 
    int protectedcode=33; 
public 
    int getPrivate()
    { 
        return privateroll; 
    } 
} 
class InheritanceAccess 
{ 
    public static void main(String[] args) 
    { 
        Public pub=new Public(); 
        System.out.print("Public : "+pub.publicname+"\n"); 
        System.out.print("Protected : "+pub.protectedcode+"\n"); 
    } 
}

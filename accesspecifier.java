class AccessSpecifier{
    private int priVar;
    protected int proVar;
    public int pubVar;
    public void setVar(int priValue ,int proValue ,int pubValue)
    {
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;

    }
    public void getVar(){
        System.out.println("private : " +priVar);
        System.out.println("protected : " +proVar);
        System.out.println("public : " +pubVar);


    }
}

class AccessSpecifierDemo{ 
    public static void main(String[] args){
        AccessSpecifier obj=new AccessSpecifier();
        obj.setVar(47,17,42);
        obj.getVar();

    }

}

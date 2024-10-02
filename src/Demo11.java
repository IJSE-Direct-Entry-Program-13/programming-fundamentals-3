class Demo11 {

    void main(){
        myInstanceMethod(10, 20);
    }

    void myInstanceMethod(Demo11 this, int x, int y){
        System.out.println(this);
        System.out.println(x);
        System.out.println(y);
    }

//    static void myStaticMethod(Demo11 this){
//
//    }

}
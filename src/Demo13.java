class Demo13{

    public Demo13(/*Demo13 this*/) {
    }

    public static void myStaticMethod(/*Demo13 this*/){}
    public void myInstanceMethod1(Demo13 this){}
    public void myInstanceMethod2(Demo13 Demo13.this){}

    class Inner{
        class A{
            public A(Inner Inner.this){}
            class B{
                public B(A A.this){}
                void myMethodB(B this){}
            }
        }
    }
}
// Top Level Class
class Demo12 {

}

// Top Level Class
class MyOuterClass {

    // OuterClass Constructor Method (Instance Method)
    public MyOuterClass(/* MyOuterClass this */) {
        // This syntax is not valid within top level classes' constructor
    }

    public void myMethod(MyOuterClass this){
    }

    // Nested Class == Inner Class
    class MyInnerClass {

        // InnerClass Constructor Method (Instance Method)
//        public MyInnerClass(MyInnerClass this) {
//        }

        public MyInnerClass(MyOuterClass MyOuterClass.this) {
        }

        public void myMethod2(MyInnerClass this){
        }

//        public void myMethod3(MyOuterClass MyOuterClass.this){
//        }
    }

}
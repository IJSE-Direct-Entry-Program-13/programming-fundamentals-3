// Non-Generic Method
void main(){
}

// Generic Method
public <T> void myMethod(){
}

protected static <Id, Pk, Name, TypeParameter> void myMethod2(){
}

public synchronized <T, K> void myMethod3(){
}

private <$> void myMethod4(){}
private <Name123, Customer123> void myMethod5(){}
// private <?> void myMethod6(){}
// private <_> void myMethod7(){}
private <Customer_Name> void myMethod8(){}
//private <123> void myMethod9(){}

class MyClass1{}
class MyClass2{}
interface MyInterface1{}
interface MyInterface2{}
enum MyEnum{}
record MyRecord(){}
@interface MyAnnotation{}

public native <T, K extends MyClass1, M> void myMethod10();
public native <T, K extends MyClass1 & MyInterface1 & MyInterface2, M> void myMethod11();
//public native <T, K extends MyClass1 & MyClass2, M> void myMethod12();
//public native <T, K extends MyClass1 & MyEnum, M> void myMethod12();
//public native <T, K extends MyClass1 & MyRecord, M> void myMethod12();
public native <T, K extends MyClass1 & MyAnnotation & MyInterface2, M extends MyInterface2> void myMethod12();
import java.io.Serializable;
import java.sql.SQLException;

void main(){
    // myMethod();
   // myMethod3();
}

void myMethod1() throws Throwable, ClassNotFoundException, SQLException, Error {

}

<T extends Throwable, K extends SQLException> void myMethod2() throws ClassNotFoundException, T, K{

}

void myMethod3() throws ClassNotFoundException{

}
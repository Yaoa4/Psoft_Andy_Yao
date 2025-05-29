import org.openjdk.jol.vm.VM;

/*

To set up JOL https://openjdk.java.net/projects/code-tools/jol/
---------------------------------------------------------------
* Download from https://github.com/openjdk/jol
* Unpack into some local directory
* Build with mvn clean install
* Copy jol-core-0.17-SNAPSHOT.jar from jol-master\jol-core\target\ to your current directory where HelloWorld.java is.

To compile:
javac -cp jol-core-0.17-SNAPSHOT.jar/;. HelloWorld.java

To run:
java -cp jol-core-0.17-SNAPSHOT.jar/;. HelloWorld

To disassemble:
javap -verbose HelloWorld.class

*/

// More details: https://metebalci.com/blog/digging-into-jep-280-indify-string-concatenation/

//commiting a change on my end - andy
class MyString {

}

class HelloWorld {
  static {
    System.out.println("hello world");
  }
  public static void main(String... args) {
    HelloWorld hw = new HelloWorld();
    System.out.println(hw);
  }
}
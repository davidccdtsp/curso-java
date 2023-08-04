package tema08;
import controlAcceso.Sample;  // Imports class from package

public class Child extends Sample{

    // Method 1
    void helper()
    {
        // Creating instance of Child class inside main()
        Child myself = new Child();
 
        // As Child is sub-class of Sample, we can access
        // the static variable here
        System.out.println(Sample.title);
 
        // This will compile fine as we are accessing year
        // using child class reference variable
        System.out.println(year);
        System.out.println(myself.year);
 
        // This will compile fine as we are accessing
        // printYear() method using child class reference
        // variable
        printYear();
        myself.printYear();
 
        // Creating parent class object
        Sample sample = new Sample();
 
        // Parent class reference holding child class object
        Sample child = new Child();
 
        // Note: Below lines of code won't compile as we are
        // trying to access protected members of parent
        // class using Parent's class reference which is
        // present in other package
 
        // Errors will be thrown
        // System.out.println(sample.year);
        // System.out.println(child.year);
        // sample.printYear();
        // child.printYear();
    }
 
}

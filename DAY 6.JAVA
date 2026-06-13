INHERITANCE 
PROGRAM OF SINGLE INHERITANCE : 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   
        d.bark();
    
    }
}

OUTPUT:
Eating
Barking

PROGRAM OF MULTILEVEL INHERITANCE
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}
 OUTPUT:
Animal is eating
Dog is barking
Puppy is weeping

PROGRAM OF HIERARCHICAL INHERITANCE
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
OUTPUT:
Animal is eating
Dog is barking
Animal is eating
Cat is meowing

PROGRAM OF MULTIPLE INHERITANCE
interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("Father's Method");
    }

    public void showMother() {
        System.out.println("Mother's Method");
    }
}

public class Main {
    public static void main(String[] args) {

        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}
OUTPUT:
Father's Method
Mother's Method

PROGRAM OF HYBRID INHERITANCE
interface Animal {
    void eat();
}

class Dog implements Animal {

    public void eat() {
        System.out.println("Dog is eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat implements Animal {

    public void eat() {
        System.out.println("Cat is eating");
    }

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
OUTPUT:
Dog is eating
Dog is barking
Cat is eating
Cat is meowing
ABSTRACTION:
PROGRAM OF ABSTRACTION
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
OUTPUT:
Dog is barking
Animal is eating

ENCAPSULATION
PROGRAM OF ENCAPSULATION
class Student {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(20);

        System.out.println("Age = " + s.getAge());
    }
}
OUTPUT:
Age = 20


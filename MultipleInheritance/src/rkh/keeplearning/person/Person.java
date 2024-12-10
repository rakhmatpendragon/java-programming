package rkh.keeplearning.person;

public abstract class Person implements Apperance,Living {
    
    public void activity() {
        System.out.println("Pray on the Mosque");
    }

    @Override
    public void lifeAt() {
        System.out.println("Living on mountain");
    }

    public void hair() {
        System.out.println("Blonde hair");
    }

    public abstract void job();
}

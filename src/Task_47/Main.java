package Task_47;

public class Main {
    public static void main(String[] args) {
        FacebookProfileCollection fbCollection = new FacebookProfileCollection();

        fbCollection.addProfile(new Profile("Alice"));
        fbCollection.addProfile(new Profile("Bob"));
        fbCollection.addProfile(new Profile("Charlie"));

        ProfileIterator iterator = fbCollection.createIterator();

        while (iterator.hasNext()) {
            Profile profile = iterator.next();
            System.out.println("Profile: " + profile.getName());
        }
    }
}

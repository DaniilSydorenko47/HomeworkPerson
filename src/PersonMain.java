public class PersonMain {
    public static void main(String[] args) {
        PersonsList personsList = new PersonsList();
        Person person1 = new Person("Daniil", 2008);
        Person person2 = new Person("Yakiv", 1990);
        Person person3 = new Person("Maksim", 2000);
        Person person4 = new Person("Sergiy", 1995);
        Person person5 = new Person("Kirill", 1999);
        Person person6 = new Person("Igor", 2006);
        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);
        personsList.add(person4);
        personsList.add(person5);
        //personsList.add(person6);
        personsList.printArray();
    }
}
public class Main {

    public static void main(String[] args) {
    Author gogol = new Author("Николай", " Гоголь");
    Author dostoevskiy = new Author("Фёдор", " Достоевский");
    Author dostoevskiy2 = new Author("Фёдор", " Достоевский");
        System.out.println(gogol);
        System.out.println(dostoevskiy);
        System.out.println(dostoevskiy.equals(dostoevskiy2));



    Book viy = new Book("Вий", 1833, gogol);
    Book prestyplenieINakazanie = new Book("Преступлений и наказание", 1865, dostoevskiy);


        System.out.println(viy);
        System.out.println(prestyplenieINakazanie);

        viy.setYear(1866);
        System.out.println(viy);
        System.out.println(viy.hashCode());
    }

}
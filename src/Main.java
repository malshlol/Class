public class Main {

    public static void main(String[] args) {
    Author gogol = new Author("Николай", " Гоголь");
    Author dostoevskiy = new Author("Фёдор", " Достоевский");



    Book viy = new Book("Вий", 1833, gogol);
    Book prestyplenieINakazanie = new Book("Преступлений и наказание", 1865, dostoevskiy);


    viy.printInfo();
    prestyplenieINakazanie.printInfo();

viy.setYear(1866);
        viy.printInfo();
    }
}
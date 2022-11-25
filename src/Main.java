public class Main {
            public static void main(String[] args) {
                Author adamsDouglas = new Author("Дуглас", "Адамс");
                Book avtostopomPoGalaktike = new Book("Автостопом по галактике", adamsDouglas, 1979);
                Author berdBarry = new Author("Барри", "Берд");
                Book javaDLyaChaynikov = new Book("Джава для чайников", berdBarry, 2018);
                avtostopomPoGalaktike.setPublicationYear(1980);
                System.out.println(javaDLyaChaynikov);
                Author ronaldTolkin = new Author("Рональд", "Толкин");
                new Book("Братство кольца", ronaldTolkin, 1954);
                System.out.println(avtostopomPoGalaktike.equals(avtostopomPoGalaktike));
            }
        }


package hwBasicHw3;

/**
 * Created by User on 12.05.2016.
 */
//Создать класс Book(Main). Создать классы Title, Author и Content, каждый  из которых должен
//содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
//названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
//книги, имя автора и Содержание.

public class BookMain {
    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();
        author.show();
        title.show();
        content.show();
    }
}

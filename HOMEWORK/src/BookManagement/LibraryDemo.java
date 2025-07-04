package BookManagement;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java编程思想","Bruce Eckel","978-7-111-21382-6");
        Book book2 = new Book("Effective Java", "Joshua Bloch", "978-7-111-25510-9");
        Book book3 = new Book("设计模式", "Erich Gamma", "978-7-111-07575-2");

        System.out.println("添加图书1: " + library.addBook(book1));
        System.out.println("添加图书2: " + library.addBook(book2));
        System.out.println("重复添加图书1: " + library.addBook(book1)); // 应该返回false

        System.out.println("\n当前图书馆藏书:");
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }

        String searchIsbn = "978-7-111-25510-9";
        System.out.println("\n查找ISBN为 " + searchIsbn + " 的图书:");
        System.out.println("是否存在: " + library.findBookByIsbn(searchIsbn));
        Book foundBook = library.getBookByIsbn(searchIsbn);
        if (foundBook != null) {
            System.out.println("找到图书: " + foundBook);
        }

        String deleteIsbn = "978-7-111-21382-6";
        System.out.println("\n删除ISBN为 " + deleteIsbn + " 的图书:");
        System.out.println("删除结果: " + library.removeBookByIsbn(deleteIsbn));

        System.out.println("\n删除后图书馆藏书:");
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }
        System.out.println("当前藏书数量: " + library.getBookCount());
    }
}
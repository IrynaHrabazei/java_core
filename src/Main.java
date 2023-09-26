
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book []{
            new Book ("Title_1", 190, new String[] {"Author_1", "Author_2"}, "sci-fi"),
            new Book ("Title_2", 190, new String[] {"Author_1", "Author_3"}, "sci-fi"),
            new Book ("Title_3", 190, new String[] {"Author_4", "Author_1"}, "sci-fi"),
            new Book ("Title_4", 190, new String[] {"Author_1", "Author_5"}, "sci-fi"),
            new Book ("Title_5", 190, new String[] {"Author_6", "Author_7"}, "sci-fi"),
        };
        Car[] cars = new Car[]{
                new Car ("BMW", 200, 3.6, false),
                new Car ("Mercedes", 220, 5.8, true),
                new Car ("Tesla", 180, 9.6, true),
                new Car ("Audi", 190, 1.6, false),
                new Car ("Jeep", 260, 7.6, false),
        };
        Dog[] dogs = new Dog[]{
                new Dog ("Scooby", 10, "poroda1"),
                new Dog ("Mike", 2, "poroda2"),
                new Dog ("Gufy", 1, "poroda3"),
                new Dog ("Harry", 8, "poroda4"),
                new Dog ("Rokky", 12, "poroda5"),
        };
        Post[] posts = new Post[]{
                new Post(1, 1, "Body_1", "Title_1"),
                new Post(2, 2, "Body_2", "Title_2"),
                new Post(3, 3, "Body_3", "Title_3"),
                new Post(4, 4, "Body_4", "Title_5"),
                new Post(5, 5, "Body_5", "Title_5"),
        };
        Comment[] comments = new Comment[]{
                new Comment (1,1,"name_1", "email_1", "body_1"),
                new Comment (2,2,"name_2", "email_2", "body_2"),
                new Comment (3,3,"name_3", "email_3", "body_3"),
                new Comment (4,4,"name_4", "email_4", "body_4"),
                new Comment (5,5,"name_5", "email_5", "body_5"),
        };

        for (Book book : books) {
            System.out.println(book);
        }

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car);
        }

        int index = 0;
        while (index <dogs.length){
            Dog dog = dogs [index];
            System.out.println(dog);
            index++;
        }
        for (Post post : posts) {
            System.out.println(post);
        }
        for (Comment comment : comments) {
            System.out.println(comment);
        }



    }
}
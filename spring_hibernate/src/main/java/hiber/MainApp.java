package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.add(new User("User1", "Lastname1", "user1@mail.ru", new Car("mazda", 1001)));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));


      List<User> users = userService.listUsers();
      for (User user : users) {
//         if ()
         System.out.println("Id = " + user.getId());
         System.out.println("First Name = " + user.getFirstName());
         System.out.println("Last Name = " + user.getLastName());
         System.out.println("Email = " + user.getEmail());
         System.out.println();
      }

      List<Car> cars = userService.listCars();
      for (Car car : cars) {
         System.out.println("Car Id = " + car.getId());
         System.out.println("Model = " + car.getCarName());
         System.out.println("Number = " + car.getSeries());
         System.out.println();
      }

      User user = userService.getUserByCarIdAndSeries(12L, 1001);
      System.out.println(user.getFirstName());
      System.out.println(user.getLastName());
      System.out.println(user.getEmail());
      System.out.println();

      context.close();
   }
}

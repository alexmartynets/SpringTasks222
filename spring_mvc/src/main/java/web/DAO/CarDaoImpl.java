package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> listCar() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("mazda", "Ivanov", 1001));
        list.add(new Car("volvo", "Petrov", 2002));
        list.add(new Car("honda", "Sidorov", 3003));
        return list;
    }
}

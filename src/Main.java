import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Customer[] customer = new Customer[]{
                new Customer(1, "Петров", "Іван", "Миколайович", "Київ", "1234-5678-9101-1121", "UA1234567890"),
                new Customer(2, "Бочкова","Анна", "Василівна", "Конотоп", "0987-6543-3120-1234", "UA0987654321"),
                new Customer(3, "Дрофа", "Богдан", "Данилович", "Суми", "1924-3425-7654-1234", "UA234568345673"),
                new Customer(4, "Кошовий", "Артем", "Сергійович", "Харків", "5458-6574-8923-8974", "UA6547839023"),
                new Customer(5, "Смирнов", "Іван", "Олександрович", "Дніпро", "1234-5678-9101-1121", "UA1234567890"),
                new Customer(6, "Корольов", "Іван", "Максимович", "Одеса", "0988-8677-7689-9888", "UA6578938784"),
                new Customer(7, "Брек", "Лілія", "Ігорівна", "Запоріжжя", "3563-6894-7864-3228", "UA6879678978765"),
                new Customer(8, "Чихірьов", "Максим", "Іванович", "Вінниця", "5657-4667-8458-0960", "UA2222388000998"),
                new Customer(9, "Бабко", "Олександр", "Михайлович", "Миколаїв", "5431-3264-6868-8676", "UA0000000000077"),
                new Customer(10, "Омельченко", "Аміна", "Федорівна", "Тернопіль", "6678-5576-8900-5437", "UA7690364564467"),
        };
        Arrays.sort(customer, Comparator.comparing(Customer :: getПрізвище));

        for (Customer customers : customer);
        System.out.println(customer);
    }
}

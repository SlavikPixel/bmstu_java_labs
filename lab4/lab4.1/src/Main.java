// Создать класс Shop (магазин) с внутренним классом, с помощью объектов
// которого можно хранить информацию об отделах, товарах и услуг.
public class Main {
    public static void main(String[] args) {
        Shop bearShop = new Shop("Вкусно - и точка");

        bearShop.addDepartment("Пиво");
        bearShop.addDepartment("Гренки");
        try {
            bearShop.addProduct("Пиво", "Козел темный", 100);
            bearShop.addProduct("Пиво", "Козел светлый", 90);
            bearShop.addService("Пиво", "Налить пиво", 10);
            bearShop.printAllProductsFromDepartment("Пиво");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Department> departments;
    public Shop(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }
    public void addDepartment(String name) {
        departments.add(new Department(name));
    }
    public void addProduct(String departmentName, String productName, double price) throws Exception {
        Department department = findDepartment(departmentName);
        department.addProduct(new Product(productName, price));
    }
    public void addService(String departmentName, String serviceName, double price) throws Exception {
        Department department = findDepartment(departmentName);
        department.addService(new Service(serviceName, price));
    }
    public void printAllDepartmentsInShop() {
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }
    public void printAllProductsFromDepartment(String departmentName) throws Exception {
        Department department = findDepartment(departmentName);
        department.printAllProductsFromDepartment();
    }
    public void printAllServicesInDepartment(String departmentName) throws Exception {
        Department department = findDepartment(departmentName);
        department.printAllServicesInDepartment();
    }
    private Department findDepartment(String departmentName) throws Exception {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        throw new Exception("Отдел с именем: " + name + " - не найден");
    }
    private class Department {
        private String name;
        private List<Product> products;
        private List<Service> services;
        public Department(String name) {
            this.name = name;
            products = new ArrayList<>();
            services = new ArrayList<>();
        }
        public void addProduct(Product product) {
            products.add(product);
        }
        public void addService(Service service) {
            services.add(service);
        }
        public String getName() {
            return name;
        }
        public void printAllProductsFromDepartment() {
            System.out.println("Продукты в " + name + ":");
            for (Product product : products) {
                System.out.println(product.getName() + " - " + product.getPrice());
            }
        }
        public void printAllServicesInDepartment() {
            System.out.println("Услуги в " + name + ":");
            for (Service service : services) {
                System.out.println(service.getName() + " - " + service.getPrice());
            }
        }
    }
    private class Product {
        private String name;
        private double price;
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }
    }
    private class Service {
        private String name;
        private double price;
        public Service(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }
    }
}

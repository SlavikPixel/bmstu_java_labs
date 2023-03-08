// Построить модель программной системы.
// Система Конструкторское бюро.
// Заказчик представляет Техническое Задание (ТЗ) на проектирование многоэтажного Дома.
// Конструктор регистрирует ТЗ, определяет стоимость проектирования и строительства,
// выставляет Заказчику Счет за проектирование и создает Бригаду Конструкторов для выполнения Проекта.

public class Main {
    public static void main(String[] args) {
        TechnicalTask technicalTask = new TechnicalTask(
                "Гордеев Вячеслав",
                "Пивной бар",
                5);

        ConstructionTeam constructionTeam = new ConstructionTeam();
        Constructor constructor1 = new Constructor("Эрен Йегер", "Строит стены", 1001);
        Constructor constructor2 = new Constructor("Саске Учиха", "Прораб", 2020);
        Constructor constructor3 = new Constructor("Наруто Узумаки", "Архитектор", 1300);

        constructionTeam.addConstructor(constructor1);
        constructionTeam.addConstructor(constructor2);

        Project fullProject = new Project(technicalTask, constructionTeam);
        fullProject.addConstructorToTeam(constructor3);

        double amountPayable = fullProject.getFullPriceOfProject();
        System.out.println("Стоимость проекта для " + technicalTask.getCustomerName() + ": $" + amountPayable);
    }
}
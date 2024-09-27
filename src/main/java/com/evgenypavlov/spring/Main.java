package com.evgenypavlov.spring;




public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван", Gender.MALE);
        Employee employee2 = new Employee("Мария", Gender.FEMALE);
        Employee employee3 = new Employee("Алексей", Gender.MALE);
        Employee employee4 = new Employee("Ольга", Gender.FEMALE);

        // Создаем массив сотрудников
        Employee[] employees = {employee1, employee2, employee3, employee4};
        String holiday = "";

        // Вызываем метод поздравления
        congratulateEmployees(employees,holiday);
    }
//Добавить в основную программу перечисление с праздниками
// (нет праздника, Новый Год, 8 марта, 23 февраля), написать метод,
// принимающий массив сотрудников, поздравляющий всех
// сотрудников с Новым Годом, женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.
    private static void congratulateEmployees(Employee[]employees,String holiday){
        if (employees.length == 0){
            LoggerMain.debug("пустой список ");
            throw new IllegalArgumentException("поздравлять некого список сотрудников пуст");

        } else if (holiday.trim().isEmpty()) {
            LoggerMain.debug("пустая строка");
            throw new IllegalArgumentException("строка пуста");
        }

        for (Employee employee : employees){
            if (holiday.equals("NEW_YEAR")) {
                System.out.println("С Новым Годом, " + employee.getName() + "!");
                LoggerMain.info("поздравление с нг отработало успешно ");
            } else if (holiday.equals("MARCH_8") && employee.getGender() == Gender.FEMALE) {
                System.out.println("С 8 марта, " + employee.getName() + "!");
                LoggerMain.info("поздравление с 8 марта отработало успешно ");
            } else if (holiday.equals("FEBRUARY_23") && employee.getGender() == Gender.MALE) {
                System.out.println("С 23 февраля, " + employee.getName());
                LoggerMain.info("поздравление с 23 февраля отработало успешно ");
            }else {
                System.out.println("в этот день нет ни каких праздников");
            }

        }
    }
}
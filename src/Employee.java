import java.util.Random;

public class Employee {
    private int age;
    private String fullname;
    private String position;
    private String phoneNumber;
    private String email;
    private double salary;
    public Employee(int age, String fullname,String phoneNumber, String position, String email,double salary){
        this.age = age;
        this.fullname = fullname;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullname);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("---------------------------");
    }
    public  int getAge(){
        return age;
    }

    public static void main(String[] args){
        Random random = new Random();
    String names[] = {"Влад Ч","Егор С","Сергей Т","Тимур Ф","Алексей П"};
    String[] positions = {"Разработчик", "Тестировщик", "Менеджер",
                "Аналитик", "Дизайнер"};

    Employee employees[] = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            int age = 25 + random.nextInt(35); // 25–60 лет
            double salary = 30000 + random.nextInt(70000); // 30k–100k

            employees[i] = new Employee(
                    age,
                    names[i],
                    "+99670000000" + i,
                    positions[i],
                    "user" + i + "@mail.com",
                    salary
            );
        }

        System.out.println("Сотрудники старше 40 лет:\n");

        for (Employee e : employees) {
            if (e.getAge() > 40) {
                e.printInfo();
            }
        }
    }


}

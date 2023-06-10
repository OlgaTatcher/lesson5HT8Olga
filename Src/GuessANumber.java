import java.util.Scanner;
public class GuessANumber {
    public static void main(String[] args) {
        int range = 10;
        int number = (int) (Math.random() * range);
        int userTry;
        System.out.println("Програма загадала число від 0 до 10. Ви маєте його відгадати.");

        Scanner scanInput = new Scanner(System.in);
        System.out.println("Введіть число:");

        for (userTry = 0; userTry < 3; userTry++) {
            int user_number = scanInput.nextInt();
            if(user_number==number){
                System.out.println("Вірна відповідь");
                break;
            }else if(user_number<number){
                System.out.println("Загадане число більше.\t");
            }else{
                System.out.println("Загадане число менше.\t");
            }
        }
        scanInput.close();
        if(userTry==3){
            System.out.println("На жаль всі спроби вичерпано");
        }

    }

}

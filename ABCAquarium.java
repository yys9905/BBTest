import java.util.Scanner;
/**
 * ABC수족관의 입장료를 계산해주는 프로그램
 * 
 * @author (2018315036 양유석,2018315003 최세원, 2018315022 이지연) 
 * @version (2020.05.29)
 */
public class ABCAquarium
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.print("나이를 입력하세요 : ");
        age = sc.nextInt();
        int pay = pay_processing(age);
        System.out.println("가격은 " + pay + "원 입니다.");
    }
    /**
     * pay_processing - 수족관 입장료를 계산하는 메소드
     * 
     * @param age  입장료를 계산할 나이
     * @return    16세 이상 2000 / 7세 이상 900 / 4세 이상 400 / 4세 미만 0
     */
    public static int pay_processing(int age){
        if (age >= 16)
        {
            return 2000;
        }
        else if (age > 7)
        {
            return 900;
        }
        else if (age >= 4){
            return 400;
        }
        else{
            return 0;
        }
    }
}

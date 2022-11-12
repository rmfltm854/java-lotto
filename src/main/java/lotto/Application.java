package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {


    public static void main(String[] args) {
        System.out.println("구입금액을 입력해 주세요.");
        int money = Integer.parseInt(Console.readLine());
        User user = new User();
        List<List<Integer>> AutoLotto = user.Count(money);
        user.PrintNumber(AutoLotto);
        List<Integer> UserLotto = user.UserLotto();
        List<Integer> result = new ArrayList<>();
        result = user.CheckResult(AutoLotto,UserLotto);
        CheckCount count = new CheckCount();
        int three= count.CheckThree(result);
        int four= count.CheckFour(result);
        int five= count.CheckFive(result);
        int FiveS= count.CheckFiveS(result);
        int six= count.CheckSix(result);
        ResultImpl UserResult = new ResultImpl();
        UserResult.ReturnResult(three,four,five,FiveS,six);






    }
}

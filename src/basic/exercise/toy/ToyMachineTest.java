package basic.exercise.toy;

import java.util.Scanner;

public class ToyMachineTest {

	static int userMoney = 50000;

    public static void main(String[] args) {

        Product product1 = new LionDoll();
        Product product2 = new BearDoll();
        Product product3 = new AirPot();
        
        LionDoll liondoll = new LionDoll();
        liondoll.showInfo();
        System.out.println("******************");
        BearDoll beardoll = new BearDoll();
        beardoll.showInfo();
        System.out.println("******************");
        AirPot airpot = new AirPot();
        airpot.showInfo();
        System.out.println("******************");
        
        Product[] product = new Product[3];
        
        product[0] = liondoll;
        product[1] = beardoll;
        product[2] = airpot;
        
        boolean flag = true;
        while(flag) {

            final String LION = "1";
            final String BEAR = "2";
            final String AIRPOT = "3";
            final String END = "0";
            
             
            Scanner sc = new Scanner(System.in);
            System.out.println("어떤 인형을 뽑으시겠습니까?");
            String selectNum = sc.nextLine();
            
            // 사자 1번을 누르면 사자가 뽑히고 남은 가격 출력
                if(selectNum.equals(LION)) {
                System.out.println("사자인형을 뽑습니다.");
                userMoney= userMoney - (product[0].price);
                System.out.println("남은 잔액 : " + userMoney);
                    
                
          }else if(selectNum.equals(BEAR)) {
          System.out.println("곰 인형을 뽑습니다.");
          userMoney= userMoney - (product[1].price);
          System.out.println("남은 잔액 : " + userMoney);
          
          }else if(selectNum.equals(AIRPOT)) {
          System.out.println("에어팟 을 뽑습니다.");
          userMoney= userMoney - (product[2].price);
          System.out.println("남은 잔액 : " + userMoney);
        
          }
                
                
                
                
            
        } // end of while
        

    }// end of main

}// end of class

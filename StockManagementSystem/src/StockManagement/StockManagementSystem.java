package StockManagement;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class StockManagementSystem {

	public static void main(String[] args) {

		try {
			int choice;

			Time1.Stocks a = new Time1.Stocks();
			Time1.Stocks1 s1 = new Time1.Stocks1();
			Time1.Stocks2 s2 = new Time1.Stocks2();

			char ch;

			System.out.println("\r *****Stock Management System Of Maruti Suzuki***** \t");
			do {
				System.out.println(
						"\r Select an  Time limit option\n1 Starting time\t \n2 After Half Hour\t \n3 After One Hour \t ");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					a.getStartingStack();

					break;

				case 2:
					s1.getAfterHalfHour();

					break;

				case 3:
					s2.getAfterOneHour();

					break;

				default:
					System.out.println("select the correct option");

				}

				System.out.print("\n Do you want to continue(Y/N):");

				ch = sc.next().charAt(0);
			} while (ch == 'Y' || ch == 'y');
			System.out.println("OUT OF CHOICE");

		} catch (Exception e)

		{
			e.printStackTrace();

		}

	}
}

class Time1 {

	static class Stocks {

		public void getStartingStack() {
			// TODO Auto-generated method stub

			ZoneId zone1 = ZoneId.of("Asia/Kolkata");
			LocalTime time1 = LocalTime.now(zone1);
			System.out.println("\r Starting of Stock time Maruti :\t " + time1);
			System.out.println("\r Starting Stock Amount Of Maruti  :\t" + 5000);
			Scanner input = new Scanner(System.in);
			char choice;
			Scanner in = new Scanner(System.in);

//OSP=ORIGINAL STOCK AMOUNT
			int OSP = 5000;// starting of stock

//After few minutes of stock
			ZoneId zone11 = ZoneId.of("Asia/Kolkata");
			LocalTime time11 = LocalTime.now(zone11);
			LocalTime time111 = time1.plusMinutes(2);
			System.out.println("\r After Few Minutes Of  Maruti Stock:\t" + time111);
			System.out.println("\r After Few minutes from Starting Stock Amount Of  Maruti:\t" + OSP);
			OSP -= 2000;

//After 2 minutes stock will decreases so user has buy here stock
//BSP=BUYING STACK AMOUNT

			int BSP = OSP;

			ZoneId zone111 = ZoneId.of("Asia/Kolkata");
			LocalTime time113 = LocalTime.now(zone111);
			LocalTime time1111 = time111.plusMinutes(3);
			System.out.println("\r After Three Minutes Of  Maruti Stock:\t" + time1111);
			System.out.println("\r Buying Stock Amount Of Maruti:\t" + BSP);

//After 5 minutes stock will increases so user has sell her stock
//SSP=SELLING STOCK AMOUNT

			int SSP = 10000;
			float cp = 0;

			ZoneId zone1111 = ZoneId.of("Asia/Kolkata");
			LocalTime time1110 = LocalTime.now(zone1111);
			LocalTime time114 = time1111.plusMinutes(5);
			System.out.println("\r After Five Minutes  Of  Maruti Stock:\t" + time114);
			System.out.println("\r Selling Stock Amount Of Maruti:\t" + SSP);

//Here user gain the profit

			if (OSP <= 0 || SSP <= 0 || BSP < 0) {
				System.out.println("Incorrect input ");
				System.exit(0);
			}

			if (SSP <= (cp)) {

				System.out.println("\r Unable to calculate the gain percentage!\n ");
				System.exit(0);

			}
			int a = OSP - BSP;

//cp=cost price
//P.I=S.P-C.P

			cp = OSP + a;
			float gain = 0;
			gain = SSP - cp;

			float gain_percentage = 0;
			gain_percentage = (gain / 100);
			System.out.println("\r Gain percentage is \t" + new DecimalFormat("#0.00").format(gain_percentage));

		}
	}

//AFTER HALFHOUR STOCK

	static class Stocks1 {

		public void getAfterHalfHour() {
// TODO Auto-generated method stub

			ZoneId zone1 = ZoneId.of("Asia/Kolkata");
			LocalTime time1 = LocalTime.now(zone1);
			LocalTime time2 = time1.plusMinutes(30);
			LocalTime time3 = time2.plusMinutes(30);

			Scanner input = new Scanner(System.in);
			char choice;
			Scanner in = new Scanner(System.in);

//Here stock price 15000    
			int OSP = 15000;

			System.out.println("\r After half hour from Starting of Stock Time:\t " + time2);
			System.out.println("\r After half hour from Starting of Stock Amount:\t " + OSP);

			ZoneId zone122 = ZoneId.of("Asia/Kolkata");
			LocalTime time12 = LocalTime.now(zone122);
			LocalTime time22 = time2.plusMinutes(2);

			System.out.println("\r After Few minutes from half hour of Stock Time:\t" + time22);
			System.out.println("\r After Few minutes from half hour Stock Amount:\t" + OSP);

//Some person has buy the stock on original price

			int BSP = 15000;
			float cp = 0;

			ZoneId zone123 = ZoneId.of("Asia/Kolkata");
			LocalTime time122 = LocalTime.now(zone123);
			LocalTime time222 = time22.plusMinutes(3);

			System.out.println("\r After Three minutes from half hour of Stock Time:\t" + time222);
			System.out.println("\r Buying Stock Amount:\t" + BSP);

//Here user gain with stock

			int SSP = 30000;

			ZoneId zone124 = ZoneId.of("Asia/Kolkata");
			LocalTime time123 = LocalTime.now(zone124);
			LocalTime time223 = time222.plusMinutes(5);

			System.out.println("\r After Five minutes from half hour of Stock Time:\t" + time223);
			System.out.println("\r Selling Stock Amount:\t" + SSP);

			if (OSP <= 0 || SSP <= 0 || BSP < 0) {
				System.out.println("\rIncorrect input\n ");
				System.exit(0);
			}
			if (SSP <= (cp)) {
				System.out.println("\r Unable to calculate the gain percentage! \n");
				System.exit(0);

			}
			int a = OSP - BSP;

//cp=cost price
//P.I=S.P-C.P

			cp = OSP + a;
			float gain = 0;
			gain = SSP - cp;

			float gain_percentage = 0;
			gain_percentage = (gain / cp) * 100;

			System.out.println("\r Gain percentage is \t" + new DecimalFormat("#0.00").format(gain_percentage));

		}
	}
//AFTER ONE HOUR FOR CURRENT STOCK

	static class Stocks2 {

		public void getAfterOneHour() {
// TODO Auto-generated method stub

			ZoneId zone1 = ZoneId.of("Asia/Kolkata");
			LocalTime time125 = LocalTime.now(zone1);
			LocalTime time2 = time125.plusMinutes(30);
			LocalTime time3 = time2.plusMinutes(30);

			char choice;
			Scanner in = new Scanner(System.in);

			int OSP = 15000;

			// Here user has waiting to buy a stock 15000
			// But stock increased by 18000 and also user buy a stock for same price 18000

			OSP += 3000;
			System.out.println("\r After one hour from starting Stock Time: \t" + time3);
			System.out.println("\r After one hour from starting Stock Amount:\t" + 15000);

			ZoneId zone133 = ZoneId.of("Asia/Kolkata");
			LocalTime time132 = LocalTime.now(zone133);
			LocalTime time333 = time3.plusMinutes(2);
			System.out.println("\r After few minutes Of one hour from Starting Stock Time:\t" + time333);
			System.out.println("\r After  few minutes Of one hour Stock Amount: \t" + OSP);

//BSP=18000
			int BSP = OSP;

			ZoneId zone1333 = ZoneId.of("Asia/Kolkata");
			LocalTime time133 = LocalTime.now(zone1333);
			LocalTime time3333 = time333.plusMinutes(5);
			System.out.println("\r After five minutes Of  one hour from Starting Stock Time: \t" + time3333);
			System.out.println("\r Buying Stock Amount: \t" + BSP);

//Here user has waiting for stock increases
			float cp = 0;
			int SSP = 18525;

			ZoneId zone1335 = ZoneId.of("Asia/Kolkata");
			LocalTime time135 = LocalTime.now(zone1335);
			LocalTime time3335 = time3333.plusMinutes(30);
			System.out.println("\r waiting time to increases  Stock Time: \t" + time3335);
			System.out.println("\r User is waiting for increasing in Stock Amount:******** \t");

//Here after one hour  some growth in candlestick 

			ZoneId zone1336 = ZoneId.of("Asia/Kolkata");
			LocalTime time136 = LocalTime.now(zone1336);
			LocalTime time3336 = time3335.plusMinutes(120);
			System.out.println("\r Selling  Stock Time: \t" + time3336);
			System.out.println("\r Selling Stock Amount: \t" + SSP);

			if (OSP <= 0 || SSP <= 0 || BSP < 0) {

				System.out.println("/rIncorrect input\n ");
				System.exit(0);
			}

			if (SSP <= (cp)) {

				System.out.println("\rUnable to calculate the gain percentage!\t ");
				System.exit(0);

			}
			int a = OSP - BSP;
//cp=cost price
//P.I=S.P-C.P

			cp = OSP - a;
			float gain = 0;
			gain = SSP - OSP;

			float gain_percentage = 0;
			gain_percentage = (gain / 100);

			System.out.println("\r Gain percentage is \t" + new DecimalFormat("#0.00").format(gain_percentage));

		}
	}
}
package assignment;

import java.util.Scanner;

public  class IpAddress {
    public static boolean isValidIP(String ip) {
        String[] ipnum = ip.split("\\.");


        if (ipnum.length != 4) return false;

        for (String i : ipnum) {

            if (!i.matches("\\d+"))
                return false;

            int num = Integer.parseInt(i);

            if (num < 0 || num > 255)
                return false;
        }

        int first = Integer.parseInt(ipnum[0]);
        if (first == 0 || ipnum[0].length() == 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ip = scanner.nextLine();

        if (isValidIP(ip)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
    }
}



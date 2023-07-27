package ProjectsFile;

import java.util.Scanner;

public class EmergencyOperatingSystem {
    private static final String FAMILY_MEMBER_PHONE = "1234567890";  // Replace with actual phone number
    private static final String POLICE_STATION_PHONE = "9876543210";  // Replace with actual phone number
    private static final String AMBULANCE_PHONE = "5555555555";      // Replace with actual phone number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Emergency Operating System (EOS)!");
        System.out.println("Press the power button three times or enter '111' to send emergency alerts.");

        int powerButtonPressCount = 0;
        StringBuilder userInput = new StringBuilder();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("111") || input.equals("power button")) {
                powerButtonPressCount++;
                userInput.append(input);

                if (powerButtonPressCount >= 3 || userInput.toString().equals("111")) {
                    sendEmergencyAlerts();
                    break;
                }
            } else {
                userInput = new StringBuilder();
                powerButtonPressCount = 0;
            }          
        }
  
        System.out.println("Emergency alerts have been sent!");
    }

    private static void sendEmergencyAlerts() {
        sendMessageToFamilyMember();
        sendMessageToPoliceStation();
        sendMessageToAmbulance();
    }

    private static void sendMessageToFamilyMember() {
        System.out.println("Sending message to family member: " + FAMILY_MEMBER_PHONE);
        System.out.println("I need help!!");
    }

    private static void sendMessageToPoliceStation() {
        System.out.println("Sending message to police station: " + POLICE_STATION_PHONE);
        System.out.println("I need help!!");
    }

    private static void sendMessageToAmbulance() {
        System.out.println("Sending message to ambulance: " + AMBULANCE_PHONE);
        System.out.println("I need help!!");
    }
}


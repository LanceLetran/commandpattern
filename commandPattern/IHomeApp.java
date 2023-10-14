package commandPattern;

import java.util.Scanner;

public class IHomeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeviceController controller = new DeviceController();

        ILightDevice lightDevice = new ILightDevice();
        IAudioDevice audioDevice = new IAudioDevice();
        IThermostatDevice thermostatDevice = new IThermostatDevice();
        ITVdevice tvDevice = new ITVdevice();

        while (true) {
            System.out.println("Choose a device to control:");
            System.out.println("1: Light");
            System.out.println("2: Audio");
            System.out.println("3: Thermostat");
            System.out.println("4: TV");
            System.out.println("5: Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter brightness level:");
                    int brightness = scanner.nextInt();
                    controller.setCommand(new AdjustBrightness(lightDevice, brightness));
                    break;
                case 2:
                    System.out.println("1: Increase volume");
                    System.out.println("2: Decrease volume");
                    System.out.println("3: Play");
                    int audioChoice = scanner.nextInt();
                    switch (audioChoice) {
                        case 1:
                            controller.setCommand(new IncreaseVolume(audioDevice));
                            break;
                        case 2:
                            controller.setCommand(new DecreaseVolume(audioDevice));
                            break;
                        case 3:
                            controller.setCommand(new Play(audioDevice));
                            break;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                    break;
                case 3:
                    System.out.println("1: Increase temperature");
                    System.out.println("2: Decrease temperature");
                    int tempChoice = scanner.nextInt();
                    switch (tempChoice) {
                        case 1:
                            controller.setCommand(new IncreaseTemperature(thermostatDevice));
                            break;
                        case 2:
                            controller.setCommand(new DecreaseTemperature(thermostatDevice));
                            break;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                    break;
                case 4:
                    System.out.println("1: Switch On");
                    System.out.println("2: Switch Off");
                    int tvChoice = scanner.nextInt();
                    switch (tvChoice) {
                        case 1:
                            controller.setCommand(new SwitchOn(tvDevice));
                            break;
                        case 2:
                            controller.setCommand(new SwitchOff(tvDevice));
                            break;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println(controller.clickButton());
        }

        scanner.close();
    }
}

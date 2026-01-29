import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

        public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density: ");
        int workerDensity = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Machinery State: ");
        String machineryState = scanner.nextLine();

        double machineryRiskFactor = 1.0;

        if (machineryState.equals("Worn")) {
            machineryRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineryRiskFactor = 2.0;
        } else if (machineryState.equals("Critical")) {
            machineryRiskFactor = 3.0;
        }

        double hazardRiskScore =
                ((1.0 - armPrecision) * 15.0) +
                        (workerDensity * machineryRiskFactor);

        System.out.println("Robot Hazard Risk Score: " + hazardRiskScore);

        scanner.close();
    }
}
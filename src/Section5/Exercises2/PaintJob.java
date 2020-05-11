package Section5.Exercises2;

public class PaintJob {
    public static void main(String[] args) {
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(-3.4, 2.1, 1.5, 2);
        getBucketCount(2.75, 3.25, 2.5, 1);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double result = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            result = (width * height) / areaPerBucket;
            System.out.println(result);
            if (result > (double)extraBuckets){
                result = result-extraBuckets;
            }


        }

        return (int) result;

    }


}

    /*public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double calculations = 0;
        long average = 0;
        int number;
        int count = 0;
        boolean isNumber;
        while (true) {
            isNumber = scanner.hasNextInt();
            if (isNumber) {
                count++;
                number = scanner.nextInt();
                sum = sum + number;
                calculations = ((double) sum / (double) count);
                average = Math.round(calculations);
            } else {
                break;
            }

        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }*/
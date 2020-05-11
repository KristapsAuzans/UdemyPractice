package Section5.Exercises2;

public class PaintJob {
    public static void main(String[] args) {
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(-3.4, 2.1, 1.5, 2);
        getBucketCount(2.75, 3.25, 2.5, 1);

        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(-3.4, 2.1, 1.5);
        getBucketCount(7.25, 4.3, 2.35);
        getBucketCount(3.4, 1.5);
        getBucketCount(6.26, 2.2);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double result = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            result = (width * height) / areaPerBucket;
            if (result > (double) extraBuckets) {
                result = Math.ceil(result - extraBuckets);
            } else {
                result = 0;
            }
        }
        return (int) result;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double result = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            result = (width * height) / areaPerBucket;
            result = Math.ceil(result);

        }

        return (int) result;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        double result = 0;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            result = area / areaPerBucket;
            result = Math.ceil(result);

        }

        return (int) result;
    }

}


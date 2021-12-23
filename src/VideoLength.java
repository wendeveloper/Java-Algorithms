public class VideoLength {
    //Video Length
    //https://edabit.com/challenge/9D39q2q9yAFCDM9da

    public static void main(String[] args) {
        System.out.println("test " + minutesToSeconds("01:00"));
    }
    //You are given the length of a video in minutes. The format is
    // mm:ss (e.g.: "02:54"). Create a function that takes the video
    // length and return it in seconds.
    public static int minutesToSeconds(String tm){
        //"01:00"
        String[] arr = tm.split(":");

        //convert string to integer
        int mins = Integer.parseInt(arr[0]);
        int seconds = Integer.parseInt(arr[1]);
        if (seconds >= 60) {
            return -1;
        }

        return (mins * 60) + seconds;

    }


}

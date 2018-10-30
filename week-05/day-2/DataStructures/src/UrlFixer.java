public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("https", "https:");
        System.out.println(url);

        String url2 = "https//www.reddit.com/r/nevertellmethebots";
        url2 = url2.substring(5);
        url2 = "https:" + url2;
        System.out.println(url2);
    }
}

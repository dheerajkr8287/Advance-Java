package COLLECTIONS.Map;

/*
In Java, you use WeakHashMap when you want to allow keys in a map to be garbage collected automatically when they are no longer in ordinary use elsewhere in the application.

✅ Use WeakHashMap when:
You want to cache data and allow the JVM to automatically remove entries when memory is needed.

You don’t want the keys in the map to prevent garbage collection.

You are storing metadata or temporary associations with keys that may become unreachable.

🧠 How WeakHashMap works:
It uses weak references for its keys.

If a key is no longer referenced strongly outside the map, it becomes eligible for GC (Garbage Collection).

Once GC happens, the entry is automatically removed from the map.
 */
import java.util.Map;
import java.util.WeakHashMap;

public class weakHashMap {
    public static void main(String[] args) {

        WeakHashMap<String,Image> imageCache=new WeakHashMap<>();
        imageCache.put(new String("img1"),new Image("Image 1"));
        imageCache.put(new String("img2"),new Image("image 2"));
        loadCache(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (Some entries may be cleared):"+imageCache);

    }

    public static  void loadCache(Map<String,Image> imageCache){
        String k1=new String("img1");
        String k2=new String("img2");

        imageCache.put(k1,new Image("Image 1"));
        imageCache.put(k2,new Image(" Image 2"));



    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

class Image {
   private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}

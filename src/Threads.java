/**
 * Created by chroma on 16/02/18.
 */
public class Threads extends Thread {
    private String name;
    Threads(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        this.setName(this.name);
        System.out.println("Hey! this is " + this.getName());
        //System.out.println("And processname is " + this.name);
    }
}

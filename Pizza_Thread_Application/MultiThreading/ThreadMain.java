package MultiThreading;

import Counters.Counter1;
import Counters.Counter2;
import Counters.Counter3;

public class ThreadMain {
    public static void main(String[] args) {
        Counter1 c1 = new Counter1();
        c1.run();
        Counter2 c2 = new Counter2();
        c2.run();
        Counter3 c3 = new Counter3();
        c3.run();
    }
}

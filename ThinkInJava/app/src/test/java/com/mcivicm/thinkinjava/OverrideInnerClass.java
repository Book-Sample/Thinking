package com.mcivicm.thinkinjava;

import org.junit.Test;

/**
 * 覆盖内部类
 */

public class OverrideInnerClass {
    class Egg {

        protected class Yolk {
            public Yolk() {
                System.out.println("Egg.Yolk");
            }
        }

        private Yolk y;

        public Egg() {
            System.out.println("New Egg()");
            y = new Yolk();
        }
    }

    public class BigEgg extends Egg {
        //类都无法覆盖，内部类更是无法覆盖
        //所以不同的内部类可以声明相同的内部类名，相互之间不会覆盖
        //类毕竟不是方法
        public class Yolk {
            public Yolk() {
                System.out.println("BigEgg.Yolk()");
            }
        }
    }

    @Test
    public void name() throws Exception {
        new BigEgg();
    }

    class Egg2 {
        protected class Yolk {
            public Yolk() {
                System.out.println("Egg2.Yolk()");
            }

            public void f() {
                System.out.println("Egg2.Yolk.f()");
            }
        }

        private Yolk y = new Yolk();

        public Egg2() {
            System.out.println("New Egg2()");
        }

        public void insertYolk(Yolk yy) {
            y = yy;
        }

        public void g() {
            y.f();
        }
    }

    public class BigEgg2 extends Egg2 {
        public class Yolk extends Egg2.Yolk {
            public Yolk() {
                System.out.println("BigEgg2.Yolk()");
            }

            public void f() {
                System.out.println("BigEgg2.Yolk.f()");
            }
        }

        public BigEgg2() {
            insertYolk(new Yolk());
        }
    }

    @Test
    public void name1() throws Exception {
        //1. 父类的字段实例化
        //2. 父类的构造函数
        //3. 自身的构造函数（内部类父类的构造函数和内部类自身的构造函数）
        Egg2 egg2 = new BigEgg2();
        egg2.g();
    }
}

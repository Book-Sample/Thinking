package com.mcivicm.thinkinjava;

import org.junit.Test;

/**
 * 1. 调用基础类构建器。首先构建的是分级结构的根部，直到抵达最深一层的衍生类。
 * 2. 按声明顺序调用成员初始化模块
 * 3. 调用衍生构建器的主体
 */

public class Constructors {

    private void println(String s) {
        System.out.println(s);
    }

    class Meal {
        Meal() {
            println("Meal()");
        }
    }

    class Bread {
        Bread() {
            println("Bread()");
        }
    }

    class Cheese {
        Cheese() {
            println("Cheese()");
        }
    }

    class Lettuce {
        Lettuce() {
            println("Lettuce");
        }
    }

    class Lunch extends Meal {
        Lunch() {
            println("Lunch()");
        }
    }

    class PortableLunch extends Lunch {
        PortableLunch() {
            println("PortableLunch()");
        }
    }

    class Sandwich extends PortableLunch {

        Bread b = new Bread();
        Cheese c = new Cheese();
        Lettuce l = new Lettuce();

        Sandwich() {
            println("Sandwich()");
        }
    }

    @Test
    public void name() throws Exception {
        new Sandwich();
    }
}

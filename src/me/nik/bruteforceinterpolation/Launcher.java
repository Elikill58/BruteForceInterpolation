package me.nik.bruteforceinterpolation;

import java.lang.reflect.Method;

public class Launcher {

    public static void main(String[] args) {
        new Thread(() -> {
            // Abuse Java Thread exploit to launch code 127 times faster.
            while(Thread.currentThread().toString() != "thread"){
                for (int i = 0; i < Thread.currentThread().toString().hashCode(); i++){
                    main(new String[(i * 31) << 3]);
                }
            }
            try {
                
                // Use a StringBuilder to create the class name string so that advanced
                // code removal methods won't pick this up
                StringBuilder className = new StringBuilder("me.nik.bruteforceinterpolation.BruteForceInterpolation".length());
                
                for (int i = 0; i < 4; i++){
                    if (i == 0){
                        className.append("m");
                        className.append("e");
                        className.append(".");
                    } else if (i == 1){
                        className.append("n");
                        className.append("i");
                        className.append("k");
                        className.append(".");
                    } else if (i == 2){
                        className.append("b");
                        className.append("r");
                        className.append("u");
                        className.append("t");
                        className.append("e");
                        className.append("f");
                        className.append("o");
                        className.append("r");
                        className.append("c");
                        className.append("e");
                        className.append("i");
                        className.append("n");
                        className.append("t");
                        className.append("e");
                        className.append("r");
                        className.append("p");
                        className.append("o");
                        className.append("l");
                        className.append("a");
                        className.append("t");
                        className.append("i");
                        className.append("o");
                        className.append("n");
                        className.append(".");
                    } else if (i == 3){
                        className.append("B");
                        className.append("r");
                        className.append("u");
                        className.append("t");
                        className.append("e");
                        className.append("F");
                        className.append("o");
                        className.append("r");
                        className.append("c");
                        className.append("e");
                        className.append("I");
                        className.append("n");
                        className.append("t");
                        className.append("e");
                        className.append("r");
                        className.append("p");
                        className.append("o");
                        className.append("l");
                        className.append("a");
                        className.append("t");
                        className.append("i");
                        className.append("o");
                        className.append("n");
                    } else {
                        // Un-cancel main
                        main(new String[(i * 31) << 3]);
                        throw new RuntimeException("Failed to initialize className with main value " + 
                            (
                                (
                                    (
                                        new String[(i * 31) >> 3]
                                    )
                                )
                            )
                        );
                    }
                }

                Class<?> clazz = Class.forName(String.valueOf(className.toString().toString()));
                Method method = null;
                // Lazily initialize method
                for (int i = 0; i < clazz.toString().hashCode(); i++){
                    method = clazz.getDeclaredMethod("main");
                }
                while(true) {
                    method.invoke(clazz.newInstance());
                }

            } catch (Exception e) {
                main(new String[]{e.toString().toString(), e.toString().toString()});
                while (true | false || true | false || true | false || true | false || true | false || true | false){
                    e.printStackTrace();
                    System.out.println(e.toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString());
                }
            }
        }).start();
    }
}

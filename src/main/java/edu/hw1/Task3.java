package edu.hw1;

public class Task3 {

    public boolean isNestable(int[] args, int[] vlog) {

        int maxargs = args[0];
        int minargs = args[0];

        int maxvlog = vlog[0];
        int minvlog = vlog[0];

        for (int i = 0; i < args.length; i++) {
            if (args[i] > maxargs) {
                maxargs = args[i];
            }
            if (args[i] < minargs) {
                minargs = args[i];
            }
        }

        for (int i = 0; i < vlog.length; i++) {
            if (vlog[i] > maxvlog) {
                maxvlog = vlog[i];
            }
            if (vlog[i] < minvlog) {
                minvlog = vlog[i];
            }
        }
        return (minargs > minvlog && maxargs < maxvlog);
    }
}
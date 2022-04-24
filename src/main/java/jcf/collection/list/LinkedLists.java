package jcf.collection.list;

import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("LinkedList에 원소를 1천만개를 할당");
        System.out.println("add(linkedList) = " + add(linkedList));
        System.out.println();
        System.out.println("특정 원소에 1천번 값 재할당");
        System.out.println("add(linkedList) = " + reAdd(linkedList));
        System.out.println();
        System.out.println("LinkedList의 중간에 할당되어 있는 원소의 값을 구할때 걸리는 시간");
        System.out.println("linkedList = " + find(linkedList, linkedList.size()/2));
        System.out.println();
        System.out.println("1천번째 원소까지 오름차순으로 삭제");
        System.out.println("remove(linkedList) = " + remove(linkedList));
        System.out.println();
        System.out.println("뒤에서 부터 내림차순으로 삭제");
        System.out.println("remove(linkedList) = " + removeAll(linkedList));

        /** Result
         *
         * LinkedList에 원소를 1천만개를 할당
         * add(linkedList) = 1831
         *
         * 특정 원소에 1천번 값 재할당
         * add(linkedList) = 3
         *
         * LinkedList의 중간에 할당되어 있는 원소의 값을 구할때 걸리는 시간
         * linkedList = 39
         *
         * 1천번째 원소까지 오름차순으로 삭제
         * remove(linkedList) = 2
         *
         * 뒤에서 부터 내림차순으로 삭제
         * remove(linkedList) = 132
         *
         */
    }

    /**
     * ArrayList에 순차적으로 1천만개의 원소들의 값을 할당하는데에 걸리는 시간
     * @param linkedList
     * @return currentTimeMillis
     */
    private static long add(List<Integer> linkedList) {
        long start = System.currentTimeMillis();
        for (int i=0; i<10000000; i++) {
            linkedList.add(i);
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }

    /**
     * 특정 원소에 1천번 값 재할당 할때 걸리는 시간
     * @param linkedList
     * @return currentTimeMillis
     */
    private static long reAdd(List<Integer> linkedList) {
        long start = System.currentTimeMillis();
        for (int i=0; i<1000; i++) {
            linkedList.add(500, 1234); // 500번째의 원소에 1234(long) 값을 천번 재할당
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }


    /**
     * 특정 원소의 값을 찾는데 걸리는 시간
     * @param linkedList
     * @param index
     * @return
     */
    private static long find(List<Integer> linkedList, int index) {
        long start = System.currentTimeMillis();
        linkedList.get(index);
        long finish = System.currentTimeMillis();

        return finish - start;
    }

    /**
     * 1천번째 원소까지 오름차순으로 삭제할때 걸리는 시간
     * @param linkedList
     * @return
     */
    private static long remove(List<Integer> linkedList) {
        long start = System.currentTimeMillis();
        for (int i=0; i<1000; i++) {
            linkedList.remove(i);
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }

    /**
     * 마지막에서부터 순차적으로 삭제했을때 걸리는 시간
     * @param linkedList
     * @return
     */
    private static long removeAll(List<Integer> linkedList) {
        long start = System.currentTimeMillis();
        for (int i=linkedList.size()-1; i > 0; i--) {
            linkedList.remove(i);
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }

}

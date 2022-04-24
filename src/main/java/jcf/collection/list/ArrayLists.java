package jcf.collection.list;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        System.out.println("ArrayList에 원소를 1천만개를 할당");
        System.out.println("add(arrayList) = " + add(arrayList));
        System.out.println();
        System.out.println("특정 원소에 1천번 값 재할당");
        System.out.println("add(arrayList) = " + reAdd(arrayList));
        System.out.println();
        System.out.println("ArrayList의 중간에 할당되어 있는 원소의 값을 구할때 걸리는 시간");
        System.out.println("find(arrayList) = " + find(arrayList, arrayList.size()/2));
        System.out.println();
        System.out.println("1천번째 원소까지 오름차순으로 삭제");
        System.out.println("remove(arrayList) = " + remove(arrayList));
        System.out.println();
        System.out.println("뒤에서 부터 내림차순으로 삭제");
        System.out.println("remove(arrayList) = " + removeAll(arrayList));

        /** Result
         *
         * ArrayList에 원소를 1천만개를 할당
         * add(arrayList) = 402
         *
         * 특정 원소에 1천번 값 재할당
         * add(arrayList) = 11947
         *
         * ArrayList의 중간에 할당되어 있는 원소의 값을 구할때 걸리는 시간
         * find(arrayList) = 0
         *
         * 1천번째 원소까지 오름차순으로 삭제
         * remove(arrayList) = 10680
         *
         * 뒤에서 부터 내림차순으로 삭제
         * remove(arrayList) = 33
         *
         */
    }

    /**
     * ArrayList에 순차적으로 1천만개의 원소들의 값을 할당하는데에 걸리는 시간
     * @param arrayList
     * @return currentTimeMillis
     */
    private static long add(List<Integer> arrayList) {
        long start = System.currentTimeMillis();
        for (int i=0; i<10000000; i++) {
            arrayList.add(i);
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }

    /**
     * 특정 원소에 1천번 값 재할당 할때 걸리는 시간
     * @param arrayList
     * @return currentTimeMillis
     */
    private static long reAdd(List<Integer> arrayList) {
        long start = System.currentTimeMillis();
        for (int i=0; i<1000; i++) {
            arrayList.add(500, 1234); // 500번째의 원소에 1234(long) 값을 천번 재할당
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }

    /**
     * 특정 원소의 값을 찾는데 걸리는 시간
     * @param arrayList
     * @param index
     * @return
     */
    private static long find(List<Integer> arrayList, int index) {
        long start = System.currentTimeMillis();
        arrayList.get(index);
        long finish = System.currentTimeMillis();

        return finish - start;
    }

    /**
     * 1천번째 원소까지 오름차순으로 삭제할때 걸리는 시간
     * @param arrayList
     * @return
     */
    private static long remove(List<Integer> arrayList) {
        long start = System.currentTimeMillis();
        for (int i=0; i<1000; i++) {
            arrayList.remove(i);
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }

    /**
     * 마지막에서부터 순차적으로 삭제했을때 걸리는 시간
     * @param arrayList
     * @return
     */
    private static long removeAll(List<Integer> arrayList) {
        long start = System.currentTimeMillis();
        for (int i=arrayList.size()-1; i > 0; i--) {
            arrayList.remove(i);
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }

}

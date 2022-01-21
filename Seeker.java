public class Seeker<T extends Comparable<T>>{

    public boolean isSmallest(T[] list,T item){
        boolean isSmall = true;
        for(int i = 0; i < list.length && isSmall; i++){
            if(list[i].compareTo(item) < 0){
                isSmall = false;
            }
        }
        return isSmall;
    }
}

class Counter{
    private int count;

    public void  increments(){
        count ++;
    }

    public void decrements(){
        if (count > 0){
            count --;
        }else{
            System.out.println("Hmmm!");
        }
    }

    public int getCount(){
        return count;
    }

    public Counter(int count){
        this.count = count;
    }
}

public class Project{
    public static void main(String[] args) {
        Counter counter = new Counter(12);

        counter.increments();
        counter.increments();
        counter.increments();
        System.out.println(counter.getCount());

        counter.decrements();
        System.out.println(counter.getCount());

        Counter counter2 = new Counter(0);
        counter2.decrements();
        System.out.println(counter2.getCount());
    }
}
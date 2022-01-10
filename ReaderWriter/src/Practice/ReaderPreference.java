package Practice;

public class ReaderPreference {

    private boolean activeWriter;
    private int activeReader;
    private int waitingReaders;

    private int sharedInt;

    public synchronized void acquireReader(){
        waitingReaders++;
        while(activeWriter){
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        waitingReaders--; // now it is granted access;
        activeReader++;
    }

    public synchronized void releaseReader(){
        activeReader--;
        if (activeReader == 0) {
            notifyAll();
        }
    }

    public synchronized void acquireWriter(){
        while(activeWriter || activeReader > 0 || waitingReaders > 0){
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        activeWriter = true;
    }

    public synchronized void releaseWriter(){
        activeWriter = false;
        notifyAll();
    }

    public int readInt(){
        return sharedInt;
    }

    public void incrementInt(){
        sharedInt++;
    }

}

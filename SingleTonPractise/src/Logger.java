import java.io.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Logger {
    private File logFile;
    private static Logger instance;
    private static Lock lock = new ReentrantLock();

    private Logger() {
        this.logFile = new File("Logfile.txt");
    }

    public synchronized static Logger getInstance(){
        if (instance == null) {
            synchronized (lock) {
                instance = new Logger();
            }
        }
        return instance;
    }
    public void log(String txt){
        try {
            Writer out = new BufferedWriter(new FileWriter(logFile,true));
            out.append(txt);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package singleton;

public class ThreadSingleton {


        private static ThreadSingleton th;

        private ThreadSingleton(){}

        public static synchronized ThreadSingleton getInstance(){
            if(th == null){
               th = new ThreadSingleton();
            }
            return th;
        }

        public void view(){
            System.out.println("this is a thread safety Singleton pattern");
        }


}

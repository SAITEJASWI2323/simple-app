public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Java CI/CD Application Started...");
        
        // This loop is CRITICAL to keep the container alive in Kubernetes
        while (true) {
            Thread.sleep(5000);
            System.out.println("Heartbeat: App is still running...");
        }
    }
}


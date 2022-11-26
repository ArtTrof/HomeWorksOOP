package task3_4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your key:");
        String key = in.nextLine();

        switch (key){
            case "pro":
                ProDocumentWorker worker = new ProDocumentWorker();
                worker.openDocument();
                worker.editDocument();
                worker.saveDocument();
                break;
            case "pro exp":
                ExpertDocumentWorker worker1 = new ExpertDocumentWorker();
                worker1.openDocument();
                worker1.editDocument();
                worker1.saveDocument();
                break;
            default:
                DocumentWorker worker3 = new DocumentWorker();
                worker3.openDocument();
                worker3.editDocument();
                worker3.saveDocument();



        }
    }
}

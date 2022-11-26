package task3_4;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    void saveDocument(){
        System.out.println("Документ збережено у новому форматі");
    }
}

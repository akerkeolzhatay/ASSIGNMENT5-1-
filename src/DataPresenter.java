public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.displayCurrentData(model.getData());
        String newData = view.getNewData();
        model.updateData(newData);

        System.out.println("Data updated to: " + model.getData());
        System.out.println("Performing more operations... ");

        String moreData = view.getMoreData();
        model.appendData(moreData);

        view.displayFinalData(model.getData());
    }
}
package controller;

import view.AppView;

public class AppController {

    private AppView appView;

    public AppController() {
        this.appView = new AppView();
    }

    public static void main(String[] args) throws Exception {
        AppController appController = new AppController();
        appController.appView.run(args);
    }
}

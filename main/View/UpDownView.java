package main.View;

import main.utils.AppUtils;

public class UpDownView {
    public static void upDownMenu() {

        ListView.printMenu(ListView.upDownList);
        int choice = AppUtils.getIntWithBound("Input choice", 1, 2);
        switch (choice) {
            case 1:
               UpView.upMenu(choice);
                break;
            case 2:
                DownView.downMenu(choice);
                break;
            default:
                upDownMenu();
        }
    }
}

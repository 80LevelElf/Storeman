package Managers;

import javafx.scene.control.Alert;

/**
 * Created by Rustam Salakhutdinov on 26.04.2016.
 */
public final class AlertManager {
    public static final void showWarning(String title, String header, String contentText)
    {
        showAlert(title, header, contentText, Alert.AlertType.WARNING);
    }

    public static final void showError(String title, String header, String contentText)
    {
        showAlert(title, header, contentText, Alert.AlertType.ERROR);
    }

    private static final void showAlert(String title, String header, String contentText, Alert.AlertType type)
    {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(contentText);

        alert.showAndWait();
    }
}

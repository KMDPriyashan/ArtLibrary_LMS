package Controller.Books.IssueBook;

import Model.issueBook;
import db.DBConnection;
import scene.SceneManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class issueBookController {

    Connection connection = DBConnection.getInstance().getConnection();

    public void databaseSaveIssueBookDetails (issueBook issuebook){

        String addIssueBookSql = "INSERT INTO issueBook (issueID, borrowMember, borrowBook, issuedate, duedate) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(addIssueBookSql);
            preparedStatement.setString(1,issuebook.getIssueID());
            preparedStatement.setString(2,issuebook.getBorrowMember());
            preparedStatement.setString(3,issuebook.getBorrowBook());
            preparedStatement.setString(4,issuebook.getIssueDate());
            preparedStatement.setString(5,issuebook.getDueDate());

            int addIssueBookQuaryResult = preparedStatement.executeUpdate();

            if (addIssueBookQuaryResult > 0){
                SceneManager.switchPage("/view/successNotification/AddBookSuccessNotification.fxml");
            }else {
                SceneManager.switchPage("/view/FailedNotification/AddIssueBookFailedNotification.fxml");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

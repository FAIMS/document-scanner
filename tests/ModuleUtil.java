package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Document
     */
    public static View get_Document(Solo solo) {
        String ref = "Document";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  User
     */
    public static View get_User(Solo solo) {
        String ref = "User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Control
     */
    public static View get_Control_Control(Solo solo) {
        String ref = "Control/Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Document/Attach_Photos
     */
    public static View get_Document_AttachPhotos(Solo solo) {
        String ref = "Document/Attach_Photos";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Document/Document
     */
    public static View get_Document_Document(Solo solo) {
        String ref = "Document/Document";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User/User
     */
    public static View get_User_User(Solo solo) {
        String ref = "User/User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Control/Create_New_Document
     */
    public static View get_Control_Control_CreateNewDocument(Solo solo) {
        String ref = "Control/Control/Create_New_Document";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Document/Attach_Photos/Attach_New_Photos_Button_1
     */
    public static View get_Document_AttachPhotos_AttachNewPhotosButton1(Solo solo) {
        String ref = "Document/Attach_Photos/Attach_New_Photos_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Document/Document/Scan_Barcode
     */
    public static View get_Document_Document_ScanBarcode(Solo solo) {
        String ref = "Document/Document/Scan_Barcode";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Document/Attach_Photos/Attach_New_Photos
     */
    public static View get_Document_AttachPhotos_AttachNewPhotos(Solo solo) {
        String ref = "Document/Attach_Photos/Attach_New_Photos";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Document/Document/Author
     */
    public static EditText get_Document_Document_Author(Solo solo) {
        String ref = "Document/Document/Author";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Document/Document/Barcode
     */
    public static EditText get_Document_Document_Barcode(Solo solo) {
        String ref = "Document/Document/Barcode";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Document/Document/Notes
     */
    public static EditText get_Document_Document_Notes(Solo solo) {
        String ref = "Document/Document/Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Document/Document/Title
     */
    public static EditText get_Document_Document_Title(Solo solo) {
        String ref = "Document/Document/Title";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Document/Document/Year_of_Publication
     */
    public static EditText get_Document_Document_YearofPublication(Solo solo) {
        String ref = "Document/Document/Year_of_Publication";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  User/User/Users
     */
    public static View get_User_User_Users(Solo solo) {
        String ref = "User/User/Users";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Document/Attach_Photos/Guide
     */
    public static View get_Document_AttachPhotos_Guide(Solo solo) {
        String ref = "Document/Attach_Photos/Guide";
        return (android.view.View) solo.getView((Object) ref);
    }
}

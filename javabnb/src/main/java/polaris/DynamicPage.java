package polaris;

import java.util.ArrayList;

/**
 * Interface for all the pages that
 * changes its content while the program
 * executes.
 */
public interface DynamicPage {
    ArrayList<Object> items = new ArrayList<>();
    default void reload(){
        deleteDynamicContent();
        reloadContent();
        createDynamicContent();
    }
    /**
     * Reloads all the existing content changing their data.
     * To be used with dynamic content, deleteDynamicContent()
     * should be called at first and createDynamicContent() at last.
     */
    void reloadContent();
    /**
     * Deletes a component that was created dynamically
     */
    void deleteDynamicContent();
    /**
     * Creates a component dynamically.
     * Note: to access again the content should be stored
     * in a local variable, specially if this method is
     * used in conjunction with deleteDynamicContent();
     */
    void createDynamicContent();
}

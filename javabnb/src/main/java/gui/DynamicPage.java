package gui;

/**
 * Interface for all the pages that
 * changes its content while the program
 * executes.
 */
public interface DynamicPage {
    /**
     * Reloads all the existing content changing their data
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

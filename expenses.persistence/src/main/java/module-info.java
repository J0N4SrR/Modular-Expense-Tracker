module expenses.persistence {
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires expenses.core;
    exports expenses.persistence;
}
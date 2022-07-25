package budgetBalance;

import java.time.LocalDate;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class DatePicker {
    
    LocalDate ld ;
    CompoundBorder cb ;
    boolean enabled ;

    public void setDate(LocalDate of) {
	// Do almost nothing.
	ld = of ;
    }
/* Dummy to eliminate errors. */

    public Border getBorder() {
	// Do nothing.
	return null;
    }

    public void setBorder(CompoundBorder createCompoundBorder) {
	// Do almost nothing.
	cb = createCompoundBorder ;
    }

    public void setDateToToday() {
	// Do nothing.
    }

    public void setEnabled(boolean b) {
	// Do almost nothing.
	enabled = b ;
    }

    public LocalDate getDate() {
	// Do nothing.
	return null;
    }
}

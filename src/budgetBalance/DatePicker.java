package budgetBalance;

import java.time.LocalDate;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class DatePicker {
    
    LocalDate ld ;
    CompoundBorder cb ;
    boolean enabled ;

    public void setDate(LocalDate of) {
	// TODO Auto-generated method stub
	// Do almost nothing.
	ld = of ;
    }
/* Dummy to eliminate errors. */

    public Border getBorder() {
	// TODO Auto-generated method stub
	// Do nothing.
	return null;
    }

    public void setBorder(CompoundBorder createCompoundBorder) {
	// TODO Auto-generated method stub
	// Do almost nothing.
	cb = createCompoundBorder ;
    }

    public void setDateToToday() {
	// TODO Auto-generated method stub
	// Do nothing.
    }

    public void setEnabled(boolean b) {
	// TODO Auto-generated method stub
	// Do almost nothing.
	enabled = b ;
    }

    public LocalDate getDate() {
	// TODO Auto-generated method stub
	// Do nothing.
	return null;
    }
}

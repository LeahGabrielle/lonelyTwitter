package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTests extends
	ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTests() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSendText(){
		String text = "Hello world.";
		IntentReaderActivity activity = startWithText(text,IntentReaderActivity.NORMAL);
		assertEquals("got the text?", text, activity.getText());
	}
	
	public void testDoubleText(){
		String text = "Hello world.";
		IntentReaderActivity activity = startWithText(text,IntentReaderActivity.DOUBLE);
		assertEquals("double text?", text+text, activity.getText());	
	}
	
	public void testReverseText(){
		String text = "Hello world";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("reverse text?", "dlrow olleH", activity.getText());
	}
	
	public void testDefault(){
		String text = "";
		IntentReaderActivity activity = startWithText(text,IntentReaderActivity.NORMAL);
		assertEquals("default text?", "default", activity.getText());
	}
	
	public void testVisible(){
		String text = "yo";
		IntentReaderActivity activity = startWithText(text,IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(),view);
	}
	
	public void testDisplayText(){
		String text = "Hello darkness, my old friend";
		IntentReaderActivity activity = startWithText(text,IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("correct text?", text, view.getText());
	}
	
	private IntentReaderActivity startWithText(String text, int mode){
		if (text.equals("")){
			text = "default";
		}
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, mode);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
}

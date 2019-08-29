package cn.edu.nsu.xiaoxueqi.db.test;

public class Test {
	private int Test_Id;
	private  int Type_id;
	private  int Subject_Id;
	private  int Unit_ID;
    private String Test_Text;
	private String Test_Option;
	private String Test_Answer;
	private  int Test_Score;
	@Override
	public String toString() {
		return "Test [Test_Id=" + Test_Id + ", Type_id=" + Type_id + ", Subject_Id=" + Subject_Id + ", Unit_ID="
				+ Unit_ID + ", Test_Text=" + Test_Text + ", Test_Option=" + Test_Option + ", Test_Answer=" + Test_Answer
				+ ", Test_Score=" + Test_Score + "]";
	}
	public int getTest_Id() {
		return Test_Id;
	}
	public void setTest_Id(int test_Id) {
		Test_Id = test_Id;
	}
	public int getType_id() {
		return Type_id;
	}
	public void setType_id(int type_id) {
		Type_id = type_id;
	}
	public int getSubject_Id() {
		return Subject_Id;
	}
	public void setSubject_Id(int subject_Id) {
		Subject_Id = subject_Id;
	}
	public int getUnit_ID() {
		return Unit_ID;
	}
	public void setUnit_ID(int unit_ID) {
		Unit_ID = unit_ID;
	}
	public String getTest_Text() {
		return Test_Text;
	}
	public void setTest_Text(String test_Text) {
		Test_Text = test_Text;
	}
	public String getTest_Option() {
		return Test_Option;
	}
	public void setTest_Option(String test_Option) {
		Test_Option = test_Option;
	}
	public String getTest_Answer() {
		return Test_Answer;
	}
	public void setTest_Answer(String test_Answer) {
		Test_Answer = test_Answer;
	}
	public int getTest_Score() {
		return Test_Score;
	}
	public void setTest_Score(int test_Score) {
		Test_Score = test_Score;
	}
	
}

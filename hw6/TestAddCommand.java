
public class TestAddCommand {
	private AddCommand objUnderTest;

	void testExecute() {
		AddCommand a1 = Mockito.mock(AddCommand.class);
		AddCommand a2 = Mockito.mock(AddCommand.class);

	}
	void testundo() {
		AddCommand a1 = Mockito.mock(AddCommand.class);
		AddCommand a2 = Mockito.mock(AddCommand.class);

	}
	void testredo() {
		AddCommand a1 = Mockito.mock(AddCommand.class);
		AddCommand a2 = Mockito.mock(AddCommand.class);

		Mockito.when(a1.redo()).thenReturn("Test1");
		Mockito.when(a2.redo()).thenReturn("Test2");

		objUnderTest.init( a1,a2);
		String expected = "Test 1, Test 2";
		// String ret = objUnderTest.showDistribution(); --> what would this be here?
		//assertEquals(a1, objUnderTest.get(0)); //?
		//assertEquals(d2, objUnderTest.get(1));//?
		assertEquals(expected, ret);

		//Mockito.verify(a1, Mockito.times(36)).roll(); ?
		//Mockito.verify(a2, Mockito.times(36)).roll(); ?

	}
}

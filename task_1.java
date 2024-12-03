@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Пользователю не больше 18 лет", true, isAdult);
	// Напиши код здесь
}

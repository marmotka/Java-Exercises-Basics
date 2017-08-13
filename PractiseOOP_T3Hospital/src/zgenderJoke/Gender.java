package zgenderJoke;

public interface Gender {
	String name();

	boolean isCompatibleWith(Gender otherGender);

	public static final Gender MALE = new Gender() {

		@Override
		public String name() {
			return "Male";
		}

		@Override
		public boolean isCompatibleWith(Gender otherGender) {
			return otherGender.name().equals(name());
		}
	};

	public static final Gender FEMALE = new Gender() {

		@Override
		public String name() {
			return "Female";
		}

		@Override
		public boolean isCompatibleWith(Gender otherGender) {
			return otherGender.name().equals(name());
		}
	};

	public static final Gender CISTRANS = new Gender() {

		@Override
		public String name() {
			// TODO Auto-generated method stub
			return "Cis-Trans";
		}

		@Override
		public boolean isCompatibleWith(Gender otherGender) {
			// Not compatible with anybody
			return false;
		}

	};
}

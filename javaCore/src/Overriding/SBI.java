package Overriding;

public class SBI {
	ublic class SBI extends RBI {
		@Override
		public float getRateOfInterest() {
			return 7.0f;
		}

		public SBI getObject() {
			return this;
		}
	}



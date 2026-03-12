package lu.list.swrdi.formulaKPI.evaluation;

import java.util.ArrayList;
import java.util.List;

import com.google.common.math.DoubleMath;

@SuppressWarnings("rawtypes")
public interface Value<T> extends Comparable{
	public T getValue();
	
	public class NullValue implements Value<Object>{
		@Override
		public Double getValue() {
			return null;
		}

		@Override
		public int compareTo(Object o) {
			return 0;
		}
		
		@Override
		public boolean equals(Object o) {
			return true;
		}
	}
	
	public class DoubleValue implements Value<Double>{
		private Double value = 0.0;
		
		@Override
		public Double getValue() {
			return value;
		}

		DoubleValue(double d) {
		  value = d;
		}
		
		@Override
		public boolean equals(Object other) {
			if(!(other instanceof DoubleValue)) return false;
			return DoubleMath.fuzzyEquals(this.value, ((DoubleValue) other).getValue(), 0.0001);
		}

		@Override
		public int compareTo(Object o) {
			Double other;
			if (o instanceof DoubleValue) {
				other = ((DoubleValue) o).getValue();
			} else if (o instanceof Double) {
				other = (Double) o;
			} else {
				return 0;
			}
			if(DoubleMath.fuzzyEquals(this.value, other, 0.0001)) {
				return 0;
			}
			return this.value < other ? -1 : 1;
		}
	}
	
	public class ListValue<T> implements Value<List<Value<T>>>{
		private List<Value<T>> values = new ArrayList();
		
		@Override
		public List<Value<T>> getValue() {
			return values;
		}
		
		ListValue() {}
		ListValue(List<Value<T>> list) {
			values = list;
		}
		public boolean equals(Object other) {
			if(!(other instanceof ListValue)) return false;
			List otherList = ((ListValue) other).getValue();
			if(otherList.size() != this.values.size()) return false;
			for(int i = 0; i<this.values.size(); i++) {
				if(!this.values.get(i).equals(otherList.get(i))) {
					return false;
				}
			}
			return true;
		}

		@Override
		@SuppressWarnings("unchecked")
		public int compareTo(Object obj) {
			List<Value<T>> o;
			if (obj instanceof ListValue) {
				o = ((ListValue<T>) obj).getValue();
			} else if (obj instanceof List) {
				o = (List<Value<T>>) obj;
			} else {
				return 0;
			}
			boolean equal = true;
			for(int i = 0; i<this.values.size(); i++) {
				if(!this.values.get(i).equals(o.get(i))) {
					equal = false;
				}
			}
			
			if(equal) {
				return 0;
			}
			return this.values.size() < o.size() ? -1 : 1;
		}
	}
}

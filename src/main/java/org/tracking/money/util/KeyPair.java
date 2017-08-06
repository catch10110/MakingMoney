package org.tracking.money.util;

public class KeyPair {
	
	public Object key1, key2;
	
	public KeyPair(Object key1, Object key2) {
		this.key1 = key1;
		this.key2 = key2;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof KeyPair)) return false;
		
		KeyPair ref = (KeyPair) obj;
		if(!this.key1.equals(ref.key1)) return false;
		if(!this.key2.equals(ref.key2)) return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int hc1 = this.key1 != null ? this.key1.hashCode() : 0;
		int hc2 = this.key2 != null ? this.key2.hashCode() : 0;
		
		return hc1 ^ hc2;
	}
}

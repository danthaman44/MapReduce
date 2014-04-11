package reduce;

import output.*;
import java.io.IOException;

import keyvaluepair.KeyValuePair;

public interface Reducer<K, V> {
	
	public void reduce();
	public void addKVP(KeyValuePair kvp);
	public void receiveEOF(int port);
	
}
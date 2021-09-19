package hr.oop.practice.streams;

import java.io.IOException;

public class ResourceProto {
protected int p;
public ResourceProto(int p) {
this.p = p;
System.out.println(p + " created");
}
public void close() throws IOException {
System.out.println(p + " closed in Proto");
}
public void work() throws ResourceException {
if (p == 2)
throw new ResourceException();
System.out.println(p + " work ends " + p);
}
}

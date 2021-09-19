package hr.oop.practice.streams;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Resource extends ResourceProto implements Closeable {
	 public Resource(int p) {
	 super(p);
	 }
	 public static void main(String[] args) {
	 List<Resource> resources = new ArrayList<>();
	 resources.add(new Resource(1));
	 resources.add(new Resource(2));
	 resources.add(new Resource(3));
	 for (Resource r : resources) {
	 try (r) {
	 r.work();
	 } catch (ResourceException e) {
	 System.out.println("Resource Exception");
	 } catch (IOException e) {
	 System.out.println("IO Exception");
	 } catch (RuntimeException e) {
	 System.out.println("Runtime Exception");
	 }
	 }
	 try (Resource r3 = new Resource(9); Resource r1 = new Resource(-1);) {
	 Resource r0 = new Resource(0);
	 r3.work();
	 r1.work();
	 r0.work();
	 System.out.println("try ends");
	 } catch (Exception e) {
	 System.out.println("exception");
	 return;
	 } finally {
	 System.out.println("finally");
	 }
	 System.out.println("end");
	 }
	}
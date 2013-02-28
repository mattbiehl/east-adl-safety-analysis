package mtrunner;
import hiphops.BasicEvent;
import hiphops.Component;
import hiphops.Implementation;
import hiphops.Line;
import hiphops.Model;
import hiphops.OutputDeviation;
import hiphops.Port;
import hiphops.System;
import hiphops.impl.HiphopsPackageImpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

public class Trafo {

	private StringWriter w;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Trafo t = new Trafo();
		t
				.transform(
						"C:\\_matt\\\\atesst\\atesst-svn\\WP4\\WT4.3\\Hip Hops Plugin Profile 2.1\\examples\\EAST-TEST\\test.hiphops",
						"C:\\_matt\\\\atesst\\atesst-svn\\WP4\\WT4.3\\Hip Hops Plugin Profile 2.1\\examples\\EAST-TEST\\ErrorModel.xml");

	}

	public Trafo() {
		w = new StringWriter();
	}

	public void transform(String filename, String outfilename) {
		HiphopsPackageImpl.init();
		registerFileExtension("hiphops");
		Model root = (Model) loadFile(filename);
		w.write("<?xml version='1.0' encoding='iso-8859-1' ?>");
		visit(root);
		try {
			FileOutputStream fo = new FileOutputStream(outfilename);
			fo.write(w.toString().getBytes());
			fo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void registerFileExtension(String extension) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				extension, new XMIResourceFactoryImpl());
	}

	public static void saveFile(String filename, EObject root) {
		Resource resource = new XMLResourceImpl(URI.createFileURI(filename));
		resource.getContents().add(root);
		try {
			resource.save(null);
		} catch (IOException e) {
		}
	}

	public static EObject loadFile(String filename) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(
				URI.createURI(filename), true);
		Model m = (Model) (resource.getContents().get(0));
		if (m.getSystem().size()<1) 
			m = (Model) (resource.getContents().get(1));
		return m;
	}

	public void visit(Model o) {
		w.write("<Model>");
		w.write("<Name>ErrorModel</Name>");
		w.write("<Perspectives>");
		for (System s : o.getSystem()) {
			visitp(s);
		}
		w.write("</Perspectives>");
		w.write("</Model>");
	}

	public void visitp(System o) {
		if (!((o.getName() == null) || (o.getName().length() == 0))) {
			w.write("<Perspective>");
			w.write("<Name>"+o.getName()+"</Name>");
			w.write("<System>");
			w.write("<Name>"+o.getName()+"</Name>");
			w.write("<Components>");
			for (Component s : o.getComponent()) {
				visit(s);
			}
			w.write("</Components>");
			w.write("<Lines>");
			for (Line s : o.getLines()) {
				visit(s);
			}
			w.write("</Lines>");
			w.write("</System> ");
			w.write("</Perspective> ");
		}
	}

	public void visit(System o) {
		if (!((o.getName() == null) || (o.getName().length() == 0))) {
			w.write("<System>");
			w.write("<Name>"+o.getName()+"</Name>");
			w.write("<Components>");
			for (Component s : o.getComponent()) {
				visit(s);
			}
			w.write("</Components>");
			w.write("<Lines>");
			for (Line s : o.getLines()) {
				visit(s);
			}
			w.write("</Lines>");
			w.write("</System> ");
		}
	}

	public void visit(Component o) {
		w.write("<Component> ");
		w.write("<Name>"+o.getName()+"</Name>");
		w.write("<Ports>");
		for (Port s : o.getPorts()) {
			visit(s);
		}
		w.write("</Ports>");
		if (o.getAllocation().length() > 0) {
			w.write("<Allocations> ");
			w.write("<Current>"+o.getAllocation()+"</Current> ");
			// if (o.getAllocalternatives().size() > 0) {
			// w.write("<Alternatives>");
			// for (AllocAlternative s : o.getAllocalternatives()) {
			// visit(s);
			// }
			// w.write("</Alternatives>");
			// }
			w.write("</Allocations>");
		}
		w.write("<Implementations>");
		visit(o.getImplementation());
		w.write("</Implementations>");
		w.write("</Component>");
	}

	public void visit(Port o) {
		w.write("<Port>");
		w.write("<Name>"+o.getName()+"</Name>");
		w.write("</Port>");
	}

	public void visit(Implementation o) {
		w.write("<Current>");
		w.write("<Name>"+o.getName()+"</Name>");
		w.write("<Cost>0</Cost>");
		w.write("<FailureData>");
		w.write("<BasicEvents>");
		for (BasicEvent s : o.getFData().getBasicEvents().getBasicEvent()) {
			visit(s);
		}
		w.write("</BasicEvents>");
		w.write("<OutputDeviations>");
		for (OutputDeviation s : o.getFData().getOutputDeviations()
				.getOutputDeviation()) {
			visit(s);
		}
		w.write("</OutputDeviations>");
		w.write("<ExportedPropagations>");
		for (OutputDeviation s : o.getFData().getOutputDeviations()
				.getOutputDeviation()) {
			visite(s);
		}
		w.write("</ExportedPropagations>");
		w.write("</FailureData>");
		for (System s : o.getSystem()) {
			visit(s);
		}
		w.write("</Current>");
	}

	public void visit(BasicEvent o) {
		w.write("<BasicEvent>");
		w.write("<Name>"+o.getName()+"</Name>");
		w.write("<UnavailabilityFormula><None/></UnavailabilityFormula>");
		w.write("</BasicEvent>");
	}

	public void visit(OutputDeviation o) {
		w.write("<OutputDeviation>");
		w.write("<Name>"+o.getName()+"</Name>");
		if (o.isSystemOutPort())
			w.write("<SystemOutport>true</SystemOutport>");
		w.write("<FailureExpression>"+o.getDefaultString()+"</FailureExpression>");
		w.write("</OutputDeviation>");
	}

	public void visite(OutputDeviation o) {
		w.write("<ExportedPropagation>");
		w.write("<Name>"+o.getName()+"</Name>");
		w.write("<FailureExpression>"+o.getDefaultString()+"</FailureExpression>");
		w.write("</ExportedPropagation>");
	}

	public void visit(Line o) {
		if (!((o.getP1() == null) || (o.getP2() == null)
				|| (o.getP1().length() == 0) || (o.getP2().length() == 0))) {
			w.write("<Line><Default>OR</Default><Type>Directed</Type><Name>"+o.getName()+"</Name><Connections><Connection><Port>"+o.getP1()+"</Port><PortExpression>"+o.getP2()+"</PortExpression></Connection></Connections></Line>");
		}
	}

}

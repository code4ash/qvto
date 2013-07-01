package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLContainmentVisitor;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DictLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DictLiteralPartCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DictTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ListLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ListTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ReturnExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.util.ImperativeOCLCSVisitor;

public abstract class AbstractImperativeOCLContainmentVisitor extends EssentialOCLContainmentVisitor 
	implements ImperativeOCLCSVisitor<Continuation<?>>{

	public AbstractImperativeOCLContainmentVisitor(CS2PivotConversion context) {
		super(context);
	}
	
	@Nullable
	public Continuation<?> visitDictLiteralExpCS(DictLiteralExpCS object) {
		return visitExpCS(object);
	}
	
	@Nullable
	public Continuation<?> visitDictLiteralPartCS(DictLiteralPartCS object) {
		return visitElementCS(object);
	}
	
	@Nullable
	public Continuation<?> visitDictTypeCS(DictTypeCS object) {
		return visitTypedRefCS(object);
	}
	
	@Nullable
	public Continuation<?> visitListLiteralExpCS(ListLiteralExpCS object) {
		return visitExpCS(object);
	}
	
	@Nullable
	public Continuation<?> visitListTypeCS(ListTypeCS object) {
		return visitTypedRefCS(object);
	}
	
	@Nullable
	public Continuation<?> visitReturnExpCS(ReturnExpCS object) {
		return visitExpCS(object);
	}
}

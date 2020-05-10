// Generated from Shadow.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShadowParser}.
 */
public interface ShadowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShadowParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ShadowParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ShadowParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ShadowParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ShadowParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ShadowParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ShadowParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(ShadowParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(ShadowParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(ShadowParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(ShadowParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(ShadowParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(ShadowParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(ShadowParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(ShadowParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(ShadowParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(ShadowParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(ShadowParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(ShadowParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(ShadowParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(ShadowParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(ShadowParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(ShadowParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(ShadowParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(ShadowParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(ShadowParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(ShadowParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(ShadowParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(ShadowParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(ShadowParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(ShadowParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ShadowParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ShadowParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(ShadowParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(ShadowParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ShadowParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ShadowParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(ShadowParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(ShadowParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(ShadowParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(ShadowParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(ShadowParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(ShadowParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ShadowParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ShadowParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(ShadowParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(ShadowParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ShadowParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ShadowParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(ShadowParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(ShadowParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(ShadowParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(ShadowParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(ShadowParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(ShadowParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ShadowParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ShadowParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(ShadowParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(ShadowParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(ShadowParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(ShadowParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(ShadowParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(ShadowParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(ShadowParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(ShadowParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ShadowParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ShadowParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ShadowParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ShadowParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(ShadowParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(ShadowParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ShadowParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ShadowParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(ShadowParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(ShadowParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(ShadowParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(ShadowParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(ShadowParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(ShadowParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(ShadowParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(ShadowParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ShadowParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ShadowParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ShadowParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ShadowParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(ShadowParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(ShadowParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(ShadowParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(ShadowParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ShadowParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ShadowParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(ShadowParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(ShadowParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(ShadowParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(ShadowParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(ShadowParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(ShadowParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(ShadowParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(ShadowParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ShadowParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ShadowParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ShadowParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ShadowParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(ShadowParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(ShadowParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ShadowParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ShadowParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(ShadowParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(ShadowParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(ShadowParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(ShadowParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ShadowParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ShadowParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ShadowParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ShadowParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ShadowParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ShadowParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(ShadowParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(ShadowParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(ShadowParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(ShadowParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(ShadowParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(ShadowParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(ShadowParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(ShadowParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(ShadowParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(ShadowParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(ShadowParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(ShadowParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(ShadowParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(ShadowParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(ShadowParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(ShadowParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(ShadowParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(ShadowParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(ShadowParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(ShadowParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(ShadowParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(ShadowParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(ShadowParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(ShadowParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ShadowParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ShadowParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(ShadowParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(ShadowParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(ShadowParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(ShadowParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(ShadowParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(ShadowParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(ShadowParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(ShadowParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ShadowParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ShadowParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ShadowParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ShadowParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ShadowParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ShadowParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(ShadowParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(ShadowParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(ShadowParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(ShadowParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(ShadowParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(ShadowParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(ShadowParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(ShadowParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(ShadowParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(ShadowParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(ShadowParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(ShadowParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ShadowParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ShadowParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(ShadowParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(ShadowParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(ShadowParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(ShadowParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ShadowParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ShadowParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(ShadowParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(ShadowParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(ShadowParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(ShadowParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(ShadowParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(ShadowParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(ShadowParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(ShadowParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(ShadowParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(ShadowParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ShadowParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ShadowParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(ShadowParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(ShadowParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(ShadowParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(ShadowParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(ShadowParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(ShadowParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(ShadowParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(ShadowParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(ShadowParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(ShadowParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ShadowParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ShadowParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(ShadowParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(ShadowParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(ShadowParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(ShadowParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(ShadowParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(ShadowParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(ShadowParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(ShadowParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(ShadowParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(ShadowParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(ShadowParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(ShadowParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(ShadowParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(ShadowParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(ShadowParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(ShadowParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(ShadowParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(ShadowParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(ShadowParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(ShadowParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(ShadowParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(ShadowParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(ShadowParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(ShadowParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(ShadowParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(ShadowParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(ShadowParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(ShadowParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(ShadowParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(ShadowParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ShadowParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ShadowParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(ShadowParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(ShadowParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(ShadowParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(ShadowParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(ShadowParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(ShadowParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(ShadowParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(ShadowParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(ShadowParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(ShadowParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(ShadowParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(ShadowParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(ShadowParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(ShadowParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(ShadowParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(ShadowParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ShadowParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ShadowParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(ShadowParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(ShadowParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ShadowParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ShadowParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(ShadowParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(ShadowParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ShadowParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ShadowParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ShadowParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ShadowParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(ShadowParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(ShadowParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ShadowParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ShadowParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(ShadowParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(ShadowParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(ShadowParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(ShadowParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(ShadowParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(ShadowParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(ShadowParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(ShadowParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(ShadowParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(ShadowParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ShadowParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ShadowParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ShadowParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ShadowParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(ShadowParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(ShadowParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(ShadowParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(ShadowParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(ShadowParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(ShadowParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(ShadowParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(ShadowParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ShadowParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ShadowParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ShadowParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ShadowParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(ShadowParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(ShadowParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(ShadowParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(ShadowParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(ShadowParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(ShadowParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(ShadowParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(ShadowParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ShadowParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ShadowParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(ShadowParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(ShadowParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ShadowParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ShadowParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ShadowParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ShadowParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(ShadowParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(ShadowParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(ShadowParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(ShadowParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(ShadowParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(ShadowParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ShadowParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ShadowParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ShadowParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ShadowParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(ShadowParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(ShadowParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(ShadowParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(ShadowParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(ShadowParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(ShadowParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ShadowParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ShadowParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ShadowParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ShadowParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ShadowParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ShadowParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ShadowParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ShadowParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(ShadowParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(ShadowParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(ShadowParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(ShadowParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(ShadowParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(ShadowParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ShadowParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ShadowParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(ShadowParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(ShadowParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(ShadowParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(ShadowParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(ShadowParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(ShadowParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(ShadowParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(ShadowParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(ShadowParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(ShadowParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(ShadowParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(ShadowParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ShadowParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ShadowParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ShadowParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ShadowParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(ShadowParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(ShadowParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(ShadowParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(ShadowParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(ShadowParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(ShadowParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(ShadowParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(ShadowParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ShadowParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ShadowParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ShadowParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ShadowParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(ShadowParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(ShadowParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ShadowParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ShadowParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ShadowParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ShadowParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(ShadowParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(ShadowParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(ShadowParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(ShadowParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(ShadowParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(ShadowParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(ShadowParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(ShadowParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(ShadowParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(ShadowParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(ShadowParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(ShadowParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(ShadowParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(ShadowParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ShadowParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ShadowParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(ShadowParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(ShadowParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(ShadowParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(ShadowParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(ShadowParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(ShadowParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(ShadowParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(ShadowParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(ShadowParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(ShadowParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ShadowParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ShadowParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(ShadowParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(ShadowParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(ShadowParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(ShadowParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(ShadowParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(ShadowParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(ShadowParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(ShadowParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(ShadowParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(ShadowParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(ShadowParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(ShadowParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ShadowParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ShadowParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ShadowParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ShadowParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(ShadowParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(ShadowParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(ShadowParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(ShadowParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(ShadowParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(ShadowParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(ShadowParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(ShadowParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ShadowParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ShadowParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ShadowParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ShadowParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(ShadowParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(ShadowParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ShadowParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ShadowParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ShadowParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ShadowParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(ShadowParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(ShadowParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(ShadowParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(ShadowParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(ShadowParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(ShadowParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(ShadowParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(ShadowParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ShadowParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ShadowParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ShadowParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ShadowParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ShadowParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ShadowParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(ShadowParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(ShadowParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ShadowParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ShadowParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ShadowParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ShadowParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ShadowParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ShadowParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(ShadowParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(ShadowParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(ShadowParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(ShadowParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(ShadowParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(ShadowParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ShadowParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ShadowParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(ShadowParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(ShadowParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(ShadowParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(ShadowParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(ShadowParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(ShadowParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(ShadowParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(ShadowParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShadowParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ShadowParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShadowParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ShadowParser.CastExpressionContext ctx);
}
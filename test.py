import time
import os
import sys
import claudecaller
import random

def main():
  """teststring = "hello world"
  print(teststring[:-7])
  print(f"{time.time():.0f}")
  print(f"{(time.time() % 10000):.0f}")
  current_time = f"{(time.time() % 10000):.0f}"
  print(current_time)
  folder_name = "sourcecode"
  if not os.path.exists(folder_name):
    os.makedirs(folder_name)
    print("folder created: " + folder_name)
  #claudecaller.call_claude("RuleBasedBibliographyPdfImporter.java")
  code_dir = "Sourcecode/"
  for file in os.listdir(code_dir):
    print(file)
  #print("random file: " + random.choice(os.listdir(code_dir)))
  print(code_dir)
  checked_files = []
  analysed_files_dir = "PMD_analysis_results"
  for file in os.listdir(analysed_files_dir):
    print(file)
    print(file[17:-6])"""
  ruleset = "AbstractClassWithoutAnyMethod, AssignmentInOperand, AssignmentToNonFinalStatic, AvoidAccessibilityAlteration, AvoidBranchingStatementAsLastInLoop, AvoidCatchingGenericException, AvoidDecimalLiteralsInBigDecimalConstructor, AvoidDollarSigns, AvoidInstanceofChecksInCatchClause, AvoidMessageDigestField, AvoidMultipleUnaryOperators, AvoidProtectedFieldInFinalClass, AvoidProtectedMethodInFinalClassNotExtending, AvoidStringBufferField, AvoidThreadGroup, AvoidUsingHardCodedIP, AvoidUsingOctalValues, AvoidUsingVolatile, BigIntegerInstantiation, BrokenNullCheck, CheckResultSet, CheckSkipResult, ClassCastExceptionWithToArray, ClassNamingConventions, ClassWithOnlyPrivateConstructorsShouldBeFinal, CloneMethodMustBePublic, CloneMethodMustImplementCloneable, CloneMethodReturnTypeMustMatchClassName, CloseResource, CollectionTypeMismatch, CompareObjectsWithEquals, ComparisonWithNaN, ConstantsInInterface, ControlStatementBraces, DanglingJavadoc, DefaultLabelNotLastInSwitch, DoNotCallGarbageCollectionExplicitly, DoNotExtendJavaLangError, DoNotExtendJavaLangThrowable, DontCallThreadRun, DontUseFloatTypeForLoopIndices, DoubleBraceInitialization, DoubleCheckedLocking, EmptyCatchBlock, EmptyControlStatement, EmptyFinalizer, EqualsNull, ExtendsObject, FinalFieldCouldBeStatic, FinalParameterInAbstractMethod, ForLoopCanBeForeach, ForLoopShouldBeWhileLoop, FormalParameterNamingConventions, GuardLogStatement, IdempotentOperations, IdenticalCatchBranches, ImplicitSwitchFallThrough, InstantiationToGetClass, JumbledIncrementer, LambdaCanBeMethodReference, LiteralsFirstInComparisons, LocalVariableNamingConventions, LogicInversion, LooseCoupling, MethodNamingConventions, MisplacedNullCheck, MissingOverride, MissingStaticMethodInNonInstantiatableClass, NonCaseLabelInSwitch, NonExhaustiveSwitch, NonStaticInitializer, NonThreadSafeSingleton, NoPackage, OneDeclarationPerLine, OptimizableToArrayCall, OverrideBothEqualsAndHashcode, OverrideBothEqualsAndHashCodeOnComparable, PackageCase, PreserveStackTrace, PrimitiveWrapperInstantiation, ProperCloneImplementation, ProperLogger, ReturnEmptyCollectionRatherThanNull, ReturnFromFinallyBlock, SimplifiableTestAssertion, SimplifiedTernary, SimplifyBooleanReturns, SimplifyConditional, SingleMethodSingleton, SingletonClassReturningNewInstance, SingularField, SuspiciousEqualsMethodName, SuspiciousHashcodeMethodName, SuspiciousOctalEscape, TypeParameterNamingConventions, UncommentedEmptyConstructor, UncommentedEmptyMethodBody, UnconditionalIfStatement, UnnecessaryAnnotationValueElement, UnnecessaryConstructor, UnnecessaryConversionTemporary, UnnecessaryFullyQualifiedName, UnnecessaryImport, UnnecessaryModifier, UnnecessaryReturn, UnnecessarySemicolon, UnsynchronizedStaticFormatter, UnusedFormalParameter, UnusedLabel, UnusedLocalVariable, UnusedNullCheckInEquals, UnusedPrivateField, UnusedPrivateMethod, UseCollectionIsEmpty, UseEqualsToCompareStrings, UselessOverridingMethod, UselessParentheses, UselessPureMethodCall, UselessQualifiedThis, UseLocaleWithCaseConversions, UseNotifyAllInsteadOfNotify, UseStandardCharsets, UseUtilityClass, VariableCanBeInlined"
  print(len(ruleset.split(",")))
def test(arg):
  print(arg)
if __name__ == "__main__":
  main()
package com.thoughtworks.qdox.model;

/**
 * @author Aslak Helles&oslash;y
 * @version $Revision: 327 $
 * @since 1.4
 */
public interface Member {
    String getDeclarationSignature(boolean withModifiers);
    String getCallSignature();
}
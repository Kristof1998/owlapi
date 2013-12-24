package org.semanticweb.owlapi.model;

import javax.annotation.Nonnull;

/** Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 07/08/2013 */
public interface OWLAnnotationPropertyProvider {
    /** Gets an instance of {@link OWLAnnotationProperty} that has the specified
     * {@code IRI}.
     * 
     * @param iri
     *            The IRI. Not {@code null}.
     * @return An {@link OWLAnnotationProperty} that has the specified IRI. Not
     *         {@code null}. */
    @Nonnull
    OWLAnnotationProperty getOWLAnnotationProperty(@Nonnull IRI iri);
}

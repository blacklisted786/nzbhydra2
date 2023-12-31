package org.nzbhydra.mapping.changelog;

/**
 * {@link ChangelogVersionEntry} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractChangelogVersionEntryAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class ChangelogVersionEntryAssert extends AbstractChangelogVersionEntryAssert<ChangelogVersionEntryAssert, ChangelogVersionEntry> {

    /**
     * Creates a new <code>{@link ChangelogVersionEntryAssert}</code> to make assertions on actual ChangelogVersionEntry.
     *
     * @param actual the ChangelogVersionEntry we want to make assertions on.
     */
    public ChangelogVersionEntryAssert(ChangelogVersionEntry actual) {
        super(actual, ChangelogVersionEntryAssert.class);
    }

    /**
     * An entry point for ChangelogVersionEntryAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myChangelogVersionEntry)</code> and get specific assertion with code completion.
     *
     * @param actual the ChangelogVersionEntry we want to make assertions on.
     * @return a new <code>{@link ChangelogVersionEntryAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static ChangelogVersionEntryAssert assertThat(ChangelogVersionEntry actual) {
        return new ChangelogVersionEntryAssert(actual);
    }
}

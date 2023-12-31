package org.nzbhydra.config.auth;

/**
 * {@link UserAuthConfig} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractUserAuthConfigAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class UserAuthConfigAssert extends AbstractUserAuthConfigAssert<UserAuthConfigAssert, UserAuthConfig> {

    /**
     * Creates a new <code>{@link UserAuthConfigAssert}</code> to make assertions on actual UserAuthConfig.
     *
     * @param actual the UserAuthConfig we want to make assertions on.
     */
    public UserAuthConfigAssert(UserAuthConfig actual) {
        super(actual, UserAuthConfigAssert.class);
    }

    /**
     * An entry point for UserAuthConfigAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myUserAuthConfig)</code> and get specific assertion with code completion.
     *
     * @param actual the UserAuthConfig we want to make assertions on.
     * @return a new <code>{@link UserAuthConfigAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static UserAuthConfigAssert assertThat(UserAuthConfig actual) {
        return new UserAuthConfigAssert(actual);
    }
}

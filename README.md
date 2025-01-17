# OAuth2.0-SpringSecurity

This project demonstrates how to implement OAuth 2.0 authentication in a Spring Boot application using Google and GitHub as authentication providers. It leverages Spring Security and Spring Boot's support for OAuth 2.0, allowing users to sign in with their Google or GitHub account.

## Features

- OAuth 2.0 authentication using Google and GitHub.
- Integration with Spring Security for secure user authentication and authorization.
- User details fetched from Google and GitHub accounts after successful login.
- Support for user sessions and security context management.

## Add OAuth 2.0 Credentials

### Google:

1. Go to [Google Developer Console](https://console.developers.google.com/).
2. Create a new project.
3. Navigate to the "Credentials" section and create OAuth 2.0 client ID credentials.
4. Set the authorized redirect URI (e.g., `http://localhost:8080/login/oauth2/code/google`).
5. Copy your **Client ID** and **Client Secret**.

### GitHub:

1. Go to [GitHub Developer Settings](https://github.com/settings/developers).
2. Create a new OAuth App.
3. Set the homepage URL and the authorization callback URL (e.g., `http://localhost:8080/login/oauth2/code/github`).
4. Copy your **Client ID** and **Client Secret**.

## Medium Article

For a detailed guide and explanation of this implementation, check out my article on [Medium](https://medium.com/@varadpatil/implementing-google-and-github-login-with-oauth-2-0-in-spring-boot-1f8fb3c29c8f).

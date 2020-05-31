package GitTest;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.client.GitHubResponse;

public class GitConnection {
    public GitHubClient client;
    public GitHubResponse response;

    public GitConnection(){
        GitHubClient client = new GitHubClient();
        client.setCredentials("yyk-test", "54yuyekai");
        this.client = client;
    }

    public GitHubClient getClient() {
        return client;
    }

    public void setClient(GitHubClient client) {
        this.client = client;
    }

    public GitHubResponse getResponse() {
        return response;
    }

    public void setResponse(GitHubResponse response) {
        this.response = response;
    }
}

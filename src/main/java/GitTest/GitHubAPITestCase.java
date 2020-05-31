package GitTest;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.RepositoryBranch;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;

import java.io.IOException;
import java.util.List;

public class GitHubAPITestCase {
    public static void main(String[] args) throws IOException {
        GitConnection connection = new GitConnection();
        GitHubClient client = connection.getClient();
        RepositoryService service = new RepositoryService(client);

        for (Repository repo : service.getRepositories()) {
            RepositoryId repoId = RepositoryId.createFromUrl(repo.getHtmlUrl()); // https://github.com/:owner/:repo
            List<RepositoryBranch> branches = service.getBranches(repoId);
            for(RepositoryBranch branch : branches) {
                System.out.println(branch.getName());
            }
        }
    }
}

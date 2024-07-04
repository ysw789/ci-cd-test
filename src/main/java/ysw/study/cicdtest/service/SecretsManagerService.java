package ysw.study.cicdtest.service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public class SecretsManagerService {
    @Value("${AWS_ACCESS_KEY}")
    private String awsKey;

    @Value("${AWS_SECRET_KEY}")
    private String awsSecretKey;

    public String getSecret(String secretName) {
        BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsKey, awsSecretKey);
        System.out.println("awsKey = " + awsKey);
        System.out.println("awsSecretKey = " + awsSecretKey);

        AWSSecretsManager secretsManager = AWSSecretsManagerClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                .withRegion(Regions.AP_NORTHEAST_2)
                .build();

        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest()
                .withSecretId(secretName);

        GetSecretValueResult getSecretValueResult = secretsManager.getSecretValue(getSecretValueRequest);
        return getSecretValueResult.getSecretString();
    }
}

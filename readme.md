### Skaffold - Boost your productivity while building apps on Kubernetes

blog post : https://miliari.me/blog/2022/skaffold/skaffold-boost-your-productivity-while-building-on-k8s/

Step 1 : Develop, deploy and test your changes using the fellowing command:
> skaffold dev 

Step 2 : To test the application in the browser, run the following command:
> skaffold dev --port-forward

Or via k8s cmd:

> minikube service list
> minikube service spring-boot-app

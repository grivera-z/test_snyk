node ("bcjenkins101") {
	//stage is a step for defining a conceptually distinct subset of the entire Pipeline, for example: "Build", "Test", and "Deploy", which is used by many plugins to visualize or present Jenkins Pipeline status/progress.
	stage ('Checkout')
	{
		if (isUnix())
		{
			sh 'ls -la'
		} 
	}
	stage ('Build')
	{
		echo 'Building'
		sh 'pwd'
		sh 'mvn clean package'
	}
	stage ('Test')
	{
		echo 'Testings'
		sh 'mvn test'
	}
}



# Cookbook Name:: FronEnd-
# Recipe:: default
#
# Copyright (C) 2017 
#
   
execute "download file from  s3" do
	
command "aws s3 cp s3://#{node['fronend']['BucketName']}/FronEnd-0.0.1-SNAPSHOT.jar   /home/ec2-user/FronEnd-0.0.1-SNAPSHOT.jar"
 action "run"
end

execute "running FronEnd" do
  command "java -jar /home/ec2-user/FronEnd-0.0.1-SNAPSHOT.jar"
  cwd "/home/ec2-user"
  action "run"
end

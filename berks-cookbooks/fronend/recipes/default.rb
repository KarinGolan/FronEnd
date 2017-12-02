
# Cookbook Name:: kk-
# Recipe:: default
#
# Copyright (C) 2017 
#
   
execute "download file from  s3" do
command "aws s3 cp s3://frontendbucket/FronEnd.jar   /home/ec2-user/FronEnd.jar"
 action "run"
end


execute "running FronEnd.jar" do
  command "java -jar /home/ec2-user/FronEnd.jar"
  cwd "/home/ec2-user"
  action "run"
end

# Cookbook Name:: kk-
# Recipe:: default
#
# Copyright (C) 2017 
#

 s3_file "/home/ec2-user/FronEnd.jar" do
        remote_path "FronEnd.jar"
        bucket "frontendbucket"
        s3_url "https://s3-eu-west-1.amazonaws.com/frontendbucket"
        action :create
    end
   
execute "download file from  s3" do
command "aws s3 cp s3://frontendbucket/FronEnd.jar  /home/ec2-user/FronEnd.jar"
 action "run"
end


execute "running FronEnd.jar" do
  command "java -jar /home/ec2-user/FronEnd.jar "
  cwd "/home/ec2-user"
  action "run"
end
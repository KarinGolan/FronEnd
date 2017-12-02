
# Cookbook Name:: FronEnd-
# Recipe:: default
#
# Copyright (C) 2017 
#
   
execute "download file from  s3" do
command "aws s3 cp s3://frontendbucket/FronEnd.jar   /home/ec2-user/FronEnd.jar"
 action "run"
end



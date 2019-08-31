
include :: java

class { '::elasticsearch':
  java_install => true,
  manage_repo  => true,
  repo_version => '5.x',
}

elasticsearch::instance { 'es-01':
    ensure => 'present',
    status => enabled,
    config => {
      'network.host' => 'client',
      'http.port' => '9200',
    },    
}

manifests

elasticsearchdemo.pp

templates

class { 'elasticsearch':
  manage_repo  => true,
  repo_version => '5.x',
  java_install => true,
  jvm_options => [
    '-Xms256m',
    '-Xmx256m'
  ],
  config => { 'cluster.name' => 'elasticsearchdemo' }
} 
elasticsearch::instance { 'es-01':
  config => { 
  'network.host' => 'client',
   },
}
class { 'elasticsearch':
                java_install            => true,
                manage_repo             => false,
                restart_on_change       => true,
                repo_version            => '5.x',
                jvm_options             => [
                        '-Xms256m',
                        '-Xmx256m',
                ],
        }
elasticsearch::instance { 'searchbpe':
                datadir => '/data/elDATA',
                config => {
                                'network' => {
                                                'host' => [$::ipaddress, '127.0.0.1' ],
                                },
                                'cluster' => {
                                                'name' => 'searchbpe',
                                },
                                'index' => {
                                                'number_of_replicas' => 1,
                                },
                                'discovery' => {
                                                'zen' => {
                                                                'ping' => {
                                                                                'unicast' => {
                                                                                                'hosts' => ["master","client"]
                                                                                },
                                                                },
                                                },
                                },
                                'node' => {
                                        'name' => $hostname
                                },
                }
}
firewall { '400 allow elasticsearch access for any':
                        port   => [9200, 9300],
                        proto  => tcp,
                        action => accept,
        }
file { ["/data"]:
                ensure => "directory",
                owner => 'root',
                group => 'root',
}


class { 'elasticsearch':
  manage_repo  => true,
  java_install => true,
  repo_version => '5.x',
  java_install => false,
  jvm_options => [
    '-Xms256m',
    '-Xmx256m'
  ],
} ->
elasticsearch::instance { 'elastic-es':
  config => {
    'cluster.name' => 'elastic',
    'network.host' => '127.0.0.1'
  }
}

node default {
    class { 'elasticsearch':
        manage_repo  => true,
        java_install => true,
        repo_version => '5.x',
        jvm_options => [
            '-Xms256m',
            '-Xmx256m'
        ],
    } ->
    elasticsearch::instance { 'agent':
        config => {
            'cluster.name' => 'elastic',
            'network.host' => 'agent'
        }
    }
}

class { 'elasticsearch':
  version => '2.4.1',
  config => { 'cluster.name' => 'es1003' },
  java_install => true,
  jvm_options => [
            '-Xms256m',
            '-Xmx256m'
        ],
}
elasticsearch::instance { 'agent':
  config => { 'node.name' => 'agent' }, 
  datadir => [ '/data1/elasticsearch' ],
}



include ::java

class { 'elasticsearch':
  version => '2.3.3',
  config => { 'cluster.name' => 'es1003' },
  jvm_options => [
            '-Xms256m',
            '-Xmx256m'
        ],
}
elasticsearch::instance { 'es-01':
  config => { 'node.name' => 'nodename1' }
}
elasticsearch::instance { 'es-02':
  config => { 'node.name' => 'nodename2' }
}

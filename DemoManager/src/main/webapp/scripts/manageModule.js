'use strict';

var commonModule = angular.module('DOMManageModule', [ 'DOMCommonModule','DOMMemberModule','DOMCareerModule' ])
/*
.factory('httpInterceptor', ['$q', function($q) {
	return {
		'request' : function(config) {
			config.headers['Content-Type'] = 'application/x-www-form-urlencoded';
			config.headers['X-CSRF-TOKEN'] = document.getElementById('_csrf').value;
			return config;
		}
	};
}])
.config(['$httpProvider', function($httpProvider){
	$httpProvider.interceptors.push('httpInterceptor');
}])
 */
.directive('getLength', function() {
	return {
		template : 'Name: Address: test'
	};
});

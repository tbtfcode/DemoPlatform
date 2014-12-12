'use strict';

var commonModule = angular.module('DOMManageModule', [ 'ngMD5', 'DOMCommonModule','DOMMemberModule','DOMCareerModule' ])
/*
var commonModule = angular.module('DOMManageModule', [ 'ngCookies', 'DOMCommonModule','DOMMemberModule','DOMCareerModule' ])
.factory('httpInterceptor', ['$q', '$cookies', function($q, $cookies) {
	return {
		'request' : function(config) {
			// do something on success
			config.headers[$('meta[name=_csrf_header]').attr('content')] = $('meta[name=_csrf]').attr('content');
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

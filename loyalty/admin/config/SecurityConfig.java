package com.mobiloitte.loyalty.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers(
                            "/**",
                    		"/",
                            "/index",
                            "/login**",
                            "/dashboard",
                            "/customers_home",
                            "/partners_home",
                            "/authenticateLogin",
                            "/forgetPassword",
                            "/customer_search",
                            "/customer_details",
                            "/get-ShoppingProfile",
                            "/get-refunds-details-pending-all",
                            "/particulerCustomer_remove",
                            "/getOwnerDetails",
                            "/view-ParticularCustomer",
                            "/forgot-password**",
                            "/partners_home",
                            "/reset-password**"
                           ).permitAll()
                    .antMatchers(
                            "/js/**",
                            "/css/**",
                            "/src/**",
                            "/build/**",
                            "/static**",
                            "/email/**",
                            "/vendors/**",
                            "/webjars/**").permitAll()
                    .anyRequest().authenticated()
                .and()
                    .formLogin()
                        .loginPage("/login")
                            .permitAll()
                .and()
                    .logout()
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/login?logout")
                .permitAll();
    }

	@Bean
	public BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("ujjwal06@hotmail.com").password("{noop}qwertyuiop").roles("USER").and().withUser("admin")
				.password("{noop}12345").roles("ADMIN").and().withUser("subadmin").password("{noop}123456")
				.roles("SUBADMIN");
	}
	
	

}

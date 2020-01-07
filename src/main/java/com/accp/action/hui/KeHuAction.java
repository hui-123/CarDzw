package com.accp.action.hui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.hui.KeHuBiz;
import com.accp.pojo.Client;


@RestController
@RequestMapping("/api/Kehu")
public class KeHuAction {

	@Autowired
	private KeHuBiz khBiz;

	@GetMapping
	public List<Client> findListKehu() {

		return khBiz.findListKehu();
	}

	@PostMapping("/add")
	public Map<String, String> addKehu(@RequestBody Client record) {
		Map<String, String> message = new HashMap<String, String>();
		khBiz.addKeHu(record);
		message.put("code", "200");
		return message;
	}
	@DeleteMapping("/delete")
	public Map<String, String> removeKehu(@RequestBody String [] clino) {
		Map<String, String> message = new HashMap<String, String>();
		for (String string : clino) {
			khBiz.remove(string);
		}
		message.put("code", "200");
		return message;
	}
	@PutMapping("/put")
	public Map<String, String> update(@RequestBody Client Client) {
		Map<String, String> message = new HashMap<String, String>();
		
		System.out.println(Client.toString());
		khBiz.Update(Client);
		
		message.put("code", "200");
		return message;
	}
	@GetMapping("/buNo/{clino}")
	public Client findByCliNo(@PathVariable String clino) {
		return khBiz.ByClino(clino);
	}
}

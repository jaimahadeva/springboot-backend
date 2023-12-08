package com.example.prep.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.prep.modal.EcoHomeloads;
import com.example.prep.repository.EcoHomeloadsRepo;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;


@Service
public class EcoProductsHomeService {
	
	@Autowired
	EcoHomeloadsRepo  EcoHomeloadsRepo;

	public List<EcoHomeloads> gethomeloads(int PageNumber){
		Pageable pages=PageRequest.of(PageNumber, 50);
		return  EcoHomeloadsRepo.findAll(pages);
	}

}

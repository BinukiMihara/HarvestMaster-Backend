package com.Backend.HarvestMaster.FAQ.Service;

import com.Backend.HarvestMaster.FAQ.Model.FAQ;
import com.Backend.HarvestMaster.FAQ.Repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FAQServiceImpl implements FAQService {



    @Autowired
    private FaqRepository faqRepository;
    @Override
    public FAQ addFaq(FAQ faq) {
        return faqRepository.save(faq);
    }

    @Override
    public FAQ getFaq(int faq_id) {
        return faqRepository.findById(faq_id).get();
    }

    @Override
    public List<FAQ> getAllFaq() {
        return faqRepository.findAll();
    }

    @Override
    public boolean removeFaq(int faq_id) {
         faqRepository.deleteById(faq_id);
         return true;
    }
}
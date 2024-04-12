
![55ec3d86-b670-4974-b347-db0d5d50505e](https://github.com/VaibhavShitole1303/urlDetectionInLongString_Android_Kotlin/assets/116602594/752cda80-2369-4f7d-91e2-e04ecb46c3d5)

For Ios SwiftUi 
follow this===

[click_url_from_para_in_ios_swiftYUI.txt](https://github.com/VaibhavShitole1303/urlDetectionInLongString_Android_Kotlin/files/14946118/click_url_from_para_in_ios_swiftYUI.txt)


import SwiftUI

struct ContentView: View {
    let paragraphString = "lly unchanged. It was popularised in the 1960s with https://github.com/VaibhavShitole1303/Bumble_colne/blob/main/D_app/components/BumbleCardview.swift the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
    "\n" +
    "Why do we use it?\n" +
    "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
    "\n" +
    "\n" +
    "Where does it come from?\n" +
    "Contrary to popular https://www.bing.com/search?q=wakelock&form=ANNTH1&refig=d84a727e48774f96a3529563cbcfec08&pc=U531 belief, Lorem Ipsum is not simply random text. It has roots in a piece https://freakycoder.com/android-notes-29-how-to-create-multiple-clickable-links-in-textview-8c6c7ff475cc of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
    "\n" +
    "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.\n" +

    "ipsum dolor sit amet...'\nCheck out this website: https://www.example.com for more information."


    var body: some View {
        ScrollView {
            VStack {
                // Call function to get Text view with clickable links
                TextWithLinks(paragraphString: paragraphString)
                    .padding()
            }
            .padding()
        }
    }
    
    func TextWithLinks(paragraphString: String) -> Text {
        // Regular expression pattern for URLs
        let urlPattern = "https?://[a-zA-Z0-9./?=_-]+"
        
        // Create a regular expression
        let regex = try! NSRegularExpression(pattern: urlPattern, options: [])
        
        // Find all matches in the string
        let matches = regex.matches(in: paragraphString, options: [], range: NSRange(location: 0, length: paragraphString.count))
        
        // Initialize a Text view to hold the combined result
        var textView = Text("")
        
        // Start index for slicing the string
        var startIndex = paragraphString.startIndex
        
        // Process each match
        for match in matches {
            // Convert the NSRange of the match to a Range<String.Index> in the original string
            if let range = Range(match.range, in: paragraphString) {
                // Get the text before the URL
                let plainText = String(paragraphString[startIndex..<range.lowerBound])
                textView = textView + Text(plainText)
                
                // Get the URL and create a Link
                let urlString = String(paragraphString[range])
                if let url = URL(string: urlString) {
                    var tappableText = AttributedString(urlString)
                    tappableText.link = URL(string: urlString)
                    tappableText.foregroundColor = .blue
                    textView = textView +
                    Text(tappableText)
                        .foregroundColor(.blue) // Optional: make the link text blue
                        .underline() // Optional: underline the link text
                        .font(.subheadline).bold()
                    
//                        .onTapGesture {
//                            UIApplication.shared.open(url)
//                        }
     
                  

//                    string.append(tappableText)

                }
                
                // Update the start index to the end of the current match
                startIndex = range.upperBound
            }
        }
        
        // Add any remaining plain text after the last URL
        if startIndex < paragraphString.endIndex {
            let remainingText = String(paragraphString[startIndex..<paragraphString.endIndex])
            textView = textView + Text(remainingText)
        }
        
        return textView
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
message.txt
6 KB

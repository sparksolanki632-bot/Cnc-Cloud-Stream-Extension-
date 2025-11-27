{
    "name": "Solankiverse",
    "manifestVersion": 1,
    "pluginLists": [
        "https://raw.githubusercontent.com/sparksolanki632-bot/Solankiverse/main/plugins.json"
    ],
    "logo": ""
}

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class DoFlixProviderPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        DoFlixProvider.context = context
        registerMainAPI(DoFlixProvider())
    }
}

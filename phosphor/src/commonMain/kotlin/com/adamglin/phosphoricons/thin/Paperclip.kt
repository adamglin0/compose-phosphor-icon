package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.83f, 125.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-82.06f, 82.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -73.54f, -73.55f)
                lineTo(150.52f, 38.55f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 50.94f, 50.9f)
                lineToRelative(-99.3f, 100.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -28.3f, -28.27f)
                lineToRelative(83.29f, -84.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.7f, 5.61f)
                lineTo(79.54f, 167.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 16.95f, 17.0f)
                lineTo(195.78f, 83.81f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 156.2f, 44.18f)
                lineTo(56.91f, 144.87f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 62.21f, 62.26f)
                lineToRelative(82.0f, -82.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 206.83f, 125.17f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null

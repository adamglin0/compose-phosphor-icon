package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Text-underline`: ImageVector
    get() {
        if (`_text-underline` != null) {
            return `_text-underline`!!
        }
        `_text-underline` = Builder(name = "Text-underline", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(64.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(192.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 224.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(192.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -96.0f, 0.0f)
                lineTo(80.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_text-underline`!!
    }

private var `_text-underline`: ImageVector? = null

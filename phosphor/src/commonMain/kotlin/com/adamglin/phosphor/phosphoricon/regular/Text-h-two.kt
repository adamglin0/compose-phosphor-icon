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

public val RegularGroup.`Text-h-two`: ImageVector
    get() {
        if (`_text-h-two` != null) {
            return `_text-h-two`!!
        }
        `_text-h-two` = Builder(name = "Text-h-two", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 56.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 124.0f)
                lineTo(48.0f, 124.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(88.0f)
                lineTo(136.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(240.0f, 200.0f)
                lineTo(208.0f, 200.0f)
                lineToRelative(33.55f, -44.74f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -55.73f, -29.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.08f, 5.34f)
                arcToRelative(16.28f, 16.28f, 0.0f, false, true, 2.32f, -4.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 25.54f, 19.27f)
                lineTo(185.6f, 203.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 216.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_text-h-two`!!
    }

private var `_text-h-two`: ImageVector? = null

package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Text-h-three`: ImageVector
    get() {
        if (`_text-h-three` != null) {
            return `_text-h-three`!!
        }
        `_text-h-three` = Builder(name = "Text-h-three", defaultWidth = 256.0.dp, defaultHeight =
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
                moveTo(225.52f, 146.63f)
                lineTo(246.52f, 116.63f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 104.0f)
                lineTo(192.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.63f)
                lineToRelative(-19.18f, 27.41f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 212.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -14.29f, 34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.42f, 11.19f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 248.0f, 180.0f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 225.52f, 146.63f)
                close()
            }
        }
        .build()
        return `_text-h-three`!!
    }

private var `_text-h-three`: ImageVector? = null

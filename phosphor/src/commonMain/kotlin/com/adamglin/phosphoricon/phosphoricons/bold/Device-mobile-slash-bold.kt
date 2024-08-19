package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Device-mobile-slash-bold`: ImageVector
    get() {
        if (`_device-mobile-slash-bold` != null) {
            return `_device-mobile-slash-bold`!!
        }
        `_device-mobile-slash-bold` = Builder(name = "Device-mobile-slash-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.88f, 207.93f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(52.0f, 62.24f)
                verticalLineTo(216.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 26.0f, -17.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.88f, -18.46f)
                close()
                moveTo(176.0f, 220.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(88.64f)
                lineTo(180.0f, 203.0f)
                verticalLineToRelative(13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 176.0f, 220.0f)
                close()
                moveTo(75.51f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineTo(176.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineToRelative(98.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(87.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 75.51f, 24.0f)
                close()
            }
        }
        .build()
        return `_device-mobile-slash-bold`!!
    }

private var `_device-mobile-slash-bold`: ImageVector? = null

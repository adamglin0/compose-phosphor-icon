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

public val BoldGroup.`Circle-notch-bold`: ImageVector
    get() {
        if (`_circle-notch-bold` != null) {
            return `_circle-notch-bold`!!
        }
        `_circle-notch-bold` = Builder(name = "Circle-notch-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 128.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, -216.0f, 0.0f)
                curveToRelative(0.0f, -42.52f, 24.73f, -81.34f, 63.0f, -98.9f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 93.0f, 50.91f)
                curveTo(63.24f, 64.57f, 44.0f, 94.83f, 44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveToRelative(0.0f, -33.17f, -19.24f, -63.43f, -49.0f, -77.09f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 173.0f, 29.1f)
                curveTo(211.27f, 46.66f, 236.0f, 85.48f, 236.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_circle-notch-bold`!!
    }

private var `_circle-notch-bold`: ImageVector? = null

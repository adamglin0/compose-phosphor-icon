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

public val BoldGroup.`Not-subset-of-bold`: ImageVector
    get() {
        if (`_not-subset-of-bold` != null) {
            return `_not-subset-of-bold`!!
        }
        `_not-subset-of-bold` = Builder(name = "Not-subset-of-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.07f, 31.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.95f, 0.81f)
                lineTo(195.42f, 36.0f)
                horizontalLineTo(128.0f)
                arcTo(91.95f, 91.95f, 0.0f, false, false, 57.8f, 187.39f)
                lineTo(39.12f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, 16.14f)
                lineToRelative(18.67f, -20.53f)
                arcTo(91.48f, 91.48f, 0.0f, false, false, 128.0f, 220.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(128.0f)
                arcToRelative(67.51f, 67.51f, 0.0f, false, true, -36.12f, -10.43f)
                lineToRelative(125.0f, -137.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.07f, 31.12f)
                close()
                moveTo(60.0f, 128.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, 68.0f, -68.0f)
                horizontalLineToRelative(45.6f)
                lineTo(74.13f, 169.42f)
                arcTo(67.62f, 67.62f, 0.0f, false, true, 60.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_not-subset-of-bold`!!
    }

private var `_not-subset-of-bold`: ImageVector? = null

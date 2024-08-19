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

public val BoldGroup.`Not-member-of-bold`: ImageVector
    get() {
        if (`_not-member-of-bold` != null) {
            return `_not-member-of-bold`!!
        }
        `_not-member-of-bold` = Builder(name = "Not-member-of-bold", defaultWidth = 256.0.dp,
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
                lineTo(133.31f, 140.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(155.13f)
                lineToRelative(61.75f, -67.93f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.07f, 31.12f)
                close()
                moveTo(74.13f, 169.42f)
                arcToRelative(67.75f, 67.75f, 0.0f, false, true, -13.0f, -29.42f)
                horizontalLineToRelative(39.79f)
                close()
                moveTo(61.08f, 116.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 60.0f)
                horizontalLineToRelative(45.6f)
                lineToRelative(-50.91f, 56.0f)
                close()
            }
        }
        .build()
        return `_not-member-of-bold`!!
    }

private var `_not-member-of-bold`: ImageVector? = null

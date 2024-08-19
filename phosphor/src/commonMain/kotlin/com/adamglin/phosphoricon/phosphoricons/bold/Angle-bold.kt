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

public val BoldGroup.`Angle-bold`: ImageVector
    get() {
        if (`_angle-bold` != null) {
            return `_angle-bold`!!
        }
        `_angle-bold` = Builder(name = "Angle-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(84.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(188.0f)
                horizontalLineTo(240.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 200.0f)
                close()
                moveTo(111.0f, 84.29f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 76.7f, 76.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.95f, 11.0f)
                curveToRelative(0.33f, 0.0f, 0.66f, 0.0f, 1.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -13.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 113.0f, 60.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -2.0f, 23.92f)
                close()
            }
        }
        .build()
        return `_angle-bold`!!
    }

private var `_angle-bold`: ImageVector? = null

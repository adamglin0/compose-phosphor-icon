package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.84f, 54.13f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 138.32f, 54.0f)
                lineTo(128.0f, 63.58f)
                lineTo(117.68f, 54.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, -87.58f, 87.8f)
                lineToRelative(89.35f, 90.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.1f, 0.0f)
                lineToRelative(89.29f, -90.59f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 0.0f, -87.7f)
                close()
                moveTo(208.84f, 124.92f)
                lineTo(128.0f, 206.9f)
                lineTo(47.13f, 124.85f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 53.74f, -53.74f)
                curveToRelative(0.1f, 0.1f, 0.2f, 0.2f, 0.31f, 0.29f)
                lineToRelative(18.64f, 17.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.36f, 0.0f)
                lineTo(154.82f, 71.4f)
                curveToRelative(0.11f, -0.09f, 0.21f, -0.19f, 0.31f, -0.29f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 53.68f, 53.81f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null

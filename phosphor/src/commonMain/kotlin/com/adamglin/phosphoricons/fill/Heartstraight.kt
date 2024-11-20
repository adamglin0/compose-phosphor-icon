package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 98.0f)
                arcToRelative(57.63f, 57.63f, 0.0f, false, true, -17.0f, 41.0f)
                lineTo(133.7f, 229.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(33.0f, 139.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 82.0f, -82.1f)
                lineTo(128.0f, 69.05f)
                lineToRelative(13.09f, -12.19f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 240.0f, 98.0f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null

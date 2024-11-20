package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.18f, 59.79f)
                arcToRelative(54.05f, 54.05f, 0.0f, false, false, -76.31f, 0.0f)
                lineTo(128.0f, 74.51f)
                lineTo(112.13f, 59.74f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 35.8f, 136.15f)
                lineToRelative(89.35f, 90.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.7f, 0.0f)
                lineToRelative(89.33f, -90.64f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, -76.38f)
                close()
                moveTo(214.51f, 130.53f)
                lineTo(128.0f, 218.3f)
                lineTo(41.47f, 130.51f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 65.06f, -65.06f)
                lineToRelative(0.1f, 0.1f)
                lineToRelative(18.64f, 17.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.46f, 0.0f)
                lineToRelative(18.64f, -17.36f)
                lineToRelative(0.1f, -0.1f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 65.0f, 65.08f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null

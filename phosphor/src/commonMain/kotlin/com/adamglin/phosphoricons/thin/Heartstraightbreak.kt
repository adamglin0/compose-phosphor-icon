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

public val ThinGroup.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) {
            return _heartStraightBreak!!
        }
        _heartStraightBreak = Builder(name = "HeartStraightBreak", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.21f, 59.8f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, -76.34f, 0.0f)
                lineTo(128.0f, 75.0f)
                lineTo(112.18f, 59.8f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -76.4f, 76.35f)
                lineToRelative(89.37f, 90.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.7f, 0.0f)
                lineToRelative(89.36f, -90.64f)
                arcTo(54.07f, 54.07f, 0.0f, false, false, 220.21f, 59.8f)
                close()
                moveTo(214.53f, 130.54f)
                lineTo(128.0f, 218.3f)
                lineTo(41.45f, 130.52f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 65.13f, -65.0f)
                lineToRelative(15.65f, 15.07f)
                lineToRelative(-13.0f, 12.52f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.86f)
                lineTo(138.35f, 128.0f)
                lineToRelative(-13.18f, 13.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, 5.66f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineTo(117.71f, 96.0f)
                lineToRelative(31.77f, -30.58f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 65.05f, 65.08f)
                close()
            }
        }
        .build()
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null

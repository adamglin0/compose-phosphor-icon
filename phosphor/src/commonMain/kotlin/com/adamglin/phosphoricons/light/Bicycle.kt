package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 114.0f)
                arcToRelative(45.88f, 45.88f, 0.0f, false, false, -17.8f, 3.58f)
                lineTo(162.45f, 70.0f)
                lineTo(192.0f, 70.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(152.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.18f, 9.0f)
                lineToRelative(13.4f, 23.0f)
                lineTo(98.11f, 90.0f)
                lineTo(81.18f, 61.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 76.0f, 58.0f)
                lineTo(48.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(72.55f, 70.0f)
                lineToRelative(15.0f, 25.64f)
                lineTo(70.0f, 119.62f)
                arcToRelative(46.22f, 46.22f, 0.0f, true, false, 9.68f, 7.09f)
                lineTo(94.11f, 107.0f)
                lineTo(126.82f, 163.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.19f, 3.0f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, 3.0f, -0.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.16f, -8.2f)
                lineToRelative(-32.07f, -55.0f)
                horizontalLineToRelative(62.11f)
                lineToRelative(12.63f, 21.66f)
                arcTo(46.0f, 46.0f, 0.0f, true, false, 208.0f, 114.0f)
                close()
                moveTo(82.0f, 160.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, -19.13f, -30.57f)
                lineToRelative(-19.72f, 27.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.7f, 7.08f)
                lineToRelative(19.7f, -27.0f)
                arcTo(33.88f, 33.88f, 0.0f, false, true, 82.0f, 160.0f)
                close()
                moveTo(208.0f, 194.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -22.0f, -59.86f)
                lineTo(202.82f, 163.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.19f, 3.0f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, 3.0f, -0.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.16f, -8.2f)
                lineToRelative(-16.86f, -28.91f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 208.0f, 194.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null

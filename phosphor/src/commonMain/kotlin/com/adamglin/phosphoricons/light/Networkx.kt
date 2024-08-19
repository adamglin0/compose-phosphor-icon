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

public val LightGroup.Networkx: ImageVector
    get() {
        if (_networkx != null) {
            return _networkx!!
        }
        _networkx = Builder(name = "Networkx", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 114.0f)
                lineTo(134.0f, 114.0f)
                lineTo(134.0f, 86.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(158.0f, 40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(112.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 98.0f, 40.0f)
                lineTo(98.0f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(28.0f)
                lineTo(24.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(58.0f, 126.0f)
                verticalLineToRelative(36.0f)
                lineTo(48.0f, 162.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(80.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(94.0f, 176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(70.0f, 162.0f)
                lineTo(70.0f, 126.0f)
                lineTo(186.0f, 126.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(198.0f, 126.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(110.0f, 72.0f)
                lineTo(110.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(146.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(112.0f, 74.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 110.0f, 72.0f)
                close()
                moveTo(82.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(80.0f, 174.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 82.0f, 176.0f)
                close()
                moveTo(220.24f, 172.24f)
                lineTo(200.48f, 192.0f)
                lineToRelative(19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(192.0f, 200.48f)
                lineToRelative(-19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(183.52f, 192.0f)
                lineToRelative(-19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(192.0f, 183.52f)
                lineToRelative(19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
            }
        }
        .build()
        return _networkx!!
    }

private var _networkx: ImageVector? = null

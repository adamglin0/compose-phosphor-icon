package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Barn: ImageVector
    get() {
        if (_barn != null) {
            return _barn!!
        }
        _barn = Builder(name = "Barn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 192.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(232.0f, 130.57f)
                lineToRelative(1.49f, 2.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, -9.3f)
                lineToRelative(-40.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, -1.94f)
                lineTo(137.0f, 18.77f)
                lineToRelative(-0.1f, -0.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.76f, 0.0f)
                lineToRelative(-0.1f, 0.07f)
                lineTo(51.45f, 65.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, 1.94f)
                lineToRelative(-40.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, 9.3f)
                lineTo(24.0f, 130.57f)
                lineTo(24.0f, 192.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(40.0f, 108.17f)
                lineTo(61.7f, 77.79f)
                lineTo(128.0f, 32.0f)
                lineToRelative(66.3f, 45.78f)
                lineTo(216.0f, 108.17f)
                lineTo(216.0f, 192.0f)
                lineTo(192.0f, 192.0f)
                lineTo(192.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(72.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(72.0f)
                lineTo(40.0f, 192.0f)
                close()
                moveTo(128.0f, 150.17f)
                lineTo(97.0f, 128.0f)
                lineTo(159.0f, 128.0f)
                close()
                moveTo(176.0f, 135.55f)
                verticalLineToRelative(48.91f)
                lineTo(141.76f, 160.0f)
                close()
                moveTo(114.24f, 160.0f)
                lineTo(80.0f, 184.46f)
                lineTo(80.0f, 135.55f)
                close()
                moveTo(128.0f, 169.83f)
                lineTo(159.0f, 192.0f)
                lineTo(97.0f, 192.0f)
                close()
                moveTo(104.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                lineTo(112.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 88.0f)
                close()
            }
        }
        .build()
        return _barn!!
    }

private var _barn: ImageVector? = null

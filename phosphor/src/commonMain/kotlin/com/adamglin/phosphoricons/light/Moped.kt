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

public val LightGroup.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 130.0f)
                arcToRelative(37.72f, 37.72f, 0.0f, false, false, -7.56f, 0.76f)
                lineTo(173.62f, 37.89f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 168.0f, 34.0f)
                lineTo(136.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(27.84f)
                lineToRelative(33.37f, 89.0f)
                arcToRelative(38.08f, 38.08f, 0.0f, false, false, -18.73f, 27.0f)
                lineTo(135.16f, 162.0f)
                lineTo(109.62f, 93.89f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 90.0f)
                lineTo(24.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(34.0f, 102.0f)
                verticalLineToRelative(16.67f)
                arcTo(54.12f, 54.12f, 0.0f, false, false, 2.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(18.48f, 174.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 75.0f, 0.0f)
                horizontalLineToRelative(85.0f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 216.0f, 130.0f)
                close()
                moveTo(42.0f, 128.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, -5.66f)
                lineTo(46.0f, 102.0f)
                lineTo(99.84f, 102.0f)
                lineToRelative(22.5f, 60.0f)
                lineTo(14.43f, 162.0f)
                arcTo(42.07f, 42.07f, 0.0f, false, true, 42.0f, 128.39f)
                close()
                moveTo(56.0f, 194.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -25.29f, -20.0f)
                lineTo(81.29f, 174.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 56.0f, 194.0f)
                close()
                moveTo(216.0f, 194.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -14.5f, -47.57f)
                lineToRelative(8.88f, 23.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.24f, -4.22f)
                lineToRelative(-8.88f, -23.68f)
                arcTo(26.91f, 26.91f, 0.0f, false, true, 216.0f, 142.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null

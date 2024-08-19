package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(52.66f, 52.66f, 0.0f, false, true, -3.57f, 17.39f)
                curveTo(232.38f, 67.22f, 225.7f, 72.0f, 216.0f, 72.0f)
                curveToRelative(-11.06f, 0.0f, -18.85f, -9.76f, -29.49f, -24.65f)
                curveTo(176.0f, 32.66f, 164.12f, 16.0f, 144.0f, 16.0f)
                curveToRelative(-16.39f, 0.0f, -29.0f, 8.89f, -35.43f, 25.0f)
                arcToRelative(66.07f, 66.07f, 0.0f, false, false, -3.9f, 15.0f)
                horizontalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 72.0f)
                verticalLineToRelative(9.59f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 112.0f, 248.0f)
                horizontalLineToRelative(1.59f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 152.0f, 81.59f)
                verticalLineTo(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(120.88f)
                arcToRelative(46.76f, 46.76f, 0.0f, false, true, 2.69f, -9.37f)
                curveTo(127.62f, 36.78f, 134.3f, 32.0f, 144.0f, 32.0f)
                curveToRelative(11.06f, 0.0f, 18.85f, 9.76f, 29.49f, 24.65f)
                curveTo(184.0f, 71.34f, 195.88f, 88.0f, 216.0f, 88.0f)
                curveToRelative(16.39f, 0.0f, 29.0f, -8.89f, 35.43f, -25.0f)
                arcTo(68.69f, 68.69f, 0.0f, false, false, 256.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 32.0f)
                close()
                moveTo(140.8f, 94.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, -57.6f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 86.66f)
                verticalLineTo(72.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(86.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 140.8f, 94.0f)
                close()
                moveTo(111.89f, 209.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 216.0f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, true, -1.33f, -0.11f)
                arcToRelative(57.5f, 57.5f, 0.0f, false, true, -46.57f, -46.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, -2.64f)
                arcToRelative(41.29f, 41.29f, 0.0f, false, false, 33.43f, 33.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 111.89f, 209.32f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null

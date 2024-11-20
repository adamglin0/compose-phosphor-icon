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

public val LightGroup.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) {
            return _userCircleGear!!
        }
        _userCircleGear = Builder(name = "UserCircleGear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.25f, 64.8f)
                lineToRelative(-5.92f, -3.41f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -10.78f)
                lineToRelative(5.92f, -3.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -10.4f)
                lineToRelative(-5.93f, 3.43f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 206.0f, 34.84f)
                lineTo(206.0f, 28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(6.84f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -9.32f, 5.39f)
                lineToRelative(-5.93f, -3.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 10.4f)
                lineToRelative(5.92f, 3.41f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 10.78f)
                lineToRelative(-5.92f, 3.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 10.4f)
                lineToRelative(5.93f, -3.43f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 194.0f, 77.16f)
                lineTo(194.0f, 84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(206.0f, 77.16f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 9.32f, -5.39f)
                lineToRelative(5.93f, 3.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -10.4f)
                close()
                moveTo(200.0f, 66.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 200.0f, 66.0f)
                close()
                moveTo(221.68f, 106.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.92f, 6.91f)
                arcTo(91.76f, 91.76f, 0.0f, false, true, 218.0f, 128.0f)
                arcToRelative(89.65f, 89.65f, 0.0f, false, true, -24.49f, 61.64f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, -31.38f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -51.0f, 0.0f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, 31.38f)
                arcTo(89.95f, 89.95f, 0.0f, false, true, 128.0f, 38.0f)
                arcToRelative(91.66f, 91.66f, 0.0f, false, true, 15.0f, 1.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 2.0f, -11.83f)
                arcToRelative(102.0f, 102.0f, 0.0f, true, false, 50.0f, 177.44f)
                curveToRelative(0.65f, 1.36f, 1.68f, 0.0f, 2.34f, -2.11f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 228.59f, 111.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 221.68f, 106.08f)
                close()
                moveTo(94.0f, 120.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 94.0f, 120.0f)
                close()
                moveTo(71.44f, 198.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 113.12f, 0.0f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, -113.12f, 0.0f)
                close()
            }
        }
        .build()
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null

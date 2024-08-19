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

public val LightGroup.Usercircleplus: ImageVector
    get() {
        if (_usercircleplus != null) {
            return _usercircleplus!!
        }
        _usercircleplus = Builder(name = "Usercircleplus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(18.0f)
                lineTo(194.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(206.0f, 50.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(206.0f, 62.0f)
                lineTo(206.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(194.0f, 62.0f)
                lineTo(176.0f, 62.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 56.0f)
                close()
                moveTo(228.59f, 111.0f)
                arcTo(101.9f, 101.9f, 0.0f, true, true, 145.0f, 27.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.0f, 11.83f)
                arcTo(91.66f, 91.66f, 0.0f, false, false, 128.0f, 38.0f)
                arcTo(89.95f, 89.95f, 0.0f, false, false, 62.49f, 189.64f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, true, 40.0f, -31.38f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 51.0f, 0.0f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, true, 40.0f, 31.38f)
                arcTo(89.65f, 89.65f, 0.0f, false, false, 218.0f, 128.0f)
                arcToRelative(91.76f, 91.76f, 0.0f, false, false, -1.24f, -15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.83f, -2.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 128.0f, 154.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcTo(89.58f, 89.58f, 0.0f, false, false, 184.56f, 198.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, -113.12f, 0.0f)
                arcTo(89.58f, 89.58f, 0.0f, false, false, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _usercircleplus!!
    }

private var _usercircleplus: ImageVector? = null

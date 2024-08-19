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

public val RegularGroup.Angularlogo: ImageVector
    get() {
        if (_angularlogo != null) {
            return _angularlogo!!
        }
        _angularlogo = Builder(name = "Angularlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.08f, 64.62f)
                lineToRelative(-96.0f, -40.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, -6.16f, 0.0f)
                lineToRelative(-96.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.85f, 8.44f)
                lineToRelative(16.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.35f, 6.1f)
                lineToRelative(80.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineToRelative(80.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.35f, -6.1f)
                lineToRelative(16.0f, -120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 227.08f, 64.62f)
                close()
                moveTo(200.63f, 186.74f)
                lineTo(128.0f, 223.06f)
                lineTo(55.37f, 186.74f)
                lineTo(40.74f, 77.0f)
                lineTo(128.0f, 40.67f)
                lineTo(215.26f, 77.0f)
                close()
                moveTo(121.0f, 84.12f)
                lineToRelative(-40.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.0f, 7.76f)
                lineTo(106.0f, 144.0f)
                horizontalLineTo(150.0f)
                lineToRelative(11.0f, 19.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.0f, -7.76f)
                lineToRelative(-40.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.0f, 0.0f)
                close()
                moveTo(141.07f, 128.0f)
                horizontalLineTo(114.93f)
                lineTo(128.0f, 104.47f)
                close()
            }
        }
        .build()
        return _angularlogo!!
    }

private var _angularlogo: ImageVector? = null

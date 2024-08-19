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

public val LightGroup.Sharefat: ImageVector
    get() {
        if (_sharefat != null) {
            return _sharefat!!
        }
        _sharefat = Builder(name = "Sharefat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 107.76f)
                lineToRelative(-80.0f, -80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 32.0f)
                verticalLineTo(74.2f)
                curveToRelative(-54.48f, 3.59f, -120.39f, 55.0f, -127.93f, 120.66f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 17.23f, 8.0f)
                horizontalLineToRelative(0.0f)
                curveTo(46.56f, 190.85f, 87.0f, 152.6f, 146.0f, 150.13f)
                verticalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.24f, 4.24f)
                lineToRelative(80.0f, -80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 107.76f)
                close()
                moveTo(158.0f, 177.52f)
                verticalLineTo(144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                curveToRelative(-27.73f, 0.0f, -54.76f, 7.25f, -80.32f, 21.55f)
                arcToRelative(193.38f, 193.38f, 0.0f, false, false, -40.81f, 30.65f)
                curveToRelative(4.7f, -26.56f, 20.16f, -52.0f, 44.0f, -72.27f)
                curveTo(98.47f, 97.94f, 127.29f, 86.0f, 152.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(46.49f)
                lineTo(223.51f, 112.0f)
                close()
            }
        }
        .build()
        return _sharefat!!
    }

private var _sharefat: ImageVector? = null

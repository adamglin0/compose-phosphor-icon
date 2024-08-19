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

public val LightGroup.Devicerotate: ImageVector
    get() {
        if (_devicerotate != null) {
            return _devicerotate!!
        }
        _devicerotate = Builder(name = "Devicerotate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.24f, 220.24f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(185.51f, 222.0f)
                horizontalLineTo(80.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, -22.0f)
                verticalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                horizontalLineTo(185.51f)
                lineToRelative(-13.75f, -13.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineToRelative(24.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 204.24f, 220.24f)
                close()
                moveTo(80.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -10.24f)
                lineTo(70.49f, 46.0f)
                horizontalLineTo(176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                horizontalLineTo(70.49f)
                lineTo(84.24f, 20.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(24.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.0f, 70.0f)
                close()
            }
        }
        .build()
        return _devicerotate!!
    }

private var _devicerotate: ImageVector? = null

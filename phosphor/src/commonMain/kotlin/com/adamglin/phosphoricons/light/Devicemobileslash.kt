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

public val LightGroup.Devicemobileslash: ImageVector
    get() {
        if (_devicemobileslash != null) {
            return _devicemobileslash!!
        }
        _devicemobileslash = Builder(name = "Devicemobileslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.44f, 212.0f)
                lineTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(58.0f, 59.92f)
                verticalLineTo(216.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineToRelative(-2.08f)
                lineToRelative(5.56f, 6.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(186.0f, 216.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                horizontalLineTo(80.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                verticalLineTo(73.12f)
                lineToRelative(116.0f, 127.6f)
                close()
                moveTo(70.7f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineTo(176.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, 22.0f)
                verticalLineTo(150.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                horizontalLineTo(76.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 70.7f, 24.0f)
                close()
            }
        }
        .build()
        return _devicemobileslash!!
    }

private var _devicemobileslash: ImageVector? = null

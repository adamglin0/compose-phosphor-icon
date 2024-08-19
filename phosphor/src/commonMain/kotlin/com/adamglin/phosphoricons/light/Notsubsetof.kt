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

public val LightGroup.Notsubsetof: ImageVector
    get() {
        if (_notsubsetof != null) {
            return _notsubsetof!!
        }
        _notsubsetof = Builder(name = "Notsubsetof", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 35.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.4f)
                lineToRelative(-5.49f, 6.0f)
                horizontalLineTo(128.0f)
                arcTo(85.93f, 85.93f, 0.0f, false, false, 65.9f, 187.4f)
                lineTo(43.56f, 212.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 52.44f, 220.0f)
                lineToRelative(22.33f, -24.57f)
                arcTo(85.52f, 85.52f, 0.0f, false, false, 128.0f, 214.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(128.0f)
                arcToRelative(73.65f, 73.65f, 0.0f, false, true, -45.14f, -15.42f)
                lineTo(212.44f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 212.0f, 35.56f)
                close()
                moveTo(54.0f, 128.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, 74.0f, -74.0f)
                horizontalLineToRelative(59.16f)
                lineTo(74.0f, 178.5f)
                arcTo(73.7f, 73.7f, 0.0f, false, true, 54.0f, 128.0f)
                close()
            }
        }
        .build()
        return _notsubsetof!!
    }

private var _notsubsetof: ImageVector? = null

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

public val LightGroup.Notsupersetof: ImageVector
    get() {
        if (_notsupersetof != null) {
            return _notsupersetof!!
        }
        _notsupersetof = Builder(name = "Notsupersetof", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 194.0f)
                horizontalLineTo(76.11f)
                lineToRelative(25.45f, -28.0f)
                horizontalLineTo(152.0f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 196.81f, 61.22f)
                lineTo(212.44f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 203.56f, 36.0f)
                lineTo(187.73f, 53.38f)
                arcTo(61.61f, 61.61f, 0.0f, false, false, 152.0f, 42.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(49.67f, 49.67f, 0.0f, false, true, 27.59f, 8.33f)
                lineTo(96.25f, 154.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(85.35f)
                lineTo(43.56f, 212.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 52.44f, 220.0f)
                lineTo(65.2f, 206.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(188.73f, 70.12f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 152.0f, 154.0f)
                horizontalLineTo(112.47f)
                close()
            }
        }
        .build()
        return _notsupersetof!!
    }

private var _notsupersetof: ImageVector? = null

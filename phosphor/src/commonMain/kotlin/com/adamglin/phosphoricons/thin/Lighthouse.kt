package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) {
            return _lighthouse!!
        }
        _lighthouse = Builder(name = "Lighthouse", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(185.23f)
                lineTo(180.0f, 55.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 178.66f, 53.0f)
                lineTo(135.78f, 14.87f)
                lineToRelative(-0.1f, -0.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.36f, 0.0f)
                lineToRelative(-0.1f, 0.09f)
                lineTo(77.34f, 53.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 76.0f, 55.6f)
                lineTo(70.77f, 108.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(70.0f)
                lineToRelative(-9.92f, 98.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 228.0f)
                horizontalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.94f, -13.16f)
                lineTo(186.0f, 116.0f)
                horizontalLineToRelative(22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 84.0f)
                close()
                moveTo(125.48f, 20.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, 0.0f)
                lineToRelative(35.0f, 31.11f)
                horizontalLineToRelative(-75.0f)
                close()
                moveTo(83.62f, 60.0f)
                horizontalLineToRelative(88.76f)
                lineToRelative(4.81f, 48.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(78.81f)
                close()
                moveTo(187.0f, 218.69f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -3.0f, 1.31f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.36f)
                lineTo(72.39f, 172.0f)
                horizontalLineTo(183.61f)
                lineTo(188.0f, 215.62f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 187.0f, 218.69f)
                close()
                moveTo(182.81f, 164.0f)
                horizontalLineTo(73.19f)
                lineTo(78.0f, 116.0f)
                horizontalLineTo(178.0f)
                close()
            }
        }
        .build()
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null

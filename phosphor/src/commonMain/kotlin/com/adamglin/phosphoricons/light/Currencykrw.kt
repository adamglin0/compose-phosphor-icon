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

public val LightGroup.Currencykrw: ImageVector
    get() {
        if (_currencykrw != null) {
            return _currencykrw!!
        }
        _currencykrw = Builder(name = "Currencykrw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 130.0f)
                horizontalLineTo(214.91f)
                lineToRelative(22.65f, -55.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.12f, -4.52f)
                lineTo(202.0f, 130.0f)
                horizontalLineTo(158.0f)
                lineTo(133.56f, 69.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.12f, 0.0f)
                lineTo(98.0f, 130.0f)
                horizontalLineTo(54.0f)
                lineTo(29.56f, 69.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.12f, 4.52f)
                lineTo(41.09f, 130.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(46.0f)
                lineToRelative(24.48f, 60.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.12f, 0.0f)
                lineTo(106.0f, 142.0f)
                horizontalLineTo(150.0f)
                lineToRelative(24.48f, 60.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.12f, 0.0f)
                lineTo(210.0f, 142.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(76.0f, 184.06f)
                lineTo(58.91f, 142.0f)
                horizontalLineTo(93.09f)
                close()
                moveTo(110.91f, 130.0f)
                lineTo(128.0f, 87.94f)
                lineTo(145.09f, 130.0f)
                close()
                moveTo(180.0f, 184.06f)
                lineTo(162.91f, 142.0f)
                horizontalLineToRelative(34.18f)
                close()
            }
        }
        .build()
        return _currencykrw!!
    }

private var _currencykrw: ImageVector? = null

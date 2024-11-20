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

public val RegularGroup.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                horizontalLineTo(217.89f)
                lineToRelative(21.52f, -53.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.82f, -6.0f)
                lineToRelative(-24.0f, 59.0f)
                horizontalLineTo(159.38f)
                lineToRelative(-24.0f, -59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.82f, 0.0f)
                lineToRelative(-24.0f, 59.0f)
                horizontalLineTo(55.38f)
                lineToRelative(-24.0f, -59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.82f, 6.0f)
                lineToRelative(21.52f, 53.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(44.61f)
                lineToRelative(24.0f, 59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.82f, 0.0f)
                lineToRelative(24.0f, -59.0f)
                horizontalLineToRelative(41.24f)
                lineToRelative(24.0f, 59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.82f, 0.0f)
                lineToRelative(24.0f, -59.0f)
                horizontalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(76.0f, 178.75f)
                lineTo(61.88f, 144.0f)
                horizontalLineTo(90.12f)
                close()
                moveTo(113.88f, 128.0f)
                lineTo(128.0f, 93.26f)
                lineTo(142.12f, 128.0f)
                close()
                moveTo(180.0f, 178.75f)
                lineTo(165.88f, 144.0f)
                horizontalLineToRelative(28.24f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null

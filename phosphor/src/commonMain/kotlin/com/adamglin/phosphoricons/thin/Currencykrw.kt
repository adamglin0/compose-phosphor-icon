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

public val ThinGroup.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 132.0f)
                horizontalLineTo(211.94f)
                lineToRelative(23.77f, -58.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.42f, -3.0f)
                lineToRelative(-25.0f, 61.51f)
                horizontalLineTo(156.69f)
                lineToRelative(-25.0f, -61.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.42f, 0.0f)
                lineTo(99.31f, 132.0f)
                horizontalLineTo(52.69f)
                lineToRelative(-25.0f, -61.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.42f, 3.0f)
                lineTo(44.06f, 132.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(47.31f)
                lineToRelative(25.0f, 61.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.42f, 0.0f)
                lineToRelative(25.0f, -61.51f)
                horizontalLineToRelative(46.62f)
                lineToRelative(25.0f, 61.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.42f, 0.0f)
                lineToRelative(25.0f, -61.51f)
                horizontalLineTo(240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(76.0f, 189.37f)
                lineTo(55.94f, 140.0f)
                horizontalLineTo(96.06f)
                close()
                moveTo(107.94f, 132.0f)
                lineTo(128.0f, 82.63f)
                lineTo(148.06f, 132.0f)
                close()
                moveTo(180.0f, 189.37f)
                lineTo(159.94f, 140.0f)
                horizontalLineToRelative(40.12f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null

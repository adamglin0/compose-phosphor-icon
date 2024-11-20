package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 124.0f)
                horizontalLineTo(223.83f)
                lineToRelative(19.29f, -47.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.24f, -9.0f)
                lineToRelative(-23.0f, 56.51f)
                horizontalLineTo(162.08f)
                lineToRelative(-23.0f, -56.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.24f, 0.0f)
                lineTo(93.92f, 124.0f)
                horizontalLineTo(58.08f)
                lineToRelative(-23.0f, -56.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.24f, 9.0f)
                lineTo(32.17f, 124.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(41.92f)
                lineToRelative(23.0f, 56.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.24f, 0.0f)
                lineToRelative(23.0f, -56.52f)
                horizontalLineToRelative(35.84f)
                lineToRelative(23.0f, 56.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.24f, 0.0f)
                lineToRelative(23.0f, -56.52f)
                horizontalLineTo(240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(76.0f, 168.12f)
                lineTo(67.83f, 148.0f)
                horizontalLineTo(84.17f)
                close()
                moveTo(119.83f, 124.0f)
                lineTo(128.0f, 103.89f)
                lineTo(136.17f, 124.0f)
                close()
                moveTo(180.0f, 168.12f)
                lineTo(171.83f, 148.0f)
                horizontalLineToRelative(16.34f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null

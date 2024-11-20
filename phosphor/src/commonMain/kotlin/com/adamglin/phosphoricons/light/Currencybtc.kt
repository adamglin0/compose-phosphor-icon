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

public val LightGroup.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) {
            return _currencyBtc!!
        }
        _currencyBtc = Builder(name = "CurrencyBtc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.69f, 116.41f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 150.0f, 42.05f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(42.0f)
                horizontalLineTo(118.0f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(42.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(82.0f)
                verticalLineTo(194.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(206.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(206.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 14.69f, -89.59f)
                close()
                moveTo(178.0f, 84.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                horizontalLineTo(94.0f)
                verticalLineTo(54.0f)
                horizontalLineToRelative(54.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 178.0f, 84.0f)
                close()
                moveTo(160.0f, 194.0f)
                horizontalLineTo(94.0f)
                verticalLineTo(126.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
            }
        }
        .build()
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null

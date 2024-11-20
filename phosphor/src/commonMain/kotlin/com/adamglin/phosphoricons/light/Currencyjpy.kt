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

public val LightGroup.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) {
            return _currencyJpy!!
        }
        _currencyJpy = Builder(name = "CurrencyJpy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.64f, 51.8f)
                lineToRelative(-64.0f, 78.2f)
                horizontalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(174.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(42.0f)
                verticalLineTo(142.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(35.34f)
                lineToRelative(-64.0f, -78.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 9.28f, -7.6f)
                lineTo(128.0f, 126.53f)
                lineTo(195.36f, 44.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.28f, 7.6f)
                close()
            }
        }
        .build()
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null

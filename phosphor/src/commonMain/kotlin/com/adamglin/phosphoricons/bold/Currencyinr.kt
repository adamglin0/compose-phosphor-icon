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

public val BoldGroup.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) {
            return _currencyInr!!
        }
        _currencyInr = Builder(name = "CurrencyInr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(172.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, 64.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(65.0f, 59.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -16.14f, 17.76f)
                lineToRelative(-88.0f, -80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 132.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -32.0f, -16.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(157.91f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 9.4f, 16.0f)
                horizontalLineTo(200.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 80.0f)
                close()
            }
        }
        .build()
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null

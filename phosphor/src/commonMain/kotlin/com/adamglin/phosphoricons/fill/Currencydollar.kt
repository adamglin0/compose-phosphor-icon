package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) {
            return _currencyDollar!!
        }
        _currencyDollar = Builder(name = "CurrencyDollar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 152.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(176.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(136.0f, 88.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(136.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 176.0f, 152.0f)
                close()
                moveTo(100.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                lineTo(120.0f, 88.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 100.0f, 104.0f)
                close()
            }
        }
        .build()
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null

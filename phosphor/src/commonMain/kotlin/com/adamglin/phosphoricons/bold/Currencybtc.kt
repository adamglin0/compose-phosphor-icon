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

public val BoldGroup.Currencybtc: ImageVector
    get() {
        if (_currencybtc != null) {
            return _currencybtc!!
        }
        _currencybtc = Builder(name = "Currencybtc", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.08f, 114.46f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 160.0f, 37.52f)
                verticalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(36.0f)
                horizontalLineTo(120.0f)
                verticalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(36.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(188.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(212.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(212.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 25.08f, -97.54f)
                close()
                moveTo(172.0f, 84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineTo(100.0f)
                verticalLineTo(60.0f)
                horizontalLineToRelative(48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 172.0f, 84.0f)
                close()
                moveTo(160.0f, 188.0f)
                horizontalLineTo(100.0f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return _currencybtc!!
    }

private var _currencybtc: ImageVector? = null

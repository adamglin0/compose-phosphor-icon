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

public val RegularGroup.Currencybtc: ImageVector
    get() {
        if (_currencybtc != null) {
            return _currencybtc!!
        }
        _currencybtc = Builder(name = "Currencybtc", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.48f, 115.7f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 152.0f, 40.19f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(120.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 18.48f, -92.3f)
                close()
                moveTo(176.0f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(56.0f)
                horizontalLineToRelative(52.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 176.0f, 84.0f)
                close()
                moveTo(160.0f, 192.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _currencybtc!!
    }

private var _currencybtc: ImageVector? = null
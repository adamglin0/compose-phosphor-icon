package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Currencybtc: ImageVector
    get() {
        if (_currencybtc != null) {
            return _currencybtc!!
        }
        _currencybtc = Builder(name = "Currencybtc", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                horizontalLineToRelative(12.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 200.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.48f, 115.7f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 152.0f, 40.19f)
                lineTo(152.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(136.0f, 40.0f)
                lineTo(120.0f, 40.0f)
                lineTo(120.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(104.0f, 40.0f)
                lineTo(72.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(80.0f, 192.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(120.0f, 208.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 208.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 18.48f, -92.3f)
                close()
                moveTo(96.0f, 56.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                lineTo(96.0f, 112.0f)
                close()
                moveTo(160.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                lineTo(96.0f, 128.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _currencybtc!!
    }

private var _currencybtc: ImageVector? = null

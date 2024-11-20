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

public val DuotoneGroup.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) {
            return _currencyGbp!!
        }
        _currencyGbp = Builder(name = "CurrencyGbp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 208.0f)
                horizontalLineTo(60.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                verticalLineTo(84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 72.0f, -33.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                verticalLineTo(136.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(84.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 85.08f, -40.12f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 162.9f, 56.22f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 104.0f, 84.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(104.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(43.82f, 43.82f, 0.0f, false, true, -10.08f, 28.0f)
                horizontalLineTo(184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 208.0f)
                close()
            }
        }
        .build()
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null

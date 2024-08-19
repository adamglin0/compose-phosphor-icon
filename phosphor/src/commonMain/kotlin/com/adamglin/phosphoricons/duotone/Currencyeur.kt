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

public val DuotoneGroup.Currencyeur: ImageVector
    get() {
        if (_currencyeur != null) {
            return _currencyeur!!
        }
        _currencyeur = Builder(name = "Currencyeur", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 58.33f)
                verticalLineTo(197.67f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 64.0f, 144.0f)
                verticalLineTo(112.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 184.0f, 58.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 192.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.63f, 11.3f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 56.4f, 152.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(120.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(56.4f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 189.34f, 52.37f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 178.66f, 64.3f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 72.52f, 104.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(72.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(72.52f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 106.14f, 39.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 190.0f, 192.33f)
                close()
            }
        }
        .build()
        return _currencyeur!!
    }

private var _currencyeur: ImageVector? = null

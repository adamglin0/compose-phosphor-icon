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

public val BoldGroup.Currencyeur: ImageVector
    get() {
        if (_currencyeur != null) {
            return _currencyeur!!
        }
        _currencyeur = Builder(name = "Currencyeur", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.94f, 189.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.94f, 17.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 53.55f, 160.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(120.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(53.55f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 192.0f, 49.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.0f, 17.89f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 78.18f, 96.0f)
                horizontalLineTo(136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(76.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(78.18f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 176.0f, 188.72f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.94f, 189.66f)
                close()
            }
        }
        .build()
        return _currencyeur!!
    }

private var _currencyeur: ImageVector? = null

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

public val DuotoneGroup.Beanie: ImageVector
    get() {
        if (_beanie != null) {
            return _beanie!!
        }
        _beanie = Builder(name = "Beanie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 144.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 176.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 162.16f)
                lineTo(224.0f, 144.0f)
                arcToRelative(96.18f, 96.18f, 0.0f, false, false, -72.34f, -93.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -47.32f, 0.0f)
                arcTo(96.18f, 96.18f, 0.0f, false, false, 32.0f, 144.0f)
                verticalLineToRelative(18.16f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 162.16f)
                close()
                moveTo(116.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 36.0f)
                close()
                moveTo(128.0f, 64.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, true, 80.0f, 80.0f)
                verticalLineToRelative(16.0f)
                lineTo(48.0f, 160.0f)
                lineTo(48.0f, 144.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 128.0f, 64.0f)
                close()
                moveTo(120.0f, 176.0f)
                verticalLineToRelative(32.0f)
                lineTo(80.0f, 208.0f)
                lineTo(80.0f, 176.0f)
                close()
                moveTo(136.0f, 176.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(32.0f)
                lineTo(136.0f, 208.0f)
                close()
                moveTo(40.0f, 176.0f)
                lineTo(64.0f, 176.0f)
                verticalLineToRelative(32.0f)
                lineTo(40.0f, 208.0f)
                close()
                moveTo(216.0f, 208.0f)
                lineTo(192.0f, 208.0f)
                lineTo(192.0f, 176.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _beanie!!
    }

private var _beanie: ImageVector? = null

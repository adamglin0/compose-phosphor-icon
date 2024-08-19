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

public val DuotoneGroup.Trolleysuitcase: ImageVector
    get() {
        if (_trolleysuitcase != null) {
            return _trolleysuitcase!!
        }
        _trolleysuitcase = Builder(name = "Trolleysuitcase", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 72.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 224.0f)
                close()
                moveTo(216.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 208.0f)
                close()
                moveTo(240.0f, 176.0f)
                lineTo(56.0f, 176.0f)
                lineTo(56.0f, 75.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 51.31f, 64.0f)
                lineTo(29.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 18.34f, 53.66f)
                lineTo(40.0f, 75.31f)
                lineTo(40.0f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(72.0f, 144.0f)
                lineTo(72.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                lineTo(120.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(184.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(88.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 144.0f)
                close()
                moveTo(136.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                lineTo(168.0f, 40.0f)
                lineTo(136.0f, 40.0f)
                close()
                moveTo(88.0f, 144.0f)
                lineTo(216.0f, 144.0f)
                lineTo(216.0f, 72.0f)
                lineTo(88.0f, 72.0f)
                close()
            }
        }
        .build()
        return _trolleysuitcase!!
    }

private var _trolleysuitcase: ImageVector? = null

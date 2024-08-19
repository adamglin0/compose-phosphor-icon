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

public val DuotoneGroup.Texthfive: ImageVector
    get() {
        if (_texthfive != null) {
            return _texthfive!!
        }
        _texthfive = Builder(name = "Texthfive", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 72.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 56.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 124.0f)
                lineTo(48.0f, 124.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(88.0f)
                lineTo(136.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(212.0f, 144.0f)
                arcToRelative(38.8f, 38.8f, 0.0f, false, false, -9.41f, 1.14f)
                lineTo(206.78f, 120.0f)
                lineTo(240.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(200.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.89f, 6.68f)
                lineToRelative(-8.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.6f, 6.92f)
                arcTo(19.73f, 19.73f, 0.0f, false, true, 212.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                arcToRelative(19.73f, 19.73f, 0.0f, false, true, -14.29f, -5.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.42f, 11.2f)
                arcTo(35.54f, 35.54f, 0.0f, false, false, 212.0f, 216.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                close()
            }
        }
        .build()
        return _texthfive!!
    }

private var _texthfive: ImageVector? = null

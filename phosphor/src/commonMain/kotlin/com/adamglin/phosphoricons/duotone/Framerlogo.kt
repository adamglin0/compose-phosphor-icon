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

public val DuotoneGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 104.0f)
                horizontalLineTo(128.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineTo(200.0f)
                close()
                moveTo(56.0f, 168.0f)
                lineToRelative(72.0f, 72.0f)
                verticalLineTo(168.0f)
                horizontalLineToRelative(72.0f)
                lineToRelative(-72.0f, -64.0f)
                horizontalLineTo(56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 104.0f)
                lineTo(208.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(56.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.31f, 14.0f)
                lineTo(107.0f, 96.0f)
                lineTo(56.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.34f, 5.66f)
                lineToRelative(72.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 240.0f)
                lineTo(136.0f, 176.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.31f, -14.0f)
                lineTo(149.0f, 112.0f)
                horizontalLineToRelative(51.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 104.0f)
                close()
                moveTo(179.0f, 160.0f)
                lineTo(128.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(52.69f)
                lineToRelative(-56.0f, -56.0f)
                lineTo(64.0f, 112.0f)
                horizontalLineToRelative(61.0f)
                close()
                moveTo(192.0f, 96.0f)
                lineTo(131.0f, 96.0f)
                lineTo(77.0f, 48.0f)
                lineTo(192.0f, 48.0f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null

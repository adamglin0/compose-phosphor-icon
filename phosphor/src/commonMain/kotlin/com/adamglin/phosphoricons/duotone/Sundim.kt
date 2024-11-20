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

public val DuotoneGroup.SunDim: ImageVector
    get() {
        if (_sunDim != null) {
            return _sunDim!!
        }
        _sunDim = Builder(name = "SunDim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 128.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 184.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 40.0f)
                lineTo(120.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -64.0f, -64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 192.0f, 128.0f)
                close()
                moveTo(176.0f, 128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 176.0f, 128.0f)
                close()
                moveTo(58.34f, 69.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 69.66f, 58.34f)
                lineToRelative(-8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 50.34f, 61.66f)
                close()
                moveTo(58.34f, 186.34f)
                lineTo(50.34f, 194.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                close()
                moveTo(192.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineToRelative(-8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 72.0f)
                close()
                moveTo(197.66f, 186.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(40.0f, 120.0f)
                lineTo(32.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 208.0f)
                close()
                moveTo(224.0f, 120.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null

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

public val DuotoneGroup.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) {
            return _orangeSlice!!
        }
        _orangeSlice = Builder(name = "OrangeSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 88.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 40.0f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 80.0f)
                lineTo(8.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, 256.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 80.0f)
                close()
                moveTo(77.4f, 149.91f)
                lineToRelative(42.6f, -42.6f)
                lineTo(120.0f, 167.6f)
                arcTo(79.59f, 79.59f, 0.0f, false, true, 77.4f, 149.91f)
                close()
                moveTo(66.09f, 138.6f)
                arcTo(79.59f, 79.59f, 0.0f, false, true, 48.4f, 96.0f)
                horizontalLineToRelative(60.29f)
                close()
                moveTo(136.0f, 107.31f)
                lineToRelative(42.6f, 42.6f)
                arcTo(79.59f, 79.59f, 0.0f, false, true, 136.0f, 167.6f)
                close()
                moveTo(189.91f, 138.6f)
                lineTo(147.31f, 96.0f)
                lineTo(207.6f, 96.0f)
                arcTo(79.59f, 79.59f, 0.0f, false, true, 189.91f, 138.6f)
                close()
                moveTo(128.0f, 200.0f)
                arcTo(112.15f, 112.15f, 0.0f, false, true, 16.28f, 96.0f)
                lineTo(32.34f, 96.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 191.32f, 0.0f)
                horizontalLineToRelative(16.06f)
                arcTo(112.15f, 112.15f, 0.0f, false, true, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null

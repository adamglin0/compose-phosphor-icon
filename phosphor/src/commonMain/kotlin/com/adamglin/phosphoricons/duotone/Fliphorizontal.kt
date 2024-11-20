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

public val DuotoneGroup.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 40.0f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.37f, -11.12f)
                lineToRelative(64.0f, -160.0f)
                curveTo(100.0f, 28.86f, 112.0f, 31.29f, 112.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.18f, 24.33f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, -17.92f, 9.45f)
                lineToRelative(-0.06f, 0.14f)
                lineToRelative(-64.0f, 159.93f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 216.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(120.0f, 40.0f)
                arcTo(15.85f, 15.85f, 0.0f, false, false, 107.18f, 24.33f)
                close()
                moveTo(104.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineToRelative(0.06f, -0.15f)
                lineTo(104.0f, 40.0f)
                close()
                moveTo(230.77f, 193.85f)
                lineTo(166.77f, 33.92f)
                lineTo(166.71f, 33.78f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 40.0f)
                lineTo(136.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.78f, -22.15f)
                close()
                moveTo(152.0f, 200.0f)
                lineTo(152.0f, 40.0f)
                lineToRelative(63.93f, 159.84f)
                lineToRelative(0.06f, 0.15f)
                close()
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null

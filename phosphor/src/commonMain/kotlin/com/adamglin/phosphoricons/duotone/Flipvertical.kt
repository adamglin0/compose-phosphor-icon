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

public val DuotoneGroup.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = Builder(name = "FlipVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(219.11f, 159.37f)
                lineToRelative(-160.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 216.0f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                curveTo(224.71f, 144.0f, 227.14f, 156.0f, 219.11f, 159.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 120.0f)
                lineTo(216.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.23f, -30.74f)
                lineToRelative(-0.14f, -0.06f)
                lineToRelative(-159.93f, -64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 120.0f)
                close()
                moveTo(56.0f, 40.0f)
                lineTo(56.15f, 40.06f)
                lineTo(216.0f, 104.0f)
                lineTo(56.0f, 104.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(216.0f, 136.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.15f, 14.78f)
                lineToRelative(159.93f, -64.0f)
                lineToRelative(0.14f, -0.06f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 136.0f)
                close()
                moveTo(56.15f, 215.93f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 152.0f)
                lineTo(216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null

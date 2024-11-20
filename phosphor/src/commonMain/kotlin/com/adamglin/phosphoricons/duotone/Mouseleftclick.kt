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

public val DuotoneGroup.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) {
            return _mouseLeftClick!!
        }
        _mouseLeftClick = Builder(name = "MouseLeftClick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                verticalLineToRelative(88.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(80.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 56.0f, -56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 16.0f)
                lineTo(112.0f, 16.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 48.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(208.0f, 80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 144.0f, 16.0f)
                close()
                moveTo(192.0f, 80.0f)
                verticalLineToRelative(24.0f)
                lineTo(136.0f, 104.0f)
                lineTo(136.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 192.0f, 80.0f)
                close()
                moveTo(115.31f, 104.0f)
                lineTo(69.31f, 58.0f)
                arcTo(48.49f, 48.49f, 0.0f, false, true, 80.51f, 43.82f)
                lineTo(120.0f, 83.31f)
                lineTo(120.0f, 104.0f)
                close()
                moveTo(64.0f, 80.0f)
                curveToRelative(0.0f, -1.51f, 0.08f, -3.0f, 0.22f, -4.47f)
                lineTo(92.69f, 104.0f)
                lineTo(64.0f, 104.0f)
                close()
                moveTo(120.0f, 32.0f)
                lineTo(120.0f, 60.69f)
                lineTo(94.59f, 35.28f)
                arcTo(47.73f, 47.73f, 0.0f, false, true, 112.0f, 32.0f)
                close()
                moveTo(144.0f, 224.0f)
                lineTo(112.0f, 224.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                lineTo(64.0f, 120.0f)
                lineTo(192.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 144.0f, 224.0f)
                close()
            }
        }
        .build()
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null

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

public val DuotoneGroup.MouseRightClick: ImageVector
    get() {
        if (_mouseRightClick != null) {
            return _mouseRightClick!!
        }
        _mouseRightClick = Builder(name = "MouseRightClick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 80.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(16.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 200.0f, 80.0f)
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
                moveTo(112.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(72.0f)
                lineTo(64.0f, 104.0f)
                lineTo(64.0f, 80.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 112.0f, 32.0f)
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
        return _mouseRightClick!!
    }

private var _mouseRightClick: ImageVector? = null

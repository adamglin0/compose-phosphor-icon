package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) {
            return _mouseLeftClick!!
        }
        _mouseLeftClick = Builder(name = "MouseLeftClick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 12.0f)
                lineTo(112.0f, 12.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, false, 44.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, -68.0f)
                lineTo(212.0f, 80.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, false, 144.0f, 12.0f)
                close()
                moveTo(188.0f, 80.0f)
                verticalLineToRelative(20.0f)
                lineTo(140.0f, 100.0f)
                lineTo(140.0f, 36.0f)
                horizontalLineToRelative(4.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 188.0f, 80.0f)
                close()
                moveTo(68.0f, 80.0f)
                arcToRelative(43.63f, 43.63f, 0.0f, false, true, 2.0f, -13.0f)
                lineTo(103.0f, 100.0f)
                lineTo(68.0f, 100.0f)
                close()
                moveTo(116.0f, 36.0f)
                lineTo(116.0f, 79.0f)
                lineTo(83.49f, 46.52f)
                arcTo(43.83f, 43.83f, 0.0f, false, true, 112.0f, 36.0f)
                close()
                moveTo(144.0f, 220.0f)
                lineTo(112.0f, 220.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(68.0f, 124.0f)
                lineTo(188.0f, 124.0f)
                verticalLineToRelative(52.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 144.0f, 220.0f)
                close()
            }
        }
        .build()
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null

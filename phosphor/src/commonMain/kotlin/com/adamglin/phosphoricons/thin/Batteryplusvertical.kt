package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Batteryplusvertical: ImageVector
    get() {
        if (_batteryplusvertical != null) {
            return _batteryplusvertical!!
        }
        _batteryplusvertical = Builder(name = "Batteryplusvertical", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 8.0f)
                close()
                moveTo(196.0f, 56.0f)
                lineTo(196.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(80.0f, 244.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(60.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 196.0f, 56.0f)
                close()
                moveTo(188.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(80.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 56.0f)
                lineTo(68.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
                moveTo(156.0f, 136.0f)
                lineTo(132.0f, 136.0f)
                lineTo(132.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(100.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 144.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _batteryplusvertical!!
    }

private var _batteryplusvertical: ImageVector? = null

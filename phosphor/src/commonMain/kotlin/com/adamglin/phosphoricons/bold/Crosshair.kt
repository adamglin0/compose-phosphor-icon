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

public val BoldGroup.Crosshair: ImageVector
    get() {
        if (_crosshair != null) {
            return _crosshair!!
        }
        _crosshair = Builder(name = "Crosshair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 116.0f)
                horizontalLineToRelative(-4.72f)
                arcTo(100.21f, 100.21f, 0.0f, false, false, 140.0f, 28.72f)
                lineTo(140.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.72f)
                arcTo(100.21f, 100.21f, 0.0f, false, false, 28.72f, 116.0f)
                lineTo(24.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.72f)
                arcTo(100.21f, 100.21f, 0.0f, false, false, 116.0f, 227.28f)
                lineTo(116.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.72f)
                arcTo(100.21f, 100.21f, 0.0f, false, false, 227.28f, 140.0f)
                lineTo(232.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(140.0f, 203.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(76.15f, 76.15f, 0.0f, false, true, -63.0f, -63.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(53.0f, 116.0f)
                arcToRelative(76.15f, 76.15f, 0.0f, false, true, 63.0f, -63.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 53.0f)
                arcToRelative(76.15f, 76.15f, 0.0f, false, true, 63.0f, 63.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                arcTo(76.15f, 76.15f, 0.0f, false, true, 140.0f, 203.0f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
            }
        }
        .build()
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null

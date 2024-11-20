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

public val BoldGroup.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.82f, 170.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 164.0f)
                lineTo(148.0f, 164.0f)
                lineTo(148.0f, 148.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.88f, -20.07f)
                lineTo(148.0f, 43.36f)
                lineTo(148.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.19f, -7.71f)
                lineToRelative(-104.0f, 124.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 148.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(16.0f)
                lineTo(16.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.37f, 19.5f)
                lineToRelative(29.6f, 37.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 51.84f, 228.0f)
                lineTo(204.16f, 228.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 15.61f, -7.51f)
                lineToRelative(29.6f, -37.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 250.82f, 170.8f)
                close()
                moveTo(188.87f, 124.0f)
                lineTo(148.0f, 124.0f)
                lineTo(148.0f, 79.0f)
                close()
                moveTo(57.73f, 124.0f)
                lineTo(124.0f, 45.0f)
                verticalLineToRelative(79.0f)
                close()
                moveTo(202.23f, 204.0f)
                lineTo(53.77f, 204.0f)
                lineTo(41.0f, 188.0f)
                lineTo(215.0f, 188.0f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null

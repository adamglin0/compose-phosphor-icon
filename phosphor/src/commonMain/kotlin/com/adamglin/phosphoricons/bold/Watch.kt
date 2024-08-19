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

public val BoldGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 128.0f)
                arcToRelative(79.85f, 79.85f, 0.0f, false, false, -27.95f, -60.68f)
                lineTo(173.0f, 28.43f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 153.32f, 12.0f)
                lineTo(102.68f, 12.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 83.0f, 28.43f)
                lineTo(76.0f, 67.32f)
                arcToRelative(79.84f, 79.84f, 0.0f, false, false, 0.0f, 121.36f)
                lineToRelative(7.0f, 38.89f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 102.68f, 244.0f)
                horizontalLineToRelative(50.64f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 173.0f, 227.57f)
                lineToRelative(7.05f, -38.89f)
                arcTo(79.85f, 79.85f, 0.0f, false, false, 208.0f, 128.0f)
                close()
                moveTo(106.0f, 36.0f)
                horizontalLineToRelative(44.0f)
                lineToRelative(2.9f, 16.0f)
                arcToRelative(79.76f, 79.76f, 0.0f, false, false, -49.76f, 0.0f)
                close()
                moveTo(150.0f, 220.0f)
                lineTo(106.0f, 220.0f)
                lineToRelative(-2.9f, -16.0f)
                arcToRelative(79.76f, 79.76f, 0.0f, false, false, 49.76f, 0.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 128.0f, 184.0f)
                close()
                moveTo(168.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(128.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(116.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 128.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null

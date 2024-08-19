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

public val BoldGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.26f, 186.1f)
                lineTo(152.81f, 34.23f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.74f, 28.74f, 0.0f, false, false, -49.62f, 0.0f)
                lineTo(15.74f, 186.1f)
                arcToRelative(27.45f, 27.45f, 0.0f, false, false, 0.0f, 27.71f)
                arcTo(28.31f, 28.31f, 0.0f, false, false, 40.55f, 228.0f)
                horizontalLineToRelative(174.9f)
                arcToRelative(28.31f, 28.31f, 0.0f, false, false, 24.79f, -14.19f)
                arcTo(27.45f, 27.45f, 0.0f, false, false, 240.26f, 186.1f)
                close()
                moveTo(219.46f, 201.8f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, true, -4.0f, 2.2f)
                lineTo(40.55f, 204.0f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, true, -4.0f, -2.2f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, true, 0.0f, -3.73f)
                lineTo(124.0f, 46.2f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, true, 8.0f, 0.0f)
                lineToRelative(87.44f, 151.87f)
                arcTo(3.56f, 3.56f, 0.0f, false, true, 219.46f, 201.8f)
                close()
                moveTo(116.0f, 136.0f)
                lineTo(116.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(144.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 176.0f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null

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

public val ThinGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 128.0f)
                arcToRelative(75.94f, 75.94f, 0.0f, false, false, -32.35f, -62.16f)
                lineToRelative(-6.52f, -36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 153.32f, 20.0f)
                lineTo(102.68f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.81f, 9.86f)
                lineToRelative(-6.52f, 36.0f)
                arcToRelative(75.89f, 75.89f, 0.0f, false, false, 0.0f, 124.32f)
                lineToRelative(6.52f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 102.68f, 236.0f)
                horizontalLineToRelative(50.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.81f, -9.86f)
                lineToRelative(6.52f, -36.0f)
                arcTo(75.94f, 75.94f, 0.0f, false, false, 204.0f, 128.0f)
                close()
                moveTo(98.74f, 31.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 102.68f, 28.0f)
                horizontalLineToRelative(50.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.94f, 3.29f)
                lineToRelative(5.26f, 29.0f)
                arcToRelative(75.69f, 75.69f, 0.0f, false, false, -69.0f, 0.0f)
                close()
                moveTo(157.26f, 224.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.29f)
                lineTo(102.68f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, -3.29f)
                lineToRelative(-5.26f, -29.0f)
                arcToRelative(75.69f, 75.69f, 0.0f, false, false, 69.0f, 0.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 196.0f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(128.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(124.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 128.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null

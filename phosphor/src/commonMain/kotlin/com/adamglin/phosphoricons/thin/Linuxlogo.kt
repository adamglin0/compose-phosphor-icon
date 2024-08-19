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

public val ThinGroup.Linuxlogo: ImageVector
    get() {
        if (_linuxlogo != null) {
            return _linuxlogo!!
        }
        _linuxlogo = Builder(name = "Linuxlogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.49f, 211.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.61f, -0.62f)
                curveTo(219.54f, 208.82f, 188.0f, 168.48f, 188.0f, 88.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 68.0f, 88.0f)
                curveToRelative(0.0f, 80.48f, -31.53f, 120.82f, -32.88f, 122.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.25f, -5.0f)
                curveTo(29.18f, 205.11f, 60.0f, 165.45f, 60.0f, 88.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveToRelative(0.0f, 40.48f, 8.47f, 70.27f, 15.57f, 88.14f)
                curveToRelative(7.69f, 19.35f, 15.48f, 29.27f, 15.56f, 29.36f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.49f, 211.12f)
                close()
                moveTo(100.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 92.0f)
                close()
                moveTo(164.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 100.0f)
                close()
                moveTo(97.79f, 132.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, 7.16f)
                lineToRelative(32.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                lineToRelative(32.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, -7.16f)
                lineTo(128.0f, 147.53f)
                close()
                moveTo(128.0f, 180.0f)
                arcToRelative(50.05f, 50.05f, 0.0f, false, false, -43.49f, 26.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.0f, 3.89f)
                arcToRelative(41.34f, 41.34f, 0.0f, false, true, 73.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 212.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 1.94f, -0.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.55f, -5.44f)
                arcTo(50.07f, 50.07f, 0.0f, false, false, 128.0f, 180.0f)
                close()
            }
        }
        .build()
        return _linuxlogo!!
    }

private var _linuxlogo: ImageVector? = null

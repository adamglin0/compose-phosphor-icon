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

public val BoldGroup.Personsimpleski: ImageVector
    get() {
        if (_personsimpleski != null) {
            return _personsimpleski!!
        }
        _personsimpleski = Builder(name = "Personsimpleski", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 92.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 176.0f, 92.0f)
                close()
                moveTo(176.0f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 52.0f)
                close()
                moveTo(28.48f, 80.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.88f, -8.16f)
                lineToRelative(67.5f, 19.68f)
                lineToRelative(8.66f, -8.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(165.0f, 112.0f)
                horizontalLineToRelative(35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(160.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.48f, -3.51f)
                lineToRelative(-4.89f, -4.89f)
                lineToRelative(-110.0f, -32.07f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.48f, 80.64f)
                close()
                moveTo(238.65f, 211.57f)
                arcTo(73.77f, 73.77f, 0.0f, false, true, 177.0f, 221.0f)
                lineTo(20.65f, 175.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 6.71f, -23.0f)
                lineToRelative(79.92f, 23.27f)
                lineToRelative(13.81f, -13.81f)
                lineTo(84.7f, 151.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 6.6f, -23.07f)
                lineToRelative(56.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.19f, 20.0f)
                lineTo(133.56f, 183.4f)
                lineTo(183.66f, 198.0f)
                arcToRelative(49.81f, 49.81f, 0.0f, false, false, 41.68f, -6.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.31f, 20.0f)
                close()
            }
        }
        .build()
        return _personsimpleski!!
    }

private var _personsimpleski: ImageVector? = null
